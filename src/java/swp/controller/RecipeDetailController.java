package swp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import swp.ro.FavoriteRecipes.FavoriteRecipesDAO;
import swp.ro.FavoriteRecipes.FavoriteRecipesDTO;
import swp.ro.Recipe.RecipeDAO;
import swp.ro.Recipe.RecipeDTO;
import swp.ro.User.UserDTO;
import swp.ro.feedback.FeedBackDAO;
import swp.ro.feedback.FeedBackDTO;
import swp.ro.rating.RatingDAO;
import swp.ro.rating.RatingDTO;
import swp.ro.savedRecipes.SavedRecipesDAO;
import swp.ro.savedRecipes.SavedRecipesDTO;
import swp.ro.step.StepDAO;
import swp.ro.step.StepDTO;

/**
 *
 * @author Thành Long
 */
@WebServlet(name = "RecipeDetailController", urlPatterns = {"/RecipeDetailController"})
public class RecipeDetailController extends HttpServlet {

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
        int recipeID = Integer.parseInt(request.getParameter("recipeID"));
        UserDTO user = (UserDTO) request.getSession().getAttribute("LOGIN_USER");
        try {
            
            if (user == null) {
                RecipeDAO rDAO = new RecipeDAO();
                RecipeDTO recipe = rDAO.getOne(recipeID);

                FeedBackDAO fDAO = new FeedBackDAO();
                List<FeedBackDTO> listFeedback = fDAO.getComments(recipeID);

                RatingDAO raDAO = new RatingDAO();
                int totalRate = raDAO.totalRating(recipeID);
                
                FavoriteRecipesDAO favoDAO=new FavoriteRecipesDAO();
                
                SavedRecipesDAO saveDAO=new SavedRecipesDAO();
             
                int sSize = saveDAO.totalSavedORecipe(recipeID);
                int fSize = favoDAO.totalFavoriteORecipe(recipeID);
                
                //Steps of recipe
                StepDAO stepDAO = new StepDAO();
                List<StepDTO> listStep = stepDAO.getStepsByRecipeID(recipeID);
                
                //Ingredients of recipe
                
                request.setAttribute("sSize", sSize);
                request.setAttribute("fSize", fSize);
                request.setAttribute("totalRate", totalRate);
                request.setAttribute("feedbacks", listFeedback);
                request.setAttribute("noFb", listFeedback.size());
                request.setAttribute("recipe", recipe);
                request.setAttribute("LIST_STEP", listStep);
                
                request.getRequestDispatcher("recipeDetail.jsp").forward(request, response);
            } else {

                RecipeDAO rDAO = new RecipeDAO();
                RecipeDTO recipe = rDAO.getOne(recipeID);

                FeedBackDAO fDAO = new FeedBackDAO();
                List<FeedBackDTO> listFeedback = fDAO.getComments(recipeID);

                RatingDAO raDAO = new RatingDAO();
                RatingDTO rating = raDAO.getRatingRecipe(recipeID, user.getUserID());
                int totalRate = raDAO.totalRating(recipeID);

                FavoriteRecipesDAO fvDAO = new FavoriteRecipesDAO();
                FavoriteRecipesDTO favorite = fvDAO.getFavoriteRecipeID(recipeID, user.getUserID());

                SavedRecipesDAO svDAO = new SavedRecipesDAO();
                SavedRecipesDTO save = svDAO.getSavedRecipeID(recipeID, user.getUserID());

                int sSize = svDAO.totalSavedORecipe(recipeID);
                int fSize = fvDAO.totalFavoriteORecipe(recipeID);
                request.setAttribute("save", save);
                request.setAttribute("favorite", favorite);
                request.setAttribute("totalRate", totalRate);
                request.setAttribute("sSize", sSize);
                request.setAttribute("fSize", fSize);
                request.setAttribute("rating", rating);
                request.setAttribute("feedbacks", listFeedback);
                request.setAttribute("noFb", listFeedback.size());
                request.setAttribute("recipe", recipe);

                request.getRequestDispatcher("recipeDetail.jsp").forward(request, response);
            }
        } catch (Exception e) {
            request.setAttribute("controller", "error");
            request.setAttribute("action", "error");
            request.getRequestDispatcher("error.jsp").forward(request, response);
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
