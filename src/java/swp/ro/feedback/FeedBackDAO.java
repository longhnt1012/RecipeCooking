/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.feedback;

import DBUtil.DBUtil;
import java.sql.Connection;
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
    public List<FeedBackDTO> getAllFeedback() throws SQLException, ClassNotFoundException {
        List<FeedBackDTO> list = null;
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement("select * from FeedBack a "
                + "join Recipe b on a.recipeID = b.recipeID "
                + "join [User] c on b.userID = c.userID "
                + "where a.[status] = 0");

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
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement("select * from [FeedBack] where feedBackID = ?");
        ResultSet rs = stm.executeQuery();
        if (rs.next()) {
            feedback = new FeedBackDTO();
            feedback.setFeedBackID(rs.getInt("feedBackID"));
            feedback.setContent(rs.getString("content"));
            feedback.setUserID(rs.getInt("userID"));
            feedback.setFeedbackDate(rs.getDate("feedbackDate"));
            feedback.setRecipeID(rs.getInt("recipeID"));
            feedback.setStatus(rs.getBoolean("status"));
        }
        con.close();
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
        PreparedStatement stm = con.prepareStatement("delete [FeedBack] where feedBackID = ?");
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
}
