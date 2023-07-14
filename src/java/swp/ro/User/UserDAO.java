/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.User;

import DBUtil.DBUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author truc0
 */
public class UserDAO {

    private static final String LOGIN = "SELECT * FROM [User] WHERE userName=? AND password=?";
    private static final String SEARCH_USER = "SELECT * FROM [User] WHERE userID IN (SELECT distinct userID FROM Recipe where recipeName like ? AND STATUS =1 )";
    private static final String SEARCH_CATEGORY = "SELECT * FROM [User] WHERE userID IN (select distinct  userID from \n"
            + "(SELECT r.recipeID, userID, recipeName, datePost, description, cookingTime, image,ID, categoryID FROM  [Recipe] r, [CategoryOfRecipes] C \n"
            + " WHERE r.recipeID=c.recipeID ) as[RC] inner join [Category] c on [RC].categoryID=c.categoryID where c.categoryName=?)";
    private static final String CHECK_DUPLICATE = "SELECT gmail FROM [User] WHERE gmail = ? COLLATE SQL_Latin1_General_CP1_CS_AS";
    //Admin
    public static final String CREATE_USER = "INSERT INTO [User] VALUES(?, ?, ?, ?, ?, ?, ?, 'USER', 'true')";
    public static final String DELETE_USER = "DELETE [Rating] WHERE userID = ?\n"
            + "DELETE [Feedback] WHERE userID = ?\n"
            + "DELETE [Recipe] WHERE userID = ?\n"
            + "DELETE [MealPlanning] WHERE userID = ?\n"
            + "DELETE [FavoriteRecipe] WHERE userID = ?\n"
            + "DELETE [SavedRecipes] WHERE userID = ?\n"
            + "DELETE [User] WHERE userID = ?";
    public static final String SELECT_ALL = "SELECT * FROM [User]";
    public static final String GET_ONE = "SELECT * FROM [User] where userID = ?";
    public static final String UPDATE = "UPDATE [User] SET userName = ?, dob = ?, gender = ?, phone = ?, gmail = ?, password = ?, role = ?, status = ? WHERE userID = ?";
    public static final String COUNT_USER = "SELECT COUNT(userID) AS countUser FROM [User]";

    public UserDTO checkLogin(String userName, String password) throws SQLException, ClassNotFoundException {
        UserDTO user = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection1();
            if (conn != null) {
                ptm = conn.prepareStatement(LOGIN);
                ptm.setString(1, userName);
                ptm.setString(2, password);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    user = new UserDTO();
                    user.setUserID(rs.getInt("userID"));
                    user.setUserName(rs.getString("userName"));
                    user.setDob(rs.getDate("dob"));
                    user.setGender(rs.getBoolean("gender"));
                    user.setPhone(rs.getString("phone"));
                    user.setGmail(rs.getString("gmail"));
                    user.setPassword(rs.getString("password"));
                    user.setRole(rs.getString("role"));
                    user.setStatus(rs.getBoolean("status"));
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

        return user;
    }

    public List<UserDTO> getListSearchUser(String search) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        List<UserDTO> listUser = new ArrayList<>();

        try {
            conn = DBUtil.getConnection1();
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
            conn = DBUtil.getConnection1();
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

    //Admin method
    public boolean createUser(UserDTO acc) throws SQLException {
        boolean check = true;
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtil.getConnection1();
            if (con != null) {
                stm = con.prepareStatement(CREATE_USER);
                stm.setString(1, acc.getUserName());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                stm.setString(2, sdf.format(acc.getDob()));
                stm.setBoolean(3, acc.isGender());
                stm.setString(4, acc.getPhone());
                stm.setString(5, acc.getGmail());
                stm.setString(6, acc.getPassword());
                stm.setString(7, acc.getImageProfile());
                check = stm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return check;
    }

    public boolean checkDuplicate(String email) throws SQLException {
        boolean check = false;
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtil.getConnection1();
            if (con != null) {
                stm = con.prepareStatement(CHECK_DUPLICATE);
                stm.setString(1, email);
                rs = stm.executeQuery();
                if (rs.next()) {
                    check = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return check;
    }

    public boolean deleteAccount(int userID) throws SQLException {
        boolean check = false;
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtil.getConnection1();
            if (con != null) {
                stm = con.prepareStatement(DELETE_USER);
                stm.setInt(1, userID);
                stm.setInt(2, userID);
                stm.setInt(3, userID);
                stm.setInt(4, userID);
                stm.setInt(5, userID);
                stm.setInt(6, userID);
                stm.setInt(7, userID);
                check = stm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return check;
    }

    public boolean update(UserDTO updateUser) throws SQLException, ClassNotFoundException {
        boolean checkUpdate = false;
        Connection conn = null;
        PreparedStatement stm = null;
        try {
            conn = DBUtil.getConnection1();
            if (conn != null) {
                stm = conn.prepareStatement(UPDATE);
                stm.setString(1, updateUser.getUserName());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                stm.setString(2, sdf.format(updateUser.getDob()));
                stm.setBoolean(3, updateUser.isGender());
                stm.setString(4, updateUser.getPhone());
                stm.setString(5, updateUser.getGmail());
                stm.setString(6, updateUser.getPassword());
                stm.setString(7, updateUser.getRole());
                stm.setBoolean(8, updateUser.isStatus());
                stm.setInt(9, updateUser.getUserID());
                checkUpdate = stm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return checkUpdate;
    }

    public List<UserDTO> selectAll() throws SQLException, ClassNotFoundException {
        List<UserDTO> list = null;
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement(SELECT_ALL);
        ResultSet rs = stm.executeQuery();
        list = new ArrayList<>();
        while (rs.next()) {
            UserDTO user = new UserDTO();
            user.setUserID(rs.getInt("userID"));
            user.setUserName(rs.getString("userName"));
            user.setDob(rs.getDate("dob"));
            user.setGender(rs.getBoolean("gender"));
            user.setPhone(rs.getString("phone"));
            user.setGmail(rs.getString("gmail"));
            user.setPassword(rs.getString("password"));
            user.setRole(rs.getString("role"));
            user.setStatus(rs.getBoolean("status"));
            user.setImageProfile(rs.getString("imageProfile"));
            list.add(user);
        }
        con.close();
        return list;
    }

    public UserDTO getOne(int userID) throws SQLException, ClassNotFoundException {
        UserDTO user = null;
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement(GET_ONE);
        stm.setInt(1, userID);
        ResultSet rs = stm.executeQuery();
        if (rs.next()) {
            user = new UserDTO();
            user.setUserID(rs.getInt("userID"));
            user.setUserName(rs.getString("userName"));
            user.setDob(rs.getDate("dob"));
            user.setGender(rs.getBoolean("gender"));
            user.setPhone(rs.getString("phone"));
            user.setGmail(rs.getString("gmail"));
            user.setPassword(rs.getString("password"));
            user.setImageProfile(rs.getString("imageProfile"));
            user.setRole(rs.getString("role"));
            user.setStatus(rs.getBoolean("status"));
        }
        con.close();
        return user;
    }

    public int countUsers() throws SQLException, ClassNotFoundException {
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement(COUNT_USER);
        ResultSet rs = stm.executeQuery();
        int count = 0;
        try {
            if (rs.next()) {
                count = rs.getInt("countUser");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return count;
    }
}
