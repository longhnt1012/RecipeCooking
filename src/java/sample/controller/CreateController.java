/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Time;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.recipe.RecipeDAO;
import sample.recipe.RecipeDTO;

/**
 *
 * @author Admin
 */
@WebServlet(name = "CreateController", urlPatterns = {"/CreateController"})
public class CreateController extends HttpServlet {

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
        String url = null;
        try {
            String recipeID = request.getParameter("recipeID");
            String recipeName = request.getParameter("fullName");
            String cookingTime = request.getParameter("cookingTime");
            int difficultyLevel = Integer.parseInt(request.getParameter("difficultyLevel"));
            String instruction = request.getParameter("instruction");
            String userID = request.getParameter("userID");
            String picture = request.getParameter("picture");

            //validation
            RecipeDAO dao = new RecipeDAO();
            boolean checkValidation = true;
            if (userID.length() > 10 || userID.length() < 2) {
                checkValidation = false;
            }
            if (recipeID.length() > 10 || recipeID.length() < 2) {
                checkValidation = false;
            }
            if (checkValidation) {
                RecipeDTO recipe = new RecipeDTO(recipeID, recipeName, cookingTime, difficultyLevel, instruction, userID, picture);
                boolean checkInsert = dao.insert(recipe);
                if (checkInsert) {
                    url = "views/admin.jsp";
                } else {
                    url = "views/user.jsp";
                }
            } else {
                request.setAttribute("ERROR", "Error");
            }
        } catch (Exception e) {
            request.setAttribute("ERROR", "Unknow Error");
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
