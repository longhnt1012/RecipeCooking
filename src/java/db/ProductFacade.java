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
    
    public List<Product> getAll() throws SQLException {
        List<Product> list = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from Product");
        ResultSet rs = stm.executeQuery();
        list = new ArrayList<>();
        while(rs.next()) {
            Product product = new Product();
            product.setId(rs.getInt("id"));
            product.setName(rs.getString("name"));
            product.setDescription(rs.getString("description"));
            list.add(product);
        }
        return list;
    }
    
    public Product getOne(int id) throws SQLException {
        Product product = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from Product where id = ?");
        stm.setInt(1, id);
        ResultSet rs = stm.executeQuery();
        if(rs.next()) {
            product = new Product();
            product.setId(rs.getInt("id"));
            product.setName(rs.getString("name"));
            product.setDescription(rs.getString("description"));
        }
        con.close();
        return product;
    }
    
}
