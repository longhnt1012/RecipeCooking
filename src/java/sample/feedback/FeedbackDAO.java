/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.feedback;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import sample.utils.DBContext;

/**
 *
 * @author Admin
 */
public class FeedbackDAO {

    private static final String GET_ALL_FEEDBACK = "SELECT * FROM [Feedback] a JOIN [Recipe] b ON a.recipeID = b.recipeID JOIN [User] c ON a.userID = c.userID ";
    private static final String GET_ONE = "select * from FeedBack a "
            + "join [Recipe] b on a.recipeID = b.recipeID "
            + "join [User] c on b.userID = c.userID "
            + "where a.feedbackID = ?";
    private static final String UPDATE = "update Feedback set [content] = ?, [recipeID] = ?, [userID] = ?, [feedbackDate] = ?, [status] = ? where [feedbackID] = ?";
    private static final String DELETE = "DELETE [Feedback] WHERE feedbackID = ?";

    public List<FeedbackDTO> getAllFeedback() throws SQLException {
        List<FeedbackDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ptm = conn.prepareStatement(GET_ALL_FEEDBACK);
            rs = ptm.executeQuery();
            while (rs.next()) {
                int feedBackID = rs.getInt("feedbackID");
                String content = rs.getString("content");
                int recipeID = rs.getInt("recipeID");
                int userID = rs.getInt("userID");
                Date feedbackDate = rs.getDate("feedbackDate");
                int status = rs.getInt("status");
                String recipeName = rs.getString("recipeName");
                String userName = rs.getString("userName");
                list.add(new FeedbackDTO(feedBackID, content, recipeID, userID, feedbackDate, status, recipeName, userName));
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

    public FeedbackDTO getOneFeedBack(int feedBackID) throws SQLException {
        FeedbackDTO feedback = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ptm = conn.prepareStatement(GET_ONE);
            ptm.setInt(1, feedBackID);
            rs = ptm.executeQuery();
            if (rs.next()) {
                String content = rs.getString("content");
                int recipeID = rs.getInt("recipeID");
                int userID = rs.getInt("userID");
                Date feedbackDate = rs.getDate("feedbackDate");
                int status = rs.getInt("status");
                String recipeName = rs.getString("recipeName");
                String userName = rs.getString("userName");
                feedback = new FeedbackDTO(feedBackID, content, recipeID, userID, feedbackDate, status, recipeName, userName);
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
        return feedback;
    }

    public boolean Update(FeedbackDTO updatefeedback) throws SQLException {
        boolean checkUpdate = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBContext.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(UPDATE);
                ptm.setString(1, updatefeedback.getContent());
                ptm.setInt(2, updatefeedback.getRecipeID());
                ptm.setInt(3, updatefeedback.getUserID());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                ptm.setString(4, sdf.format(updatefeedback.getFeedbackDate()));
                ptm.setInt(5, updatefeedback.getStatus());
                ptm.setInt(6, updatefeedback.getFeedbackID());
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

    public boolean Delete(int feedbackID) throws SQLException {
        boolean checkDelete = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBContext.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(DELETE);
                ptm.setInt(1, feedbackID);
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
