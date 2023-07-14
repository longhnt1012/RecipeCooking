/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.FavoriteRecipes;

import DBUtil.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import swp.ro.Recipe.RecipeDTO;
import swp.ro.User.UserDTO;

/**
 *
 * @author truc0
 */
public class FavoriteRecipesDAO {
    private static final String SEARCH = "select count(*) AS totalCount from FavoriteRecipes fr where recipeID=?";
    private static final String COMMENT_COUNT = "SELECT COUNT(*) AS totalComments FROM FavoriteRecipes WHERE recipeID=?";
    public Map<Integer, Integer> getListLike(List<RecipeDTO> list) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        Map<Integer, Integer> map = new HashMap<>();
        int totalComments = 0;
        try {
            conn = DBUtil.getConnection();
            if (conn != null) {
                for (RecipeDTO recipe : list) {
//                    ptm = conn.prepareStatement(SEARCH);
//                    ptm.setInt(1, recipe.getRecipeID());
//                    rs = ptm.executeQuery();
//                    if(rs!=null){
//                        int count = rs.getInt("totalCount");
//                        map.put(recipe.getRecipeID(), count);
//                    }
                    ptm = conn.prepareStatement(COMMENT_COUNT);
                    ptm.setInt(1, recipe.getRecipeID());
                    rs = ptm.executeQuery();
                    if (rs.next()) {
                    totalComments = rs.getInt("totalComments");
                    map.put(recipe.getRecipeID(), totalComments);
                    }
                }      
        } 
        }catch (Exception e) {
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
        return map;
    }
    public int getTotalCommentsForRecipe(int recipeID) throws SQLException {
        int totalComments = 0;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;

        try {
            // Kết nối đến cơ sở dữ liệu (DBUtil.makeConnection() là phương thức giả định)
            conn = DBUtil.getConnection();

            if (conn != null) {
                // Chuẩn bị truy vấn SQL
                ptm = conn.prepareStatement(COMMENT_COUNT);
                ptm.setInt(1, recipeID);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    totalComments = rs.getInt("totalComments");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Xử lý lỗi nếu cần thiết
        } finally {
            // Đóng tất cả các tài nguyên sau khi sử dụng
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

        return totalComments;
    }
}
