/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sample.user.UserDAO;
import sample.user.UserDTO;

/**
 *
 * @author Admin
 */
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {
    private static final String LOGIN_PAGE = "views/login.jsp";
    private static final String US = "US";
    private static final String US_PAGE = "views/user.jsp";
    private static final String AD = "AD";
    private static final String AD_PAGE = "views/admin.jsp";
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
        String url=LOGIN_PAGE;
        try {
            String userID= request.getParameter("userID");
            String password= request.getParameter("password");
            UserDAO dao= new UserDAO();
            UserDTO loginUser= dao.checklogin(userID, password);
            //xac thuc
            if (loginUser==null) {
                request.setAttribute("ERROR", "incorrect userID or password");
            } else {
                //PHAN QUYEN
                HttpSession session= request.getSession();
                session.setAttribute("LOGIN_USER", loginUser);
                String roleID= loginUser.getRole();
                if (US.equals(roleID)) {
                    url=US_PAGE;
                } else if (AD.equals(roleID)) {
                    url=AD_PAGE;
                } else {
                    request.setAttribute("ERROR", "Your role is not support");
                }
            }
        } catch (Exception e) {
            log("ERROR at LoginController"+e.toString());
        } finally{
            request.getRequestDispatcher(url).forward(request, response);
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

}
