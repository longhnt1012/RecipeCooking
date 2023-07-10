/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author truc0
 */
public class MainController extends HttpServlet {

    private final static String ERROR="error.html";
    private final static String WELLCOME="login.html";
    private final static String LOGIN="Log In";
    private final static String LOGIN_CONTROLLER="LoginController";
    private final static String SEARCH="SearchHome";
    private final static String SEARCH_CONTROLLER="SearchHomeController";
    private final static String LOGIN_GMAIL_CONTROLLER="https://accounts.google.com/o/oauth2/auth?scope=profile&redirect_uri=http://localhost:8084/PRI301_3BW_SP23_JSP_JSTL/LoginGoogleServlet&response_type=code&client_id=212109708525-gfv9i56jfe3f8ji2cvh13u19o0durodt.apps.googleusercontent.com&approval_prompt=force";
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url=ERROR;
        try {
            String action=request.getParameter("action");
            if(action==null){
                url=WELLCOME;
            }else if(LOGIN.equals(action)){
                url=LOGIN_CONTROLLER;
            }else if(SEARCH.equals(action)){
                url=SEARCH_CONTROLLER;
            }
        } catch (Exception e) {
            log("Error at MainController:" + e.toString());
        }finally{
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
