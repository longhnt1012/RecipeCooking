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
            List<Product> list = pf.getAll();
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
}
