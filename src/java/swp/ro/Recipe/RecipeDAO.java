/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.Recipe;

import DBUtil.DBContext;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import swp.ro.User.UserDTO;

/**
 *
 * @author truc0
 */
public class RecipeDAO {

    private static final String SEARCH = "SELECT recipeID, userID, recipeName, datePost, description, cookingTime, image FROM Recipe where recipeName like ? AND STATUS =1";
    private static final String SEARCH_RECIPE = "SELECT recipeID FROM Recipe where recipeName = ? ";
    private static final String SEARCH_CATETAGORY = "select recipeID, userID, recipeName, datePost, description, cookingTime, image,ID, c.categoryID, c.categoryName from \n"
            + "(SELECT r.recipeID, userID, recipeName, datePost, description, cookingTime, image,ID, categoryID FROM  [Recipe] r, [CategoryOfRecipes] C \n"
            + " WHERE r.recipeID=c.recipeID ) as[RC] inner join [Category] c on [RC].categoryID=c.categoryID where c.categoryName=?";
    private static final String SEARCH_USER = "SELECT * FROM [User] WHERE userID IN (SELECT distinct userID FROM Recipe where recipeName like ? AND STATUS =1 )";
    private static final String SEARCH_NAME_RECIPE_HOME = "SELECT recipeID, userID, recipeName, datePost, description, cookingTime, image FROM Recipe where recipeName = ? AND STATUS =1";
    private static final String GET_ONE = "SELECT * FROM Recipe a JOIN [User] b ON a.userID = b.userID WHERE a.recipeID = ?";
    private static final String UPDATE = "UPDATE [Recipe] SET [recipeName] = ?, [instruction] = ?, [description] = ?, [cookingTime] = ?, [image] = ?, [status] = ? WHERE [recipeID] = ?";
    //Admin
    private static final String READ = "SELECT * FROM [Recipe]";
    private static final String REMOVE_RECIPE = "DELETE [Rating] WHERE recipeID = ?\n"
            + "DELETE [Feedback] WHERE recipeID = ?\n"
            + "DELETE [MealPlanning] WHERE recipeID = ?\n"
            + "DELETE [FavoriteRecipe] WHERE recipeID = ?\n"
            + "DELETE [CategoryOfRecipes] WHERE recipeID = ?\n"
            + "DElETE [IngredientOfRecipe] WHERE recipeID = ?\n"
            + "DElETE [SavedRecipes] WHERE recipeID = ?\n"
            + "DELETE [Recipe] WHERE recipeID = ?";

