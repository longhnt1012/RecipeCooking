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

/**
 *
 * @author truc0
 */
public class RatingDAO {

<<<<<<< HEAD
    private static final String RATING_RECIPE_HOME = "SELECT AVG([scoreUser]*1.0) as AVGScore \n"
            + " FROM (SELECT re.recipeID, recipeName,ra.scoreUser, ra.userID FROM [Recipe] re inner join [Rating] ra on re.recipeID=ra.recipeID \n"
            + " where recipeName=? ) AS [R]";
    private static final String RATING_TOTAL_RECIPE = "SELECT SUM([scoreUser]) as SUMScore\n"
            + " FROM (SELECT re.recipeID, recipeName,ra.scoreUser, ra.userID FROM [Recipe] re inner join [Rating] ra on re.recipeID=ra.recipeID \n"
            + " where recipeName=? ) AS [R]";
=======
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
    private static final String GET_TOP_5 = "SELECT TOP 5 re.recipeID, recipeName, AVG(ra.scoreUser) AS scoreAvg \n"
            + "FROM [Recipe] re inner join [Rating] ra on re.recipeID=ra.recipeID \n"
            + "WHERE status = 'true'\n"
            + "GROUP BY re.recipeID, re.recipeName\n"
            + "ORDER BY scoreAvg DESC";
<<<<<<< HEAD
    private static final String RATING_RECIPE = "select sum (scoreUser) as totalScore,recipeID from [rating] group by recipeID having recipeID=?";
    private static final String AVG_RATE_Recipe_FOLLOW_ID = "select recipeID, sum (scoreUser) as totalScore,count(*)as COUNT  from [rating] group by recipeID having recipeID=?  ";

    public Map<Integer, Double> getRatingRecipeFollowID(List<RecipeDTO> listRecipe) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        Map<Integer, Double> listTop = new HashMap<>();

