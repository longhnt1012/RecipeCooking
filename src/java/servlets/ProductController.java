/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import db.Account;
import db.Comments;
import db.CommentsFacade;
import db.Product;
import db.ProductFacade;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author phamt
 */
@WebServlet(name = "ProductController", urlPatterns = {"/product"})
public class ProductController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String controller = (String) request.getAttribute("controller");
        String action = (String) request.getAttribute("action");

        switch (action) {
            case "product":
                product(request, response);
                break;

            case "addPro":
                addPro(request, response);
                break;

            case "addPro_handler":
                addPro_handler(request, response);
                break;

            case "updatePro":
                updatePro(request, response);
                break;

            case "updatePro_handler":
                updatePro_handler(request, response);
                break;

            case "deletePro":
                deletePro(request, response);

            case "detail":
                detail(request, response);
                break;

            case "addComments":
                addComments(request, response);
                break;
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    protected void product(HttpServletRequest request, HttpServletResponse response) {
        try {
            ProductFacade pf = new ProductFacade();
            String indexPage = request.getParameter("page");
            if (indexPage == null) {
                indexPage = "1";
            }
            int page = Integer.parseInt(indexPage);
            int count = pf.countPro();
            int endP = count / 8;
            if (count % 8 != 0) {
                endP++;
            }
            List<Product> list = pf.pageIndex(page);
            request.setAttribute("endP", endP);
            request.setAttribute("list", list);
            request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void detail(HttpServletRequest request, HttpServletResponse response) {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            ProductFacade pf = new ProductFacade();
            Product product = pf.getOne(id);
            CommentsFacade cf = new CommentsFacade();
            List<Comments> listComments = cf.getComments(id);
            request.setAttribute("comments", listComments);
            request.setAttribute("noCmts", listComments.size());
            request.setAttribute("product", product);
            request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void addComments(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("account");
        int productId = Integer.parseInt(request.getParameter("productId"));
        try {
            if (account == null) {
                request.setAttribute("message", "Login to comment");
                request.getRequestDispatcher("/product/detail.do?id=" + productId).forward(request, response);
            } else {
                int userId = Integer.parseInt(request.getParameter("userId"));
                String content = request.getParameter("content");
                String username = request.getParameter("username");
                Date curDate = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                CommentsFacade cf = new CommentsFacade();
                Comments c = new Comments();
                c.setContent(content);
                c.setDate(curDate);
                c.setUserId(userId);
                c.setProductId(productId);
                c.setUsername(username);
                cf.addComments(c);
                response.sendRedirect(request.getContextPath() + "/product/detail.do?id=" + productId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //ADD FOR USER
    protected void addPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("account");
        if (account == null) {
            request.setAttribute("controller", "error");
            request.setAttribute("action", "error");
            request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
        }
    }

    //ADD FOR USER
    protected void addPro_handler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("account");
        String op = request.getParameter("op");
        try {
            if (account == null) {
                request.setAttribute("message", "Login to Add Product plz");
                request.getRequestDispatcher(request.getContextPath() + "/home/index.do").forward(request, response);
            } else {
                switch (op) {
                    case "Add":
                        try {
                            String name = request.getParameter("name");
                            String description = request.getParameter("description");
                            ProductFacade pf = new ProductFacade();
                            Product product = pf.addPro(name, description);
                            response.sendRedirect(request.getContextPath() + "/home/success.do");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;

                    case "Cancel":
                        response.sendRedirect(request.getContextPath() + "/home/success.do");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("message", e.getMessage());
            request.setAttribute("controller", "error");
            request.setAttribute("action", "error");
            request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
        }

    }

    //UPDATE FOR USER
    protected void updatePro(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Account account = (Account) request.getSession().getAttribute("account");
        if (account == null) {
            request.setAttribute("controller", "error");
            request.setAttribute("action", "error");
            request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
        } else {
            try {
                int id = Integer.parseInt(request.getParameter("id"));
                ProductFacade pf = new ProductFacade();
                Product product = pf.getOne(id);
                request.setAttribute("product", product);
                request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
            } catch (Exception e) {
            }
        }
    }

    //UPDATE FOR USER
    protected void updatePro_handler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Account account = (Account) request.getSession().getAttribute("account");
        String op = request.getParameter("op");
        if (account == null) {
            request.setAttribute("controller", "error");
            request.setAttribute("action", "error");
            request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
        } else {
            switch (op) {
                case "update":
                    try {
                        int id = Integer.parseInt(request.getParameter("id"));
                        String name = request.getParameter("name");
                        String description = request.getParameter("description");
                        ProductFacade pf = new ProductFacade();
                        Product product = new Product(id, description, name);
                        pf.updatePro(description, name);
                        response.sendRedirect(request.getContextPath() + "/home/success");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }

    //DELETE FOR USER
    protected void deletePro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Account account = (Account) request.getSession().getAttribute("account");
        String op = request.getParameter("op");
        try {
            if (account == null) {
                request.setAttribute("controller", "error");
                request.setAttribute("action", "error");
                request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
            } else {
                int id = Integer.parseInt(request.getParameter("id"));
                ProductFacade pf = new ProductFacade();
                pf.deletePro(id);
                response.sendRedirect(request.getContextPath() + "/admin/crudPro.do");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
