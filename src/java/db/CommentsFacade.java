/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phamt
 */
public class CommentsFacade {
    public List<Comments> getAllComments() throws SQLException {
        List<Comments> list = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from Comments");
        
        ResultSet rs = stm.executeQuery();
        list = new ArrayList<>();
        while (rs.next()) {
            Comments comment = new Comments();
            comment.setId(rs.getInt("id"));
            comment.setContent(rs.getString("content"));
            comment.setUserId(rs.getInt("userId"));
            comment.setUsername(rs.getString("username"));
            comment.setDate(rs.getDate("cmtDate"));
            comment.setProductId(rs.getInt("productId"));
            list.add(comment);
        }
        con.close();    
        return list;
    }

    public List<Comments> getComments(int productId) throws SQLException {
        List<Comments> list = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from Comments where productId = ?");
        stm.setInt(1, productId);
        ResultSet rs = stm.executeQuery();
        list = new ArrayList<>();
        while (rs.next()) {
            Comments comment = new Comments();
            comment.setId(rs.getInt("id"));
            comment.setContent(rs.getString("content"));
            comment.setUserId(rs.getInt("userId"));
            comment.setUsername(rs.getString("username"));
            comment.setDate(rs.getDate("cmtDate"));
            comment.setProductId(rs.getInt("productId"));
            list.add(comment);
        }
        con.close();    
        return list;
    }
    
    public Comments getOne(int id) throws SQLException {
        Comments comment = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from Comments where id = ?");
        ResultSet rs = stm.executeQuery();
        if(rs.next()) {
            comment = new Comments();
            comment.setId(rs.getInt("id"));
            comment.setContent(rs.getString("content"));
            comment.setUserId(rs.getInt("userId"));
            comment.setUsername(rs.getString("username"));
            comment.setDate(rs.getDate("cmtDate"));
            comment.setProductId(rs.getInt("productId"));
        }
        con.close();
        return comment;
    }

    public void addComments(Comments cmt) throws SQLException {
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("insert Comments values(?, ?, ?, ?, ?)");
        stm.setString(1, cmt.getContent());
        stm.setInt(2, cmt.getUserId());
        stm.setInt(3, cmt.getProductId());
        stm.setString(4, cmt.getUsername());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        stm.setString(5, sdf.format(cmt.getDate()));
        stm.executeUpdate();
        con.close();
    }
    
    public void removeCmts(int id) throws SQLException {
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("delete Comments where id = ?");
        stm.setInt(1, id);
        int count = stm.executeUpdate();
        con.close();
    }

    public int getTotalComments() throws SQLException {
        int result = 0;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("select count(id) as totalC from Comments");
        ResultSet rs = stm.executeQuery();
        if (rs.next()) {
            result += rs.getInt("totalC");
        }
        return result;
    }
    
}
