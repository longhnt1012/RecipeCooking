/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp.ro.Recipe;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import swp.ro.User.UserDTO;

/**
 *
 * @author nguyentruc
 */
@WebServlet(name = "CreateRecipeController", urlPatterns = {"/CreateRecipeController"})
public class CreateRecipeController extends HttpServlet {
    private static final String ERROR = "createrecipe.jsp";
    private static final String SUCCESS = "createISC.jsp";
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            HttpSession session = request.getSession();
            UserDTO user = (UserDTO) session.getAttribute("LOGIN_USER");
            int userID = user.getUserID();
            String recipeName = request.getParameter("recipeName");
            Date datePost = new Date();
            String description = request.getParameter("description");
            double cookingTime = Double.parseDouble(request.getParameter("cookingTime"));
            String image = request.getParameter("image");
            RecipeDAO rdao = new RecipeDAO();
            RecipeDTO recipe = new RecipeDTO(userID, recipeName, datePost, description, cookingTime, image, false);
            boolean checkInsert = rdao.insertRecipe(recipe);
            if(checkInsert){
                url=SUCCESS;
            }else{
                request.setAttribute("ERROR", "Unknown error");
            }
        } catch (Exception e) {
            log("Error at CreateRecipeController: " + e.toString());
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
