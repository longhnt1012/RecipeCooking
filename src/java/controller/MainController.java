/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import swp.ro.Recipe.RecipeDAO;
import swp.ro.Recipe.RecipeDTO;
import swp.ro.rating.RatingDAO;
import swp.ro.rating.RatingDTO;

/**
 *
 * @author nguyentruc
 */
@WebServlet(name = "MainController", urlPatterns = {"/MainController"})
public class MainController extends HttpServlet {

    private final static String ERROR="error.html";
    private final static String WELLCOME="mainPage.jsp";
    private final static String CREATE_RECIPE="CreateRecipe";
    private final static String CREATE_RECIPE_CONTROLLER="CreateRecipeController";
    private final static String LOGIN="Login";
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
                RecipeDAO dao = new RecipeDAO();
                RatingDAO daoRating = new RatingDAO();
                List<RecipeDTO> list = dao.getListRecipeHome();
                Map<String, Double> listRating = daoRating.getListRating();
                Map<String, Integer> listTotalRating = daoRating.getTotalRating();
                HttpSession session=request.getSession();
                session.setAttribute("SEARCH_LIST_NAME_RECIPE", list); 
                session.setAttribute("LIST_RATING_RECIPE", listRating);
                session.setAttribute("LIST_TOTAL_RATING", listTotalRating);
                url=WELLCOME;
            }else if(LOGIN.equals(action)){
                url=LOGIN_CONTROLLER;
            }else if(SEARCH.equals(action)){
                url=SEARCH_CONTROLLER;
            }else if(CREATE_RECIPE.equals(action)){
                url=CREATE_RECIPE_CONTROLLER;
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
