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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author truc0
 */
public class UserDAO {

    private static final String LOGIN = "SELECT userID, dob,gender, phone, gmail,imageUser, role FROM [User] WHERE userName=? AND password=? AND status =1";
    private static final String SEARCH_USER = "SELECT * FROM [User] WHERE userID IN (SELECT distinct userID FROM Recipe where recipeName like ? AND STATUS =1 )";
    private static final String SEARCH_CATEGORY="SELECT * FROM [User] WHERE userID IN (select distinct  userID from \n" +
                                               "(SELECT r.recipeID, userID, recipeName, datePost, description, cookingTime, image,ID, categoryID FROM  [Recipe] r, [CategoryOfRecipes] C \n" +
                                                " WHERE r.recipeID=c.recipeID ) as[RC] inner join [Category] c on [RC].categoryID=c.categoryID where c.categoryName=?)";
    public UserDTO checkLogin(String userName, String password) throws SQLException {
        UserDTO loginUser = new UserDTO();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        loginUser.setUserName(userName);
        loginUser.setPassword(password);
        try {
            conn = DBUtil.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(LOGIN);
                ptm.setString(1, userName);
                ptm.setString(2, password);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    loginUser.setUserID(rs.getInt("userID"));
                    loginUser.setDob(rs.getDate("dob"));
                    loginUser.setGender(rs.getBoolean("gender"));
                    loginUser.setPhone(rs.getString("phone"));
                    loginUser.setGmail(rs.getString("gmail"));
                    loginUser.setImageUser(rs.getString("imageUser"));
                    loginUser.setRole(rs.getString("role"));
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

    public List<UserDTO> getListSearchUser(String search) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        List<UserDTO> listUser = new ArrayList<>();

        try {
            conn = DBUtil.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(SEARCH_USER);
                ptm.setString(1, "%" + search + "%");
                rs = ptm.executeQuery();
                while (rs.next()) {
                    UserDTO user = new UserDTO();
                    user.setUserID(rs.getInt("userID"));
                    user.setUserName(rs.getString("userName"));
                    user.setDob(rs.getDate("dob"));
                    user.setGender(rs.getBoolean("gender"));
                    user.setPhone(rs.getString("phone"));
                    user.setGmail(rs.getString("gmail"));
                    user.setPassword(rs.getString("password"));
                    user.setImageUser(rs.getString("imageUser"));
                    user.setRole(rs.getString("role"));
                    listUser.add(user);
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
        return listUser;
    }
    public List<UserDTO> getListCategoryUser(String searchCategory) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        List<UserDTO> listUser = new ArrayList<>();

        try {
            conn = DBUtil.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(SEARCH_CATEGORY);
                ptm.setString(1, searchCategory);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    UserDTO user = new UserDTO();
                    user.setUserID(rs.getInt("userID"));
                    user.setUserName(rs.getString("userName"));
                    user.setDob(rs.getDate("dob"));
                    user.setGender(rs.getBoolean("gender"));
                    user.setPhone(rs.getString("phone"));
                    user.setGmail(rs.getString("gmail"));
                    user.setPassword(rs.getString("password"));
                    user.setImageUser(rs.getString("imageUser"));
                    user.setRole(rs.getString("role"));
                    listUser.add(user);
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
        return listUser;
    }
}
