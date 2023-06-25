/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import swp.ro.Recipe.RecipeDAO;
import swp.ro.Recipe.RecipeDTO;

 /*
 * @author truc0
 */
@WebServlet(name = "SearchHomeController", urlPatterns = {"/SearchHomeController"})
public class SearchHomeController extends HttpServlet {
    private static final String SEARCH="searchRecipe.html";
    private static final String ERROR="mainpage.html";
    private static final String SEARCH_RECIPE="recipesPage.html";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            
            String search = request.getParameter("search");
            String searchRecipe = request.getParameter("searchRecipe");
            RecipeDAO dao = new RecipeDAO();
            if(search!=null){
                List<String> list = dao.getListSearchRecipe(search);
                request.setAttribute("SEARCH_LIST_RECIPE", list);
                request.setAttribute("SEARCH", search);
                url=SEARCH;
            }else{
                List<String> recipe = dao.getListSearchRecipe(searchRecipe);
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
