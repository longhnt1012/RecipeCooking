/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.recipe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sample.utils.DBUtils;

/**
 *
 * @author Admin
 */
public class RecipeDAO {

    private static final String READ = "SELECT * FROM tblRecipes";
    private static final String INSERT = "INSERT INTO tblRecipes(recipeID, recipeName, cookingTime, difficultyLevel, instructions, userID) VALUES(?,?,?,?,?,?)";
    private static final String SEARCHBYCATEGORY = "SELECT * FROM tblRecipes WHERE recipeID = ?";

    public List<RecipeDTO> read() throws SQLException {
        List<RecipeDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareCall(READ);
            rs = ptm.executeQuery();
            while (rs.next()) {
                String recipeID = rs.getString("recipeID");
                String recipeName = rs.getString("recipeName");
                String cookingTime = rs.getString("cookingTime");
                int levelID = rs.getInt("levelID");
                String instructions = rs.getString("instructions");
                String userID = rs.getString("userID");
                String picture = rs.getString("picture");
                list.add(new RecipeDTO(recipeID, recipeName, cookingTime, levelID, instructions, userID, picture));
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

    public boolean insert(RecipeDTO recipe) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(INSERT);
                ptm.setString(1, recipe.getRecipeID());;
                ptm.setString(2, recipe.getRecipeName());
                ptm.setString(3, recipe.getCookingTime());
                ptm.setInt(4, recipe.getDifficultyLevel());
                ptm.setString(5, recipe.getInstructions());
                ptm.setString(6, recipe.getUserID());
                check = ptm.executeUpdate() > 0 ? true : false;
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
        return check;
    }
    
    public RecipeDTO searchBycategory(String category) throws SQLException {
        RecipeDTO recipe = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(SEARCHBYCATEGORY);
            ptm.setString(1, category);
            rs = ptm.executeQuery();
            while (rs.next()) {
                String recipeID = rs.getString("recipeID");
                String recipeName = rs.getString("recipeName");
                String cookingTime = rs.getString("cookingTime");
                int levelID = rs.getInt("levelID");
                String instructions = rs.getString("instructions");
                String userID = rs.getString("userID");
                String picture = rs.getString("picture");
                recipe = new RecipeDTO(recipeID, recipeName, cookingTime, levelID, instructions, userID, picture);
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
}
