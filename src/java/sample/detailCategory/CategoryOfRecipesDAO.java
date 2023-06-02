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
public class CategoryOfRecipesDAO {
    private static final String SEARCH = "SELECT * FROM CategoryOfRecipes WHERE categoryID = ?";
    
    public List<CategoryOfRecipesDTO> search(int search) throws SQLException {
        List<CategoryOfRecipesDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(SEARCH);
            ptm.setInt(1, search);
            rs = ptm.executeQuery();
            while (rs.next()) {
                int ID = rs.getInt("ID");
                int categoryID = rs.getInt("categoryID");
                int recipeID = rs.getInt("recipeID");
                list.add(new CategoryOfRecipesDTO(ID, categoryID, recipeID));
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
