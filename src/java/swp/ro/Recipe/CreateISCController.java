/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp.ro.Recipe;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import swp.ro.Category.CategoryDAO;
import swp.ro.Category.CategoryDTO;
import swp.ro.Ingredient.IngredientDAO;
import swp.ro.Ingredient.IngredientDTO;
import swp.ro.Recipe.RecipeDAO;
import swp.ro.Recipe.RecipeDTO;
import swp.ro.Step.StepDAO;
import swp.ro.Step.StepDTO;

/**
 *
 * @author My PC
 */
@WebServlet(name = "CreateISCController", urlPatterns = {"/CreateISCController"})
public class CreateISCController extends HttpServlet {

    private static final String ERROR = "createISC.jsp";
    private static final String SUCCESS = "mainPage_1.jsp";

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
        try {
            RecipeDAO rdao = new RecipeDAO();
            RecipeDTO rdto = new RecipeDTO();
            int recipeID = rdao.getNewRecipeID();
            int stepNumber = Integer.parseInt(request.getParameter("stepNumber"));
            String instructions = request.getParameter("instructions");
            String ingredientName = request.getParameter("ingredientName");
            double quantity = Double.parseDouble(request.getParameter("quantity"));
            String unit = request.getParameter("unit");
            IngredientDAO idao = new IngredientDAO();
            IngredientDTO idto = new IngredientDTO(ingredientName, recipeID, quantity, unit);
            boolean check = idao.insertIngredient(idto);
            StepDAO sdao = new StepDAO();
            StepDTO step = new StepDTO(recipeID, stepNumber, instructions);
            boolean check2 = sdao.insertStep(step);
            if (check && check2) {
                url = SUCCESS;
            } else {
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
