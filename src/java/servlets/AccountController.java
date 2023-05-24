/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import db.Account;
import db.AccountFacade;
import java.io.IOException;
import java.sql.SQLException;
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
@WebServlet(name = "AccountController", urlPatterns = {"/account"})
public class AccountController extends HttpServlet {

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
            case "login":
                request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
                break;

            case "login_handler":
                login_handler(request, response);
                break;

            case "logout":
                logout_handler(request, response);

            case "signUp":
                request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
                break;

            case "signUp_handler":
                signUp_handler(request, response);
                break;

            case "editProfile":
                request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
                break;

            case "editProfile_handler":
                editProfile_handler(request, response);
                break;

            case "changePass":
                request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
                break;

            case "changePass_handler":
                changePass_handler(request, response);
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

    protected void login_handler(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String op = request.getParameter("op");
        HttpSession session = request.getSession();
        switch (op) {
            case "login":
                try {
                    String email = request.getParameter("email");
                    String password = request.getParameter("password");
                    AccountFacade af = new AccountFacade();
                    Account account = af.login(email, password);
                    if (account != null) {
                        session.setAttribute("account", account);
                        response.sendRedirect(request.getContextPath() + "/home/success.do");
                    } else {
                        request.setAttribute("message", "Incorrect email or password");
                        request.getRequestDispatcher("/account/login.do").forward(request, response);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    response.sendRedirect(request.getContextPath() + "/account/login.do");
                }
                break;

            case "cancel":
                response.sendRedirect(request.getContextPath() + "/home/index.do");
                break;
        }
    }

    protected void logout_handler(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        session.invalidate();
        request.getRequestDispatcher("/home/index.do").forward(request, response);
    }

    protected void signUp_handler(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String op = request.getParameter("op");
        switch (op) {
            case "signUp": {
                try {
                    String name = request.getParameter("name");
                    String address = request.getParameter("address");
                    String email = request.getParameter("email");
                    String password = request.getParameter("password");
                    String repassword = request.getParameter("repassword");
                    String phone = request.getParameter("phone");

                    AccountFacade af = new AccountFacade();
                    Account account = af.checkEmail(email);
                    if (!password.equals(repassword) && account != null) {
                        request.setAttribute("message", "The password not match and password does not match");
                        request.getRequestDispatcher("/account/signUp.do").forward(request, response);
                    } else if (!password.equals(repassword)) {
                        request.setAttribute("message", "The password not match");
                        request.getRequestDispatcher("/account/signUp.do").forward(request, response);
                    } else {
                        if (account == null) {
                            af.signUp(name, address, phone, email, password);
                            response.sendRedirect(request.getContextPath() + "/home/index.do");
                        } else {
                            request.setAttribute("message", "Email has been signed up");
                            request.getRequestDispatcher("/account/signUp.do").forward(request, response);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            break;
            case "cancel":
                response.sendRedirect(request.getContextPath() + "/home/index.do");
        }
    }

    protected void editProfile_handler(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String op = request.getParameter("op");
        switch (op) {
            case "confirm": {
                try {
                    int id = Integer.parseInt(request.getParameter("id"));
                    String email = request.getParameter("email");
                    String password = request.getParameter("password");
                    String role = request.getParameter("role");

                    String newAddress = request.getParameter("newAddress");
                    String newName = request.getParameter("newName");
                    String newPhone = request.getParameter("newPhone");

                    request.setAttribute("email", email);
                    request.setAttribute("newAddress", newAddress);
                    request.setAttribute("newName", newName);
                    request.setAttribute("newPhone", newPhone);

                    AccountFacade af = new AccountFacade();
                    Account account = null;
                    if (newAddress != null || newName != null || newPhone != null) {
                        account = new Account(id, newName, newAddress, newPhone, email, password, role);
                        af.update(newName, newAddress, newPhone, id);
                        request.getSession().setAttribute("account", account);
                        response.sendRedirect(request.getContextPath() + "/home/success.do");
                    } else {
                        request.setAttribute("message", "Plz must fill the box");
                        request.getRequestDispatcher("/account/editProfile.do").forward(request, response);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            break;

            case "cancel":
                response.sendRedirect(request.getContextPath() + "/home/success.do");
                break;
        }
    }

    protected void changePass_handler(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String op = request.getParameter("op");
        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("account");
        switch (op) {
            case "change":
                try {
                    int id = Integer.parseInt(request.getParameter("id"));
                    String oldPassword = request.getParameter("oldPassword");
                    String newPassword = request.getParameter("newPassword");
                    String reNewPassword = request.getParameter("reNewPassword");
                    request.setAttribute("oldPassword", oldPassword);
                    request.setAttribute("newPassword", newPassword);
                    request.setAttribute("reNewPassword", reNewPassword);
                    AccountFacade af = new AccountFacade();
                    if (account == null) {
                        request.setAttribute("message", "The old password wrong");
                        request.getRequestDispatcher("/account/changePass.do").forward(request, response);
                    } else {
                        if (newPassword == null || reNewPassword == null) {
                            request.setAttribute("message", "Plz fill the box");
                            request.getRequestDispatcher("/account/changePass.do").forward(request, response);
                        } else if (oldPassword.equals(newPassword)) {
                            request.setAttribute("message", "The password the same");
                            request.getRequestDispatcher("/account/changePass.do").forward(request, response);
                        } else if (!newPassword.equals(reNewPassword)) {
                            request.setAttribute("message", "The new password must the same");
                            request.getRequestDispatcher("/account/changePass.do").forward(request, response);
                        } else {
                            af.changePass(newPassword, id);
                            request.getSession().invalidate();
                            response.sendRedirect(request.getContextPath() + "/home/index.do");
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case "cancel":
                response.sendRedirect(request.getContextPath() + "/home/success.do");
                break;
        }
    }

}
