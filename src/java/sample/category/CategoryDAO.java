/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.category;

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
public class CategoryDAO {

    private static final String SHOWALL = "SELECT * FROM Category";
    private static final String SEARCHBYCATEGORY = "SELECT categoryID FROM Category WHERE categoryName = ?";

    public List<CategoryDTO> getListCategories() throws SQLException {
        List<CategoryDTO> listcategories = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareCall(SHOWALL);
            rs = ptm.executeQuery();
            while (rs.next()) {
                int categoryID = rs.getInt("categoryID");
                String categoryName = rs.getString("categoryName");
                String image = rs.getString("image");
                listcategories.add(new CategoryDTO(categoryID, categoryName, image));
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
        return listcategories;
    }

    public CategoryDTO getCategory(String categoryName) throws SQLException {
        CategoryDTO category = new CategoryDTO();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareCall(SEARCHBYCATEGORY);
            ptm.setString(1, categoryName);
            rs = ptm.executeQuery();
            while (rs.next()) {
                int categoryID = rs.getInt("categoryID");
                category.setCategoryID(categoryID);
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
        return category;
    }
}
