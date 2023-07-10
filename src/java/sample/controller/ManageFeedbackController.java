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
import java.io.PrintWriter;

import sample.feedback.FeedbackDAO;
import sample.feedback.FeedbackDTO;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ManageFeedbackController", urlPatterns = {"/ManageFeedbackController"})
public class ManageFeedbackController extends HttpServlet {
    private static final String SUCCESS = "LoadFeedbacksController";
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
        FeedbackDAO dao = new FeedbackDAO();
        FeedbackDTO feedback = new FeedbackDTO();
        boolean check = false;
        try {
            String feedbackID = request.getParameter("feedbackID");
            String action = request.getParameter("action");
            if ("Block".equals(action)) {
                feedback = dao.getOneFeedBack(Integer.parseInt(feedbackID));
                if (feedback != null) {
                    feedback.setStatus(0);
                    if(dao.Update(feedback)) {
                        url = SUCCESS;
                    } else {
                        url = ERROR;
                    }
                } else {
                    url = ERROR;
                }
            } else if ("Unblock".equals(action)) {
                feedback = dao.getOneFeedBack(Integer.parseInt(feedbackID));
                if (feedback != null) {
                    feedback.setStatus(1);
                    if(dao.Update(feedback)) {
                        url = SUCCESS;
                    } else {
                        url = ERROR;
                    }
                } else {
                    url = ERROR;
                }
            } else if (action.equals("Detail")) {
                feedback = dao.getOneFeedBack(Integer.parseInt(feedbackID));
                if (feedback != null) {
                    request.setAttribute("feedback_detail", feedback);
                    url = "feedbackDetail.jsp";
                }
            } else if (action.equals("Delete")) {
                check = dao.Delete(Integer.parseInt(feedbackID));
                if(check) {
                    url = SUCCESS;
                }
            }
        } catch (Exception e) {
            request.setAttribute("message", "Error at ManageFeedbackController");
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
