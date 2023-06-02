/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.detailCategory;

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
public class DetailCategoryDAO {
    private static final String SEARCH = "SELECT * FROM tblDetailCategories WHERE categoryID = ?";
    
    public List<DetailCategoryDTO> search(String search) throws SQLException {
        List<DetailCategoryDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(SEARCH);
            ptm.setString(1, search);
            rs = ptm.executeQuery();
            while (rs.next()) {
                String dcID = rs.getString("dcID");
                String recipeID = rs.getString("recipeID");
                String categoryID = rs.getString("categoryID");
                list.add(new DetailCategoryDTO(dcID, recipeID, categoryID));
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
}
