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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phamt
 */
public class ProductFacade {
    public int countPro() throws SQLException {
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("select count(*) from Product");
        ResultSet rs = stm.executeQuery();
        while(rs.next()) {
            return rs.getInt(1);
        }
        return 0;
    }

    public List<Product> getAll() throws SQLException {
        List<Product> list = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from Product");
        ResultSet rs = stm.executeQuery();
        list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setId(rs.getInt("id"));
            product.setName(rs.getString("name"));
            product.setDescription(rs.getString("description"));
            list.add(product);
        }
        return list;
    }

    public List<Product> pageIndex(int index) throws SQLException {
        List<Product> list = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from Product order by id offset ? rows fetch next 8 rows only");
        stm.setInt(1, (index - 1) * 8);
        ResultSet rs = stm.executeQuery();
        list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setId(rs.getInt("id"));
            product.setName(rs.getString("name"));
            product.setDescription(rs.getString("description"));
            list.add(product);
        }
        return list;
    }
    
    public List<Product> myPro(int id) throws SQLException {
        List<Product> list = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from Product a join Comments b on a.id = b.productId"
                + " join Account c on b.userId = c.id where c.id = ?");
        ResultSet rs = stm.executeQuery();
        list = new ArrayList<>();
        while(rs.next()) {
            Product product = new Product();
            product.setId(rs.getInt("id"));
            product.setName(rs.getString("name"));
            product.setDescription(rs.getString("description"));
            list.add(product);
        }
        con.close();
        return list;
    }
    
    
    public Product addPro(String name, String description) throws SQLException {
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("insert Product values(?, ?)");
        stm.setString(1, name);
        stm.setString(2, description);
        stm.executeUpdate();
        con.close();
        return null;
    }
    
    public void updatePro(String name, String description) throws SQLException {
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("update Product set name = ? and description = ?");
        stm.setString(2, name);
        stm.setString(1, description);
        stm.executeUpdate();
        con.close();
    }
    
    public void deletePro(int id) throws SQLException {
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("delete Product where id = ?");
        stm.setInt(1, id);
        int count = stm.executeUpdate();
        con.close();
    }

    public Product getOne(int id) throws SQLException {
        Product product = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from Product where id = ?");
        stm.setInt(1, id);
        ResultSet rs = stm.executeQuery();
        if (rs.next()) {
            product = new Product();
            product.setId(rs.getInt("id"));
            product.setName(rs.getString("name"));
            product.setDescription(rs.getString("description"));
        }
        con.close();
        return product;
    }

}
