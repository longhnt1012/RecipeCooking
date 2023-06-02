/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import db.Account;
import db.Favourite;
import db.Item;
import db.Product;
import db.ProductFacade;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author phamt
 */
@WebServlet(name = "FavouriteController", urlPatterns = {"/favourite"})
public class FavouriteController extends HttpServlet {

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
        String controller = (String) request.getAttribute("controller");
        String action = (String) request.getAttribute("action");
        Account account = (Account) request.getSession().getAttribute("account");
        if (account != null) {
            try {
                switch (action) {
                    case "favourite":
                        request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
                        break;

                    case "addToFavourite":
                        addToFavourite(request, response);
                        break;

                    case "removeFromFavourite":
                        removeFromFavourite(request, response);
                }
            } catch (Exception e) {
                e.printStackTrace();
                request.setAttribute("message", e.getMessage());
                request.setAttribute("controller", "error");
                request.setAttribute("action", "error");
                request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("controller", "error");
            request.setAttribute("action", "error");
            request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
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

    protected void addToFavourite(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        HttpSession session = request.getSession(true);
        Favourite favourite = new Favourite();
        int id = Integer.parseInt(request.getParameter("id"));
        ProductFacade pf = new ProductFacade();
        Product p = pf.getOne(id);
        Item item = new Item(1, p);
        favourite.addItem(item);
        List<Item> list = favourite.getItems();
        session.setAttribute("favourite", favourite);
        session.setAttribute("size", list.size());
        request.getRequestDispatcher("/product/detail.do").forward(request, response);
    }

    protected void removeFromFavourite(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        Favourite favourite = new Favourite();
        int id = Integer.parseInt(request.getParameter("id"));
        favourite.removeItem(id);
        List<Item> list = favourite.getItems();
        session.setAttribute("favourite", favourite);
        session.setAttribute("size", list.size());
        request.setAttribute("controller", "favourite");
        request.setAttribute("action", "favourite");
        request.getRequestDispatcher("/WEB-INF/layouts/main.jsp").forward(request, response);
    }

}
