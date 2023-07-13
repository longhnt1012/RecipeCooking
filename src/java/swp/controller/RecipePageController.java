/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import swp.ro.Recipe.RecipeDAO;
import swp.ro.Recipe.RecipeDTO;

/**
 *
 * @author Thành Long
 */
@WebServlet(name = "RecipePageController", urlPatterns = {"/RecipePageController"})
public class RecipePageController extends HttpServlet {
    private static final String SUCCESS="recipePage.jsp";
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
         String url=SUCCESS;
         try {
            RecipeDAO rDAO = new RecipeDAO();
            String indexPage = request.getParameter("page");
            if (indexPage == null) {
                indexPage = "1";
            }
            int page = Integer.parseInt(indexPage);
            int count = rDAO.countPro();
            int endP = count / 9;
            if (count % 9 != 0) {
                endP++;
            }
            List<RecipeDTO> list = rDAO.pageIndex(page);
            request.setAttribute("endP", endP);
            request.setAttribute("page", page);
            request.setAttribute("list", list);
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception e) {
            
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