    public List<RecipeDTO> load() throws SQLException {
        List<RecipeDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ptm = conn.prepareCall(READ);
            rs = ptm.executeQuery();
            while (rs.next()) {
                int recipeID = rs.getInt("recipeID");
                int userID = rs.getInt("userID");
                String recipeName = rs.getString("recipeName");
                Date datePost = rs.getDate("datePost");
                String instruction = rs.getString("instruction");
                String description = rs.getString("description");
                float cookingTime = rs.getFloat("cookingTime");
                boolean status = rs.getBoolean("status");
                String image = rs.getString("image");
                list.add(new RecipeDTO(recipeID, userID, recipeName, datePost, instruction, description, cookingTime, image, status, null));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public List<RecipeDTO> getListSearchRecipe(String search) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        List<RecipeDTO> listRecipe = new ArrayList<>();

        try {
            conn = DBUtil.DBContext.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(SEARCH);
                ptm.setString(1, "%" + search + "%");
                rs = ptm.executeQuery();
                while (rs.next()) {
                    RecipeDTO recipe = new RecipeDTO();
                    recipe.setRecipeID(rs.getInt("recipeID"));
                    recipe.setUserID(rs.getInt("userID"));
                    recipe.setRecipeName(rs.getString("recipeName"));
                    recipe.setDatePost(rs.getDate("datePost"));
                    recipe.setDescription(rs.getString("description"));
                    recipe.setCookingTime(rs.getInt("cookingTime"));
                    recipe.setImage(rs.getString("image"));
                    listRecipe.add(recipe);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return listRecipe;
    }

    public String getSearchRecipe(String search) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        String recipe = null;
        try {
            conn = DBUtil.DBContext.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(SEARCH);
                ptm.setString(1, search);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    String recipeID = rs.getString("recipeID");
                    recipe = recipeID;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return recipe;
    }

    public List<RecipeDTO> getListCategotyRecipe(String searchCategory) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        List<RecipeDTO> listRecipe = new ArrayList<>();

        try {
            conn = DBUtil.DBContext.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(SEARCH_CATETAGORY);
                ptm.setString(1, searchCategory);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    RecipeDTO recipe = new RecipeDTO();
                    recipe.setRecipeID(rs.getInt("recipeID"));
                    recipe.setUserID(rs.getInt("userID"));
                    recipe.setRecipeName(rs.getString("recipeName"));
                    recipe.setDatePost(rs.getDate("datePost"));
                    recipe.setDescription(rs.getString("description"));
                    recipe.setCookingTime(rs.getInt("cookingTime"));
                    recipe.setImage(rs.getString("image"));
                    listRecipe.add(recipe);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return listRecipe;
    }

    public List<RecipeDTO> getListRecipeHome() throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        List<RecipeDTO> listRecipe = new ArrayList<>();
        List<String> listNameRecipe = new ArrayList<>();
        listNameRecipe.add("Homemade Pho");
        listNameRecipe.add("Easy Spaghetti Bolognese");
        listNameRecipe.add("Beefsteak");
        listNameRecipe.add("Baked Salmon - Leek parcel");
        listNameRecipe.add("Chicken Fries");
        listNameRecipe.add("Aubergine - chickpea stew");
        listNameRecipe.add("Baked Kale Chips");
        listNameRecipe.add("Maple Salmon");
        listNameRecipe.add("Miso Soup");
        listNameRecipe.add("Green Salad");
        listNameRecipe.add("Hambuger Vegetables");
        listNameRecipe.add("Pineapple And Banana Smoothie");
        listNameRecipe.add("Baked Salmon - Leek Parcel");
        listNameRecipe.add("Pho");
        listNameRecipe.add("Broken Rice");

        try {
            conn = DBUtil.DBContext.getConnection();
            if (conn != null) {
                for (String list : listNameRecipe) {
                    ptm = conn.prepareStatement(SEARCH_NAME_RECIPE_HOME);
                    ptm.setString(1, list.toString());
                    rs = ptm.executeQuery();
                    while (rs.next()) {
                        RecipeDTO recipe = new RecipeDTO();
                        recipe.setRecipeID(rs.getInt("recipeID"));
                        recipe.setUserID(rs.getInt("userID"));
                        recipe.setRecipeName(rs.getString("recipeName"));
                        recipe.setDatePost(rs.getDate("datePost"));
                        recipe.setDescription(rs.getString("description"));
                        recipe.setCookingTime(rs.getInt("cookingTime"));
                        recipe.setImage(rs.getString("image"));
                        listRecipe.add(recipe);
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return listRecipe;
    }

    public RecipeDTO getOne(int recipeID) throws SQLException, ClassNotFoundException {
        RecipeDTO recipe = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.DBContext.getConnection();
            ptm = conn.prepareStatement(GET_ONE);
            ptm.setInt(1, recipeID);
            rs = ptm.executeQuery();
            if (rs.next()) {
                int userID = rs.getInt("userID");
                String recipeName = rs.getString("recipeName");
                Date datePost = rs.getDate("datePost");
                String instruction = rs.getString("instruction");
                String description = rs.getString("description");
                double cookingTime = rs.getDouble("cookingTime");
                String image = rs.getString("image");
                boolean status = rs.getBoolean("status");
                String userName = rs.getString("userName");
                recipe = new RecipeDTO(recipeID, userID, recipeName, datePost, instruction, description, cookingTime, image, status, userName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return recipe;
    }

    public boolean update(RecipeDTO updateRecipe) throws SQLException {
        boolean checkUpdate = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBContext.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(UPDATE);
                ptm.setString(1, updateRecipe.getRecipeName());
                ptm.setString(2, updateRecipe.getInstruction());
                ptm.setString(3, updateRecipe.getDescription());
                ptm.setDouble(4, updateRecipe.getCookingTime());
                ptm.setString(5, updateRecipe.getImage());
                ptm.setBoolean(6, updateRecipe.isStatus());
                ptm.setInt(7, updateRecipe.getRecipeID());
                checkUpdate = ptm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return checkUpdate;
    }

    public boolean removeRecipe(int recipeID) throws SQLException {
        boolean checkDelete = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBContext.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(REMOVE_RECIPE);
                ptm.setInt(1, recipeID);
                ptm.setInt(2, recipeID);
                ptm.setInt(3, recipeID);
                ptm.setInt(4, recipeID);
                ptm.setInt(5, recipeID);
                ptm.setInt(6, recipeID);
                ptm.setInt(7, recipeID);
                ptm.setInt(8, recipeID);
                checkDelete = ptm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return checkDelete;
    }
}