        try {
            conn = DBUtil.getConnection();
            if (conn != null) {
                for (RecipeDTO recipe : listRecipe) {
                    ptm = conn.prepareStatement(AVG_RATE_Recipe_FOLLOW_ID);
                    ptm.setInt(1, recipe.getRecipeID());
                    rs = ptm.executeQuery();
                    if (rs.next()) {
                        int recipeID = rs.getInt("recipeID");
                        int scoreUser = rs.getInt("totalScore");
                        int count1 = rs.getInt("COUNT");
                        listTop.put(recipeID, (double) Math.round((scoreUser * 1.0 / count1) * 10) / 10);

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
        return listTop;
    }

    public Map<Integer, Integer> getListRate(List<RecipeDTO> listRecipe) throws SQLException {
        Map<Integer, Integer> listRate = new HashMap<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            if (conn != null) {
                for (RecipeDTO recipe : listRecipe) {
                    ptm = conn.prepareStatement(RATING_RECIPE);
                    ptm.setInt(1, recipe.getRecipeID());
                    rs = ptm.executeQuery();
                    if (rs.next()) {
                        int score = rs.getInt("totalScore");
                        int recipeID = rs.getInt("recipeID");
                        listRate.put(recipeID, score);
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
        return listRate;
    }

    public RatingDTO getRatingRecipe(int recipeID, int userID) throws SQLException, ClassNotFoundException {
        RatingDTO rating = null;
        Connection con = DBUtil.getConnection();
=======

    public RatingDTO getRatingRecipe(int recipeID, int userID) throws SQLException, ClassNotFoundException {
        RatingDTO rating = null;
        Connection con = DBUtil.getConnection1();
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
        PreparedStatement stm = con.prepareStatement("select * from Rating a join Recipe b"
                + " on a.recipeID = b.recipeID "
                + "join [User] c on b.userID = c.userID "
                + "where a.recipeID = ? and a.userID = ?");
        stm.setInt(1, recipeID);
        stm.setInt(2, userID);
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            rating = new RatingDTO();
            rating.setRateID(rs.getInt("rateID"));
            rating.setUserID(rs.getInt("userID"));
            rating.setRecipeID(rs.getInt("recipeID"));
            rating.setScoreUser(rs.getInt("scoreUser"));
        }
        con.close();
        return rating;
    }

    public void ratingRecipe(RatingDTO rating) throws SQLException, ClassNotFoundException {
<<<<<<< HEAD
        Connection con = DBUtil.getConnection();
=======
        Connection con = DBUtil.getConnection1();
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
        PreparedStatement stm = con.prepareStatement("insert Rating values(?, ?, ?)");
        stm.setInt(1, rating.getUserID());
        stm.setInt(2, rating.getRecipeID());
        stm.setDouble(3, rating.getScoreUser());
        int count = stm.executeUpdate();
        con.close();
    }

    public RatingDTO getOne(int rateID) throws SQLException, ClassNotFoundException {
        RatingDTO rating = null;
<<<<<<< HEAD
        Connection con = DBUtil.getConnection();
=======
        Connection con = DBUtil.getConnection1();
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
        PreparedStatement stm = con.prepareStatement("select * from Rating where rateID = ?");
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            rating = new RatingDTO();
            rating.setRateID(rs.getInt("rateID"));
            rating.setUserID(rs.getInt("userID"));
            rating.setRecipeID(rs.getInt("recipeID"));
            rating.setRateID(rs.getInt("scoreUser"));
        }
        con.close();
        return rating;
    }

    public RatingDTO checkReRating(int userID, int recipeID) throws SQLException, ClassNotFoundException {
        RatingDTO rating = null;
<<<<<<< HEAD
        Connection con = DBUtil.getConnection();
=======
        Connection con = DBUtil.getConnection1();
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
        PreparedStatement stm = con.prepareStatement("select * from Rating where userID = ? and recipeID = ?");
        stm.setInt(1, userID);
        stm.setInt(2, recipeID);
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            rating = new RatingDTO();
            rating.setRateID(rs.getInt("rateID"));
            rating.setUserID(rs.getInt("userID"));
            rating.setRecipeID(rs.getInt("recipeID"));
            rating.setRateID(rs.getInt("scoreUser"));
        }
        con.close();
        return rating;
    }

    public void reRating(RatingDTO rating) throws SQLException, ClassNotFoundException {
<<<<<<< HEAD
        Connection con = DBUtil.getConnection();
=======
        Connection con = DBUtil.getConnection1();
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
        PreparedStatement stm = con.prepareStatement("update Rating set scoreUser = ? where userID = ? and recipeID = ?");
        stm.setDouble(1, rating.getScoreUser());
        stm.setInt(2, rating.getUserID());
        stm.setInt(3, rating.getRecipeID());
        int count = stm.executeUpdate();
        con.close();
    }

    public int totalRating(int recipeID) throws SQLException, ClassNotFoundException {
<<<<<<< HEAD
        Connection con = DBUtil.getConnection();
=======
        Connection con = DBUtil.getConnection1();
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
        PreparedStatement stm = con.prepareStatement("select count(*) from Rating where recipeID = ?");
        stm.setInt(1, recipeID);
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            return rs.getInt(1);
        }
        return 0;
    }

    public int totalScoreRecipe(int recipeID) throws SQLException, ClassNotFoundException {
<<<<<<< HEAD
        Connection con = DBUtil.getConnection();
=======
        Connection con = DBUtil.getConnection1();
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
        PreparedStatement stm = con.prepareStatement("select SUM(scoreUser) from Rating where recipeID = ?");
        stm.setInt(1, recipeID);
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            return rs.getInt(1);
        }
        return 0;
    }

    public int totalUserScoreRecipe(int recipeID) throws SQLException, ClassNotFoundException {
<<<<<<< HEAD
        Connection con = DBUtil.getConnection();
=======
        Connection con = DBUtil.getConnection1();
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
        PreparedStatement stm = con.prepareStatement("select count(userID) from Rating where recipeID = ?");
        stm.setInt(1, recipeID);
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            return rs.getInt(1);
        }
        return 0;
    }
<<<<<<< HEAD

    public Map<String, Double> getListRating() throws SQLException {
=======
    private static final String RATING_RECIPE_HOME = "SELECT AVG([scoreUser]) as AVGScore \n"
            + " FROM (SELECT re.recipeID, recipeName,ra.scoreUser, ra.userID FROM [Recipe] re inner join [Rating] ra on re.recipeID=ra.recipeID \n"
            + " where recipeName=? ) AS [R]";
    private static final String RATING_TOTAL_RECIPE = "SELECT SUM([scoreUser]) as SUMScore\n"
            + " FROM (SELECT re.recipeID, recipeName,ra.scoreUser, ra.userID FROM [Recipe] re inner join [Rating] ra on re.recipeID=ra.recipeID \n"
            + " where recipeName=? ) AS [R]";

    public Map<String, Integer> getListRating() throws SQLException {
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        List<RatingDTO> listRecipe = new ArrayList<>();
        List<String> listNameRecipe = new ArrayList<>();
        Map<String, Double> listRating = new HashMap();
        listNameRecipe.add("Homemade Pho");
<<<<<<< HEAD
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
=======
        listNameRecipe.add("Broken Rice");
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71

        try {
            conn = DBUtil.getConnection();
            if (conn != null) {
                for (String list : listNameRecipe) {
                    ptm = conn.prepareStatement(RATING_RECIPE_HOME);
                    ptm.setString(1, list.toString());
                    rs = ptm.executeQuery();
                    if (rs.next()) {
                        double score = rs.getDouble("AVGScore");
<<<<<<< HEAD
                        listRating.put(list.toString(), score);
=======
                        listRating.put(list.toString(), (int) Math.round(score));
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
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

    public Map<String, Integer> getTotalRating() throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        List<RatingDTO> listRecipe = new ArrayList<>();
        List<String> listNameRecipe = new ArrayList<>();
        Map<String, Integer> listTotalRating = new HashMap();
        listNameRecipe.add("Homemade Pho");
<<<<<<< HEAD
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
//        listNameRecipe.add("Homemade Pho");
//        listNameRecipe.add("Broken Rice");
//        
=======
        listNameRecipe.add("Broken Rice");

>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
        try {
            conn = DBUtil.getConnection();
            if (conn != null) {
                for (String list : listNameRecipe) {
                    ptm = conn.prepareStatement(RATING_TOTAL_RECIPE);
                    ptm.setString(1, list.toString());
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

    public List<RatingDTO> listRecipesTop5() throws SQLException {
        List<RatingDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
<<<<<<< HEAD
            conn = DBUtil.getConnection();
=======
            conn = DBUtil.getConnection1();
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
            if (conn != null) {
                ptm = conn.prepareStatement(GET_TOP_5);
                rs = ptm.executeQuery();
                while (rs.next()) {
<<<<<<< HEAD
                    int scoreAvg = rs.getInt("scoreAvg");
=======
                    double scoreAvg = rs.getFloat("scoreAvg");
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
                    int recipeID = rs.getInt("recipeID");
                    String recipeName = rs.getString("recipeName");
                    list.add(new RatingDTO(recipeID, recipeID, recipeID, scoreAvg, recipeName));
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
        return list;
<<<<<<< HEAD
    }

    private static final String AVG_RATE_TOP6 = "select recipeID, sum (scoreUser) as totalScore,count(*)as COUNT  from [rating] group by recipeID  order by totalScore DESC";
    private static final String AVG_RATE_Recipe = "select recipeID, sum (scoreUser) as totalScore,count(*)as COUNT  from [rating] group by recipeID  ";

    public Map<Integer, Double> getTop6Recipe() throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        Map<Integer, Double> listTop = new HashMap<>();
        int count = 0;
        try {
            conn = DBUtil.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(AVG_RATE_TOP6);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    count++;
                    if (count > 6) {
                        break;
                    }
                    int recipeID = rs.getInt("recipeID");
                    int scoreUser = rs.getInt("totalScore");
                    int count1 = rs.getInt("COUNT");
                    listTop.put(recipeID, (double) Math.round((scoreUser * 1.0 / count1) * 10) / 10);

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
        return listTop;
    }

    public Map<Integer, Double> getRatingRecipe() throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        Map<Integer, Double> listTop = new HashMap<>();
        int count = 0;
        try {
            conn = DBUtil.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(AVG_RATE_Recipe);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    count++;
                    if (count > 6) {
                        break;
                    }
                    int recipeID = rs.getInt("recipeID");
                    int scoreUser = rs.getInt("totalScore");
                    int count1 = rs.getInt("COUNT");
                    listTop.put(recipeID, (double) Math.round((scoreUser * 1.0 / count1) * 10) / 10);

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
        return listTop;
    }

    public Map<Integer, Double> getAllRatingRecipe() throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        Map<Integer, Double> listTop = new HashMap<>();

        try {
            conn = DBUtil.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(AVG_RATE_Recipe);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    int recipeID = rs.getInt("recipeID");
                    int scoreUser = rs.getInt("totalScore");
                    int count1 = rs.getInt("COUNT");
                    listTop.put(recipeID, (double) Math.round((scoreUser * 1.0 / count1) * 10) / 10);

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
        return listTop;
=======
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
    }
}
