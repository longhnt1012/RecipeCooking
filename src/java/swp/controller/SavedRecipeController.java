/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import swp.ro.User.UserDTO;
import swp.ro.savedRecipes.SavedRecipesDAO;
import swp.ro.savedRecipes.SavedRecipesDTO;

/**
 *
 * @author Thành Long
 */
@WebServlet(name = "SavedRecipeController", urlPatterns = {"/SavedRecipeController"})
public class SavedRecipeController extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        UserDTO user = (UserDTO) request.getSession().getAttribute("LOGIN_USER");
        if (user != null ) {
        try{
            int userID = user.getUserID();
                    int recipeID = Integer.parseInt(request.getParameter("recipeID"));
<<<<<<< HEAD
=======
                    int userID = Integer.parseInt(request.getParameter("userID"));
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
                    SavedRecipesDAO sfDAO = new SavedRecipesDAO();
                    SavedRecipesDTO check = sfDAO.getOneSaved(recipeID, userID);
                    if (check == null) {
                        SavedRecipesDTO save = new SavedRecipesDTO();
                        save.setRecipeID(recipeID);
                        save.setUserID(userID);
                        sfDAO.addSavedByID(recipeID, userID);
                        response.sendRedirect(request.getContextPath() + "/MainController?action=RecipeDetail&recipeID=" + recipeID);
                    }else {
                        response.sendRedirect(request.getContextPath() + "/MainController?action=RecipeDetail&recipeID=" + recipeID);
                    }
                    
                } catch (Exception e) {
                    log("Error at SavedRecipeController " + e.toString());
                }

    }else {
            response.sendRedirect("error.jsp");
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
