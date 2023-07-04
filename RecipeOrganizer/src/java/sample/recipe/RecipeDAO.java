/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.recipe;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sample.utils.DBContext;

/**
 *
 * @author Admin
 */
public class RecipeDAO {

    private static final String READ = "SELECT * FROM [Recipe]";
    private static final String INSERT = "INSERT INTO [Recipe](recipeID, recipeName, cookingTime, difficultyLevel, instructions, userID) VALUES(?,?,?,?,?,?)";
    private static final String SEARCHBYCATEGORY = "SELECT * FROM tblRecipes WHERE recipeID = ?";
    private static final String GET_ONE = "SELECT * FROM Recipe a JOIN [User] b ON a.userID = b.userID WHERE a.recipeID = ?";
    private static final String UPDATE = "UPDATE [Recipe] SET [recipeName] = ?, [instruction] = ?, [description] = ?, [cookingTime] = ?, [image] = ?, [status] = ? WHERE [recipeID] = ?";

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
                int status = rs.getInt("status");
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

    public RecipeDTO getOne(int recipeID) throws SQLException, ClassNotFoundException {
        RecipeDTO recipe = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ptm = conn.prepareStatement(GET_ONE);
            ptm.setInt(1, recipeID);
            rs = ptm.executeQuery();
            if (rs.next()) {
                int userID = rs.getInt("userID");
                String recipeName = rs.getString("recipeName");
                Date datePost = rs.getDate("datePost");
                String instruction = rs.getString("instruction");
                String description = rs.getString("description");
                float cookingTime = rs.getFloat("cookingTime");
                String image = rs.getString("image");
                int status = rs.getInt("status");
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
                ptm.setFloat(4, updateRecipe.getCookingTime());
                ptm.setString(5, updateRecipe.getImage());
                ptm.setInt(6, updateRecipe.getStatus());
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

//    public RecipeDTO searchBycategory(int ID) throws SQLException {
//        RecipeDTO recipe = null;
//        Connection conn = null;
//        PreparedStatement ptm = null;
//        ResultSet rs = null;
//        try {
//            conn = DBContext.getConnection();
//            ptm = conn.prepareStatement(SEARCHBYCATEGORY);
//            ptm.setInt(1, ID);
//            rs = ptm.executeQuery();
//            while (rs.next()) {
//                int recipeID = ID;
//                int userID = rs.getInt("userID");
//                String recipeName = rs.getString("recipeName");
//                Date datePost = rs.getDate("datePost");
//                String introduction = rs.getString("introduction");
//                String description = rs.getString("description");
//                float cookingTime = rs.getFloat("cookingTime");
//                int levelID = rs.getInt("levelID");
//                float calories = rs.getFloat("calories");
//                int cuisineID = rs.getInt("cuisineID");
//                int rateID = rs.getInt("rateID");
//                String image = rs.getString("image");
//                recipe = new RecipeDTO(recipeID, userID, recipeName, datePost, introduction, description, cookingTime, levelID, calories, cuisineID, rateID, image);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (rs != null) {
//                rs.close();
//            }
//            if (ptm != null) {
//                ptm.close();
//            }
//            if (conn != null) {
//                conn.close();
//            }
//        }
//        return recipe;
//    }
}
