///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package sample.controller;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.List;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import sample.category.CategoryDAO;
//import sample.category.CategoryDTO;
//import sample.detailCategory.CategoryOfRecipesDAO;
//import sample.detailCategory.CategoryOfRecipesDTO;
//import sample.recipe.RecipeDAO;
//import sample.recipe.RecipeDTO;
//
///**
// *
// * @author Admin
// */
//@WebServlet(name = "SearchByCategoryController", urlPatterns = {"/SearchByCategoryController"})
//public class SearchByCategoryController extends HttpServlet {
//    private static final String ERROR = "index.html";
//    private static final String SUCCESS = "newjsp.jsp";
//
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        String url = ERROR;
//        try {
//            String categoryName = request.getParameter("categoryName");
////            Get category by categoryname
//            CategoryDAO categorydao = new CategoryDAO();
//            CategoryDTO categorydto = categorydao.getCategory(categoryName);
////            Get list detailcategories by categoryID
//            CategoryOfRecipesDAO detailcategorydao = new CategoryOfRecipesDAO();
//            int categoryID = categorydto.getCategoryID();
//            List<CategoryOfRecipesDTO> detailcategorydto = detailcategorydao.search(categoryID);
////            Get Recipe Name by recipeID from detailcategories
//            int Size = detailcategorydto.size();
//            RecipeDAO recipedao = new RecipeDAO();
//            RecipeDTO recipedto = null;
//            List<RecipeDTO> listrecipes = new ArrayList<>();
//            if(Size > 0) {
//                for (int i = 0; i < Size; i++) {
//                    int recipeID = detailcategorydto.get(i).getRecipeID();
//                    recipedto = recipedao.searchBycategory(recipeID);
//                    listrecipes.add(i, recipedto);
//                }
//                HttpSession session= request.getSession();
//                session.removeAttribute("LIST_RECIPES");
//                session.setAttribute("LIST_RECIPES", listrecipes);
//                url = SUCCESS;
//            } else {
//                request.setAttribute("ERROR", "SAI ROI");
//            }
//        } catch (Exception e) {
//            log("Error at SearchController" + e.toString());
//        }finally {
//            request.getRequestDispatcher(url).forward(request, response);
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
