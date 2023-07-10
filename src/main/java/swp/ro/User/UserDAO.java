/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.User;

import DBUtil.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author truc0
 */
public class UserDAO {
    private static final String LOGIN = "SELECT firstName, lastName, role FROM [User] WHERE userName=? AND password=?";
    
     public UserDTO checkLogin(String userName, String password) throws SQLException {
        UserDTO loginUser = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.makeConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(LOGIN);
                ptm.setString(1, userName);
                ptm.setString(2, password);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    String firstName = rs.getString("firstName") ;
                    String lastName = rs.getString("lastName");
                    String role = rs.getString("role");
                    loginUser = new UserDTO(userName, firstName, lastName, null, true, null, LOGIN, password, role, true);
                }
            }
        } catch (Exception e) {
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
        return loginUser;
    }
}
