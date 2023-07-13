/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import swp.ro.MealPlanning.MealPlanningDAO;
import swp.ro.MealPlanning.MealPlanningDTO;
import swp.ro.savedRecipes.SavedRecipesDAO;
import swp.ro.savedRecipes.SavedRecipesDTO;

/**
 *
 * @author Thành Long
 */
@WebServlet(name = "PlanningController", urlPatterns = {"/PlanningController"})
public class PlanningController extends HttpServlet {

    private static final String PLANNING = "planpage.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = PLANNING;

        try {
            String day = request.getParameter("day");
            String month = request.getParameter("month");
            String year = request.getParameter("year");
            String sDate = day + "-" + month + "-" + year;

            Date date = (Date) new SimpleDateFormat("dd-MM-YY").parse(sDate);
            int checkbox = Integer.parseInt(request.getParameter("checkbox"));
            MealPlanningDAO mdao = new MealPlanningDAO();
            
            
            if (checkbox == 1) {
 
                SavedRecipesDAO dao = new SavedRecipesDAO();
                SavedRecipesDTO recipes = new SavedRecipesDTO();
                int userID = recipes.getUserID();
                int savedrecipesID = recipes.getRecipeID();

                MealPlanningDTO planning = new MealPlanningDTO(0, userID, savedrecipesID, date);
                boolean checkInsert=mdao.insert(planning);
            
            }
           

        } catch (Exception e) {
            log("Error at PlanningController" + e.getMessage());
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
