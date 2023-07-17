/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.Ingredient;

import DBUtil.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author truc0
 */
public class IngredientDAO {
    private static final String GET_INGREDIENT_BY_RECIPEID = "SELECT * FROM [Ingredient] WHERE recipeID = ?";
    
    public List<IngredientDTO> getIngredientByRecipeID(int recipeID) throws SQLException {
        List<IngredientDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection1();
            if(conn != null) {
                ptm = conn.prepareStatement(GET_INGREDIENT_BY_RECIPEID);
                rs = ptm.executeQuery();
                while (rs.next()) {
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
    }
}
