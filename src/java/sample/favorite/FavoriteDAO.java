/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.favorite;

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
public class FavoriteDAO {

    public static final String READ = "SELECT * FROM tblMyFavorite WHERE cookerID = ?";

    public List<FavoriteDTO> listFavorite(String id) throws SQLException {
        List<FavoriteDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareCall(READ);
            ptm.setString(1, id);
            rs = ptm.executeQuery();
            while(rs.next()) {
                String favoriteID = rs.getString("favoriteID");
                String recipeID = rs.getString("recipeID");
                String cookerID = id;
                list.add(new FavoriteDTO(favoriteID, recipeID, cookerID));
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
