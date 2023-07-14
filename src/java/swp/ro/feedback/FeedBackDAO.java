/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.feedback;

import DBUtil.DBUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author truc0
 */
public class FeedBackDAO {

    private static final String GET_ALL_FEEDBACK = "SELECT * FROM [Feedback] a JOIN [Recipe] b ON a.recipeID = b.recipeID JOIN [User] c ON a.userID = c.userID ";
    private static final String GET_ONE = "select * from FeedBack a "
            + "join [Recipe] b on a.recipeID = b.recipeID "
            + "join [User] c on b.userID = c.userID "
            + "where a.feedbackID = ?";
    private static final String UPDATE = "update Feedback set [content] = ?, [recipeID] = ?, [userID] = ?, [feedbackDate] = ?, [status] = ? where [feedbackID] = ?";
    private static final String DELETE = "DELETE [Feedback] WHERE feedbackID = ?";

    public List<FeedBackDTO> getAllFeedback() throws SQLException, ClassNotFoundException {
        List<FeedBackDTO> list = null;
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement(GET_ALL_FEEDBACK);
        ResultSet rs = stm.executeQuery();
        list = new ArrayList<>();
        while (rs.next()) {
            int feedBackID = rs.getInt("feedbackID");
            String content = rs.getString("content");
            int recipeID = rs.getInt("recipeID");
            int userID = rs.getInt("userID");
            Date feedbackDate = rs.getDate("feedbackDate");
            boolean status = rs.getBoolean("status");
            String recipeName = rs.getString("recipeName");
            String userName = rs.getString("userName");
            list.add(new FeedBackDTO(feedBackID, content, recipeID, userID, feedbackDate, status, recipeName, userName));
        }
        con.close();
        return list;
    }

    public List<FeedBackDTO> getComments(int recipeID) throws SQLException, ClassNotFoundException {
        List<FeedBackDTO> list = null;
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement("select * from FeedBack a "
                + "join Recipe b on a.recipeID = b.recipeID "
                + "join [User] c on b.userID = c.userID "
                + "where a.recipeID = ? and a.[status] = 1");
        stm.setInt(1, recipeID);
        ResultSet rs = stm.executeQuery();
        list = new ArrayList<>();
        while (rs.next()) {
            FeedBackDTO feedback = new FeedBackDTO();
            feedback.setFeedBackID(rs.getInt("feedBackID"));
            feedback.setContent(rs.getString("content"));
            feedback.setUserID(rs.getInt("userID"));

            feedback.setFeedbackDate(rs.getDate("feedbackDate"));
            feedback.setRecipeID(rs.getInt("recipeID"));
            feedback.setStatus(rs.getBoolean("status"));
            list.add(feedback);
        }
        con.close();
        return list;
    }

    public FeedBackDTO getOne(int feedBackID) throws SQLException, ClassNotFoundException {
        FeedBackDTO feedback = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection1();
            ptm = conn.prepareStatement(GET_ONE);
            ptm.setInt(1, feedBackID);
            rs = ptm.executeQuery();
            if (rs.next()) {
                String content = rs.getString("content");
                int recipeID = rs.getInt("recipeID");
                int userID = rs.getInt("userID");
                Date feedbackDate = rs.getDate("feedbackDate");
                boolean status = rs.getBoolean("status");
                String recipeName = rs.getString("recipeName");
                String userName = rs.getString("userName");
                feedback = new FeedBackDTO(feedBackID, content, recipeID, userID, feedbackDate, status, recipeName, userName);
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
    

    public void addComments(FeedBackDTO fb) throws SQLException, ClassNotFoundException {
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement("insert [FeedBack] values(?, ?, ?, ?, 0)");
        stm.setString(1, fb.getContent());
        stm.setInt(2, fb.getRecipeID());
        stm.setInt(3, fb.getUserID());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        stm.setString(4, sdf.format(fb.getFeedbackDate()));
        stm.executeUpdate();
        con.close();
    }

    public void removeCmts(int feedBackID) throws SQLException, ClassNotFoundException {
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement(DELETE);
        stm.setInt(1, feedBackID);
        int count = stm.executeUpdate();
        con.close();
    }

    public int getTotalComments() throws SQLException, ClassNotFoundException {
        int result = 0;
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement("select count(feedBackID) as totalC from [feedBack]");
        ResultSet rs = stm.executeQuery();
        if (rs.next()) {
            result += rs.getInt("totalC");
        }
        return result;
    }

    public void addCommentsFAdmin(int feedBackID) throws SQLException, ClassNotFoundException {
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement("update feedBack set [status] = 1 where feedBackID = ?");
        stm.setInt(1, feedBackID);
        int count = stm.executeUpdate();
        con.close();
    }
    
    //Admin method
    public boolean Delete(int feedbackID) throws SQLException {
        boolean checkDelete = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtil.getConnection1();
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

    public boolean Update(FeedBackDTO updatefeedback) throws SQLException {
        boolean checkUpdate = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtil.getConnection1();
            if (conn != null) {
                ptm = conn.prepareStatement(UPDATE);
                ptm.setString(1, updatefeedback.getContent());
                ptm.setInt(2, updatefeedback.getRecipeID());
                ptm.setInt(3, updatefeedback.getUserID());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                ptm.setString(4, sdf.format(updatefeedback.getFeedbackDate()));
                ptm.setBoolean(5, updatefeedback.isStatus());
                ptm.setInt(6, updatefeedback.getFeedBackID());
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
}
