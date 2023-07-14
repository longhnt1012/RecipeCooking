/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.rating;

import DBUtil.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import swp.ro.Recipe.RecipeDTO;
import java.lang.Math;
/**
 *
 * @author truc0
 */
public class RatingDAO {
    private static final String RATING_RECIPE_HOME="SELECT AVG([scoreUser]*1.0) as AVGScore \n" +
                                                   " FROM (SELECT re.recipeID, recipeName,ra.scoreUser, ra.userID FROM [Recipe] re inner join [Rating] ra on re.recipeID=ra.recipeID \n" +
                                                   " where recipeName=? ) AS [R]";
    private static final String RATING_TOTAL_RECIPE="SELECT SUM([scoreUser]) as SUMScore\n" +
                                                    " FROM (SELECT re.recipeID, recipeName,ra.scoreUser, ra.userID FROM [Recipe] re inner join [Rating] ra on re.recipeID=ra.recipeID \n" +
                                                    " where recipeName=? ) AS [R]";
    public Map<String, Double>  getListRating() throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        List<RatingDTO> listRecipe = new ArrayList<>();
        List<String> listNameRecipe = new ArrayList<>();
        Map<String, Double> listRating = new HashMap();
        listNameRecipe.add("Homemade Pho");
//        listNameRecipe.add("Easy Spaghetti Bolognese");
//        listNameRecipe.add("Beefsteak");
//        listNameRecipe.add("Baked Salmon - Leek parcel");
//        listNameRecipe.add("Chicken Fries");
//        listNameRecipe.add("Aubergine - chickpea stew");
//        listNameRecipe.add("Baked Kale Chips");
//        listNameRecipe.add("Maple Salmon");
//        listNameRecipe.add("Miso Soup");
//        listNameRecipe.add("Green Salad");
//        listNameRecipe.add("Hambuger Vegetables");
//        listNameRecipe.add("Pineapple And Banana Smoothie");
//        listNameRecipe.add("Baked Salmon - Leek Parcel");
//        listNameRecipe.add("Pho");
//        listNameRecipe.add("Broken Rice");
        
        try {
            conn = DBUtil.makeConnection();
            if (conn != null) {
                for (String list : listNameRecipe) {
                    ptm = conn.prepareStatement(RATING_RECIPE_HOME);
                    ptm.setString(1, list.toString() );
                    rs = ptm.executeQuery();
                    if (rs.next()) {
                        double score = rs.getDouble("AVGScore");
                        listRating.put(list.toString(), score );
                        double x =Math.floor(score) ;
                        double x1 =Math.floor(score) ;
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
        return listRating;   
    } 
    public Map<String, Integer>  getTotalRating() throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        List<RatingDTO> listRecipe = new ArrayList<>();
        List<String> listNameRecipe = new ArrayList<>();
        Map<String, Integer> listTotalRating = new HashMap();
        listNameRecipe.add("Pho");
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
        listNameRecipe.add("Homemade Pho");
        listNameRecipe.add("Broken Rice");
        
        try {
            conn = DBUtil.makeConnection();
            if (conn != null) {
                for (String list : listNameRecipe) {
                    ptm = conn.prepareStatement(RATING_TOTAL_RECIPE);
                    ptm.setString(1, list.toString() );
                    rs = ptm.executeQuery();
                    if (rs.next()) {
                        int score = rs.getInt("SUMScore");
                        listTotalRating.put(list.toString(), score);
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
        return listTotalRating;   
    }
}
