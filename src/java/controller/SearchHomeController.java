/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import swp.ro.FavoriteRecipes.FavoriteRecipesDAO;
import swp.ro.Recipe.RecipeDAO;
import swp.ro.Recipe.RecipeDTO;
import swp.ro.User.UserDAO;
import swp.ro.User.UserDTO;

 /*
 * @author truc0
 */
@WebServlet(name = "SearchHomeController", urlPatterns = {"/SearchHomeController"})
public class SearchHomeController extends HttpServlet {
    private static final String SEARCH="searchPage.jsp";
    //private static final String SEARCH="newjsp.jsp";
    private static final String ERROR="mainPage.jsp";
    private static final String SEARCH_RECIPE="recipeDetail.html";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            
            String search = request.getParameter("search");
            String searchRecipe = request.getParameter("searchRecipe");
            String searchCategory = request.getParameter("searchCategory");
            RecipeDAO daoRecipe = new RecipeDAO();
            UserDAO daoUser = new UserDAO();
            FavoriteRecipesDAO daoFavority = new FavoriteRecipesDAO();
            if(search!=null){
                List<RecipeDTO> listRecipe = daoRecipe.getListSearchRecipe(search);
                List<UserDTO> listUser = daoUser.getListSearchUser(search);
                Map<Integer, Integer> favority = daoFavority.getListLike(listRecipe);
                request.setAttribute("SEARCH", search);
                request.setAttribute("SEARCH_LIST_RECIPE", listRecipe);
                request.setAttribute("SEARCH_LIST_USER", listUser);
                request.setAttribute("SEARCH_LIST_FAVORITY", favority);
                url=SEARCH;
            }
            if(searchCategory!=null){
                List<RecipeDTO> listRecipe = daoRecipe.getListCategotyRecipe(searchCategory);
                List<UserDTO> listUser = daoUser.getListCategoryUser(searchCategory);
                Map<Integer, Integer> favority = daoFavority.getListLike(listRecipe);
                int count = daoFavority.getTotalCommentsForRecipe(1);
                request.setAttribute("SEARCH", searchCategory);
                request.setAttribute("SEARCH_LIST_RECIPE", listRecipe);
                request.setAttribute("SEARCH_LIST_USER", listUser);
                request.setAttribute("SEARCH_LIST_FAVORITY", favority);
                url=SEARCH;
            }
            if(searchRecipe!=null){
                String recipe = daoRecipe.getSearchRecipe(searchRecipe);
                request.setAttribute("SEARCH_RECIPE", recipe);
                url=SEARCH_RECIPE;
            }
        } catch (Exception e) {
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
