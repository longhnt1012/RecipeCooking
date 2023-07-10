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
import java.util.ArrayList;
import java.util.List;

import sample.CategoryOfRecipes.CategoryOfRecipesDAO;
import sample.CategoryOfRecipes.CategoryOfRecipesDTO;
import sample.category.CategoryDAO;
import sample.category.CategoryDTO;
import sample.recipe.RecipeDAO;
import sample.recipe.RecipeDTO;

/**
 *
 * @author Admin
 */
@WebServlet(name = "LoadCategoryOfRecipesController", urlPatterns = {"/LoadCategoryOfRecipesController"})
public class LoadCategoryOfRecipesController extends HttpServlet {

    private static final String SUCCESS = "tagCategoriesForRecipe.jsp";
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
        //category
        CategoryDAO categoryDao = new CategoryDAO();
        List<CategoryDTO> listcategory = new ArrayList<>();
        //recipe
        RecipeDAO recipeDao = new RecipeDAO();
        RecipeDTO recipe = new RecipeDTO();
        //categoryOfRecipe
        CategoryOfRecipesDAO corDao = new CategoryOfRecipesDAO();
        List<CategoryOfRecipesDTO> cor = new ArrayList<>();
        try {
            String recipeID = request.getParameter("recipeID");
            String action = request.getParameter("action");
            if ("Tag".equals(action)) {
                recipe = recipeDao.getOne(Integer.parseInt(recipeID));
                cor = corDao.getByRecipeID(Integer.parseInt(recipeID));
                listcategory = categoryDao.getListCategories();

                request.setAttribute("LIST_CATEGORY", listcategory);
                request.setAttribute("RECIPE", recipe);
                request.setAttribute("COR", cor);
                url = SUCCESS;
            }
        } catch (Exception e) {
            request.setAttribute("message", e);
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
