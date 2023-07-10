/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * SearchByCategory
 *
 * @author Admin
 */
@WebServlet(name = "MainController", urlPatterns = {"/MainController"})
public class MainController extends HttpServlet {

    private static final String LOGIN_PAGE = "loginPage.jsp";
    private static final String LOGIN = "Login";
    private static final String LOGIN_CONTROLLER = "LoginController";
    private static final String CREATERECIPE = "Create";
    private static final String CREATERECIPE_CONTROLLER = "CreateController";
    private static final String LOAD_CATEGORY = "LoadCategories";
    private static final String LOAD_CATEGORY_CONTROLLER = "LoadCategoriesController";
    private static final String SEARCH_BY_CATEGORY = "SearchByCategory";
    private static final String SEARCH_BY_CATEGORY_CONTROLLER = "SearchByCategoryController";
    private static final String LOAD_USERS = "LoadUsers";
    private static final String LOAD_USERS_CONTROLLER = "LoadUsersController";
    private static final String LOAD_RECIPES = "LoadRecipes";
    private static final String LOAD_RECIPES_CONTROLLER = "LoadRecipesController";
    private static final String LOAD_FEEDBACKS = "LoadFeedbacks";
    private static final String LOAD_FEEDBACKS_CONTROLLER = "LoadFeedbacksController";
    private static final String LOAD_CATEGORY_OF_RECIPE = "LoadCategoryOfRecipe";
    private static final String LOAD_CATEGORY_OF_RECIPE_CONTROLLER = "LoadCategoryOfRecipeController";

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
        String url = LOGIN_PAGE;
        try {
            String action = request.getParameter("action");
            if (action == null) {
                url = LOGIN_PAGE;
            } else if (LOGIN.equals(action)) {
                url = LOGIN_CONTROLLER;
            } else if (CREATERECIPE.equals(action)) {
                url = CREATERECIPE_CONTROLLER;
            } else if (SEARCH_BY_CATEGORY.equals(action)) {
                url = SEARCH_BY_CATEGORY_CONTROLLER;
            }else if (LOAD_CATEGORY.equals(action)) {
                url = LOAD_CATEGORY_CONTROLLER;
            } else if (LOAD_USERS.equals(action)) {
                url = LOAD_USERS_CONTROLLER;
            } else if (LOAD_RECIPES.equals(action)) {
                url = LOAD_RECIPES_CONTROLLER;
            } else if (LOAD_FEEDBACKS.equals(action)) {
                url = LOAD_FEEDBACKS_CONTROLLER;
            } else if (LOAD_CATEGORY_OF_RECIPE.equals(action)) {
                url = LOAD_CATEGORY_OF_RECIPE_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your ACTIOIN is not support");
            }
        } catch (Exception e) {
            log("Error at: MainController" + e.toString());
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
