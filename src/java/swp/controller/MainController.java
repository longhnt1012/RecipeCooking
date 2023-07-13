/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import swp.ro.Recipe.RecipeDAO;
import swp.ro.Recipe.RecipeDTO;
import swp.ro.rating.RatingDAO;

/**
 *
 * @author Thành Long
 */
public class MainController extends HttpServlet {

    private static final String ERROR = "error.jsp";
    private static final String MAIN_PAGE = "mainpage.jsp";
    private static final String LOGIN = "Login";
    private static final String LOGIN_CONTROLLER = "LoginController";
    private static final String LOGOUT = "LogOut";
    private static final String LOGOUT_CONTROLLER = "LogoutController";
    private static final String SEARCH = "Search";
    private static final String SEARCH_CONTROLLER = "SearchController";
    private static final String FEEDBACK = "Feedback";
    private static final String FEEDBACK_CONTROLLER = "FeedBackController";
    private static final String FAVORITE = "Favorite";
    private static final String FAVORITE_CONTROLLER = "FavoriteRecipesController";
    private static final String REMOVE = "Remove";
    private static final String REMOVE_CONTROLLER = "RemoveController";
    private static final String RATING = "Rating";
    private static final String RATING_CONTROLLER = "RatingController";
    private static final String RECIPE_DETAIL = "RecipeDetail";
    private static final String RECIPE_DETAIL_CONTROLLER = "RecipeDetailController";
    private static final String CHANGE_PASSWORD = "ChangePassword";
    private static final String CHANGE_PASSWORD_CONTROLLER = "ChangePasswordController";
    private static final String RECIPE_PAGE = "RecipePage";
    private static final String RECIPE_PAGE_CONTROLLER = "RecipePageController";
    private static final String ADD_RECIPE = "Add Recipe";
    private static final String ADD_RECIPE_CONTROLLER = "AddRecipeController";
    private static final String SAVED_RECIPE = "SavedRecipe";
    private static final String SAVED_RECIPE_CONTROLLER = "SavedRecipeController";
    private static final String REMOVE_SAVED_RECIPE = "RemoveSavedRecipe";
    private static final String REMOVE_SAVED_RECIPE_CONTROLLER = "RemoveSavedRecipeController";
    private static final String REMOVE_FAVORITE_RECIPE = "RemoveFavoriteRecipe";
    private static final String REMOVE_FAVORITE_RECIPE_CONTROLLER = "RemoveFavoriteRecipeController";
    private static final String SAVED_PAGE = "SavedPage";
    private static final String SAVED_PAGE_CONTROLLER = "SavedPageController";
    private static final String REMOVE_FROM_SAVED = "RemoveFromSaved";
    private static final String REMOVE_FROM_SAVED_CONTROLLER="RemoveFromSavedController";
    private static final String FAVORITE_PAGE = "FavoritePage";
    private static final String FAVORITE_PAGE_CONTROLLER = "FavoritePageController";
    private static final String REMOVE_FROM_FAVPROTE = "RemoveFromFavorite";
    private static final String REMOVE_FROM_FAVORITE_CONTROLLER = "RemoveFromFavoriteController";
    private static final String PLANNING_PAGE="PlanningPage";
    private static final String PLANNING_PAGE_CONTROLLER="PlanningPageController";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            String action = request.getParameter("action");
            if (action == null) {
                RecipeDAO dao = new RecipeDAO();
                RatingDAO daoRating = new RatingDAO();
                List<RecipeDTO> list = dao.getListRecipeHome();
                Map<String, Integer> listRating = daoRating.getListRating();
                Map<String, Integer> listTotalRating = daoRating.getTotalRating();
                HttpSession session = request.getSession();
                session.setAttribute("SEARCH_LIST_NAME_RECIPE", list);
                session.setAttribute("LIST_RATING_RECIPE", listRating);
                session.setAttribute("LIST_TOTAL_RATING", listTotalRating);
                url = MAIN_PAGE;
            } else if (LOGIN.equals(action)) {
                url = LOGIN_CONTROLLER;
            } else if (LOGOUT.equals(action)) {
                url = LOGOUT_CONTROLLER;
            } else if (SEARCH.equals(action)) {
                url = SEARCH_CONTROLLER;
            } else if (FEEDBACK.equals(action)) {
                url = FEEDBACK_CONTROLLER;
            } else if (SAVED_RECIPE.equals(action)) {
                url = SAVED_RECIPE_CONTROLLER;
            } else if (FAVORITE.equals(action)) {
                url = FAVORITE_CONTROLLER;
            } else if (REMOVE.equals(action)) {
                url = REMOVE_CONTROLLER;
            } else if (RATING.equals(action)) {
                url = RATING_CONTROLLER;
            } else if (CHANGE_PASSWORD.equals(action)) {
                url = CHANGE_PASSWORD_CONTROLLER;
            } else if (RECIPE_DETAIL.equals(action)) {
                url = RECIPE_DETAIL_CONTROLLER;
            } else if (RECIPE_PAGE.equals(action)) {
                url = RECIPE_PAGE_CONTROLLER;
            } else if (ADD_RECIPE.equals(action)) {
                url = ADD_RECIPE_CONTROLLER;
            } else if (REMOVE_SAVED_RECIPE.equals(action)) {
                url = REMOVE_SAVED_RECIPE_CONTROLLER;
            } else if (REMOVE_FAVORITE_RECIPE.equals(action)) {
                url = REMOVE_FAVORITE_RECIPE_CONTROLLER;
            } else if (SAVED_PAGE.equals(action)) {
                url = SAVED_PAGE_CONTROLLER;
            }else if(REMOVE_FROM_SAVED.equals(action)){
                url=REMOVE_FROM_SAVED_CONTROLLER;
            }else if(FAVORITE_PAGE.equals(action)){
                url=FAVORITE_PAGE_CONTROLLER;
            }else if(REMOVE_FROM_FAVPROTE.equals(action)){
                url=REMOVE_FROM_FAVORITE_CONTROLLER;
            }else if(PLANNING_PAGE.equals(action)){
                url=PLANNING_PAGE_CONTROLLER;
            }
            else {
                request.setAttribute("ERROR", "Your ACTION is not support!!!");
            }
        } catch (Exception e) {
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
