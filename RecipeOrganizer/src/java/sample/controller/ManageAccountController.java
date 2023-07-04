/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import sample.user.UserDAO;
import sample.user.UserDTO;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ManageAccountController", urlPatterns = {"/ManageAccountController"})
public class ManageAccountController extends HttpServlet {
    
    private static final String ERROR = "error.jsp";
    private static final String SUCCESS = "LoadUsersController";

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
        String url = ERROR;
        UserDTO user = new UserDTO();
        UserDAO dao = new UserDAO();
        try {
            String userID = request.getParameter("userID");
            String action = request.getParameter("action");
            if(action.equals("Block")) {
                user = dao.getOne(Integer.parseInt(userID));
                if (user != null) {
                    user.setStatus(false);
                    if (dao.update(user)) {
                        url = SUCCESS;
                    } else {
                        url = ERROR;
                    }
                } else {
                    url = ERROR;
                }
            } else if (action.equals("Unblock")) {
                user = dao.getOne(Integer.parseInt(userID));
                if (user != null) {
                    user.setStatus(true);
                    if (dao.update(user)) {
                        url = SUCCESS;
                    } else {
                        url = ERROR;
                    }
                } else {
                    url = ERROR;
                }
            } else if (action.equals("Detail")) {
                user = dao.getOne(Integer.parseInt(userID));
                if (user != null) {
                    request.setAttribute("user_detail", user);
                    url = "userDetail.jsp";
                }
            }
        } catch (Exception e) {
            request.setAttribute("message", "Co loi tai readUserController");
        } finally {
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
