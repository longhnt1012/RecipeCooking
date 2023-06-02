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
import sample.utils.DBUtils;

/**
 *
 * @author Admin
 */
public class RecipeDAO {

    private static final String READ = "SELECT * FROM Recipe";
    private static final String INSERT = "INSERT INTO Recipe(recipeID, recipeName, cookingTime, difficultyLevel, instructions, userID) VALUES(?,?,?,?,?,?)";
    private static final String SEARCHBYCATEGORY = "SELECT * FROM Recipe WHERE recipeID = ?";

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
                int recipeID = rs.getInt("recipeID");
                int userID = rs.getInt("userID");
                String recipeName = rs.getString("recipeName");
                Date datePost = rs.getDate("datePost");
                String introduction = rs.getString("introduction");
                String description = rs.getString("description");
                float cookingTime = rs.getFloat("cookingTime");
                int levelID = rs.getInt("levelID");
                float calories = rs.getFloat("calories");
                int cuisineID = rs.getInt("cuisineID");
                int rateID = rs.getInt("rateID");
                String image = rs.getString("image");
                list.add(new RecipeDTO(recipeID, userID, recipeName, datePost, introduction, description, cookingTime, levelID, calories, cuisineID, rateID, image));
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
    
    public RecipeDTO searchBycategory(int ID) throws SQLException {
        RecipeDTO recipe = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(SEARCHBYCATEGORY);
            ptm.setInt(1, ID);
            rs = ptm.executeQuery();
            while (rs.next()) {
                int recipeID = rs.getInt("recipeID");
                int userID = rs.getInt("userID");
                String recipeName = rs.getString("recipeName");
                Date datePost = rs.getDate("datePost");
                String introduction = rs.getString("introduction");
                String description = rs.getString("description");
                float cookingTime = rs.getFloat("cookingTime");
                int levelID = rs.getInt("levelID");
                float calories = rs.getFloat("calories");
                int cuisineID = rs.getInt("cuisineID");
                int rateID = rs.getInt("rateID");
                String image = rs.getString("image");
                recipe = new RecipeDTO(recipeID, userID, recipeName, datePost, introduction, description, cookingTime, levelID, calories, cuisineID, rateID, image);
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
