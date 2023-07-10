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
import java.io.PrintWriter;
import sample.recipe.RecipeDAO;
import sample.recipe.RecipeDTO;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ManageRecipeController", urlPatterns = {"/ManageRecipeController"})
public class ManageRecipeController extends HttpServlet {
    private static final String SUCCESS = "LoadRecipesController";
    private static final String ERROR = "error.jsp";
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
        RecipeDAO dao = new RecipeDAO();
        RecipeDTO recipe = new RecipeDTO();
        try {
            String recipeID = request.getParameter("recipeID");
            String action = request.getParameter("action");
            if ("Block".equals(action)) {
                recipe = dao.getOne(Integer.parseInt(recipeID));
                if (recipe != null) {
                    recipe.setStatus(0);
                    if (dao.update(recipe)) {
                        url = SUCCESS;
                    } else {
                        url = ERROR;
                    }
                } else {
                    url = ERROR;
                }
            } else if ("Unblock".equals(action)) {
                recipe = dao.getOne(Integer.parseInt(recipeID));
                if (recipe != null) {
                    recipe.setStatus(1);
                    if (dao.update(recipe)) {
                        url = SUCCESS;
                    } else {
                        url = ERROR;
                    }
                } else {
                    url = ERROR;
                }
            } else if (action.equals("Detail")) {
                recipe = dao.getOne(Integer.parseInt(recipeID));
                request.setAttribute("recipeDetail", recipe);
                url = "recipeDetail.jsp";
            } else if (action.equals("Delete")) {
                boolean checkDelete = dao.removeRecipe(Integer.parseInt(recipeID));
                if (checkDelete) {
                    url = SUCCESS;
                    request.setAttribute("message", "alert('Delete Success')");
                } else {
                    request.setAttribute("message", "Delete fail");
                }
            }
        } catch (Exception e) {
            request.setAttribute("message", "Error at ManageRecipeController");
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
