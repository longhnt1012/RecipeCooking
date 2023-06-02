/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import db.Account;
import db.AccountFacade;
import db.Comments;
import db.CommentsFacade;
import db.Product;
import db.ProductFacade;
import java.io.IOException;
import java.sql.SQLException;
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
@WebServlet(name = "AdminController", urlPatterns = {"/admin"})
public class AdminController extends HttpServlet {

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
        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("account");
        if (account != null && account.getRole().equalsIgnoreCase("ADMIN")) {
            try {
                switch (action) {
                    case "crudAcc": {
                        crudAcc(request, response);
                        break;
                    }

                    case "manaCmts": {
                        manaCmts(request, response);
                        break;
                    }

                    case "removeCmts": {
                        removeCmts(request, response);
                        break;
                    }

                    case "edit": {
                        edit(request, response);
                        break;
                    }

                    case "edit_handler": {
                        edit_handler(request, response);
                        break;
                    }

                    case "remove": {
                        remove(request, response);
                        break;
                    }

                    case "crudPro": {
                        crudPro(request, response);
                        break;
                    }

                    case "deletePro": {
                        deletePro(request, response);
                        break;
                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
                request.setAttribute("controller", "error");
                request.setAttribute("action", "error");
                request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("controller", "error");
            request.setAttribute("action", "error");
            request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
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

    protected void crudAcc(HttpServletRequest request, HttpServletResponse response) {
        try {
            AccountFacade af = new AccountFacade();
            String indexPage = request.getParameter("page");
            if (indexPage == null) {
                indexPage = "1";
            }
            int page = Integer.parseInt(indexPage);
            int count = af.getAllAcc();
            int endP = count / 8;
            if (count % 8 != 0) {
                endP++;
            }
            List<Account> list = af.pageIndex(page);
            request.setAttribute("endP", endP);
            request.setAttribute("list", list);
            request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void edit(HttpServletRequest request, HttpServletResponse response) {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            AccountFacade af = new AccountFacade();
            Account account = af.checkInf(id);
            request.setAttribute("account", account);
            request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void edit_handler(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String op = request.getParameter("op");
//        Pattern p = Pattern.compile("^(USER|ADMIN)$");
        switch (op) {
            case "confirm":
                try {
                    String url = "/admin/edit.do";
                    int id = Integer.parseInt(request.getParameter("id"));
                    String newName = request.getParameter("newName");
                    String newAddress = request.getParameter("newAddress");
                    String newPhone = request.getParameter("newPhone");
                    String newEmail = request.getParameter("newEmail");
                    String newPassword = request.getParameter("newPassword");
                    String reNewPassword = request.getParameter("reNewPassword");
                    String newRole = request.getParameter("newRole");
                    //AccountDAO dao = new AccountDAO();
                    AccountFacade af = new AccountFacade();
                    if (!newPassword.equals(reNewPassword)) {
                        request.setAttribute("message", "The password not match");
                        Account account1 = new Account(id, newName, newAddress, newPhone, newEmail, newPassword, newRole);
                        request.setAttribute("account", account1);
//                        request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
//                        } else if (!p.matcher(newRole).find()) {
//                            request.setAttribute("message", "Wrong format");
//                            request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
                    } else {
                        Account account = new Account(id, newName, newAddress, newPhone, newEmail, newPassword, newRole);
                        af.updateByAdmin(newName, newAddress, newPhone, newEmail, newPassword, newRole, id);
//                        request.setAttribute("account", account);
//                        url = "/admin/crud.do";
                        response.sendRedirect(request.getContextPath() + "/admin/crudAcc.do");
                    }
                    request.getRequestDispatcher(url).forward(request, response);

                } catch (Exception e) {
                    e.printStackTrace();
                    request.setAttribute("controller", "error");
                    request.setAttribute("action", "error");
                    request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
                }
                break;

            case "cancel": {
                response.sendRedirect(request.getContextPath() + "/admin/crudAcc.do");
                break;
            }
        }
    }

    protected void remove(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            AccountFacade af = new AccountFacade();
            af.remove(id);
            response.sendRedirect(request.getContextPath() + "/admin/crudAcc.do");

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("controller", "error");
            request.setAttribute("action", "error");
            request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
        }
    }

    protected void manaCmts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            CommentsFacade cf = new CommentsFacade();
            List<Comments> listComments = cf.getAllComments();
            request.setAttribute("comments", listComments);
            request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("controller", "error");
            request.setAttribute("action", "error");
            request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
        }
    }

    protected void removeCmts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            CommentsFacade cf = new CommentsFacade();
            cf.removeCmts(id);
            response.sendRedirect(request.getContextPath() + "/admin/manaCmts.do");
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("controller", "error");
            request.setAttribute("action", "error");
            request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
        }
    }

    private void crudPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
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
            request.setAttribute("controller", "error");
            request.setAttribute("action", "error");
            request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);

        }
    }

    protected void deletePro(HttpServletRequest request, HttpServletResponse response) {
        Account account = (Account) request.getSession().getAttribute("account");
        String op = request.getParameter("op");
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            ProductFacade pf = new ProductFacade();
            pf.deletePro(id);
            response.sendRedirect(request.getContextPath() + "/home/success.do");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
