/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.user;

import hash.Hasher;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import sample.utils.DBContext;

/**
 *
 * @author phamt
 */
public class UserDAO {

    //General
    public static final String PAGE_INDEX = "SELECT * FROM [User] ORDER BY userID OFFSET ? rows fetch next 8 rows only";
    public static final String GET_ONE = "SELECT * FROM [User] where userID = ?";
    public static final String SELECT_ALL = "SELECT * FROM [User]";
    public static final String LOGIN = "SELECT * FROM [User] WHERE gmail = ? and [password] = ?";
    public static final String SIGNUP = "INSERT INTO [User] VALUES(?, ?, ?, ?, ?, ?, ?, ?, 'USER', 1)";
    public static final String CHECK_GMAIL = "SELECT * FROM [User] WHERE gmail = ?";
    public static final String CHECK_INF = "SELECT * FROM Account WHERE id = ?";
    public static final String UPDATE = "UPDATE [User] SET userName = ?, dob = ?, gender = ?, phone = ?, gmail = ?, password = ?, role = ?, status = ? WHERE userID = ?";
    public static final String CHECK_PASS = "SELECT * FROM [User] WHERE [password] = ? AND userID = ?";
    public static final String CHANGE_PASS = "UPDATE [User] SET [password] = ? WHERE userID = ?";
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

    public List<UserDTO> pageIndex(int index) throws SQLException, ClassNotFoundException {
        List<UserDTO> list = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement(PAGE_INDEX);
        stm.setInt(1, (index - 1) * 8);
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
            list.add(user);
        }
        con.close();
        return list;
    }

    public UserDTO getOne(int userID) throws SQLException, ClassNotFoundException {
        UserDTO user = null;
        Connection con = DBContext.getConnection();
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

    public List<UserDTO> selectAll() throws SQLException, ClassNotFoundException {
        List<UserDTO> list = null;
        Connection con = DBContext.getConnection();
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
            list.add(user);
        }
        con.close();
        return list;
    }

    public UserDTO login(String gmail, String password) throws SQLException, NoSuchAlgorithmException, ClassNotFoundException {
        UserDTO user = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement(LOGIN);
        stm.setString(1, gmail);
        stm.setString(2, password);
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
            user.setRole(rs.getString("role"));
            user.setStatus(rs.getBoolean("status"));
        }
        con.close();
        return user;
    }

    public UserDTO signUp(String userName, String firstName, String lastName, Date dob, String gender, String phone, String gmail, String password) throws SQLException, NoSuchAlgorithmException, ClassNotFoundException {
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement(SIGNUP);
        stm.setString(1, userName);
        stm.setString(2, firstName);
        stm.setString(3, lastName);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        stm.setString(4, sdf.format(dob));
        stm.setString(5, gender);
        stm.setString(6, phone);
        stm.setString(7, gmail);
        stm.setString(8, Hasher.hash(password));
        stm.executeUpdate();
        con.close();
        return null;
    }

    public UserDTO checkGmail(String gmail) throws SQLException, ClassNotFoundException {
        UserDTO user = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement(CHECK_GMAIL);
        stm.setString(1, gmail);
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
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
        con.close();
        return user;
    }

    public UserDTO checkInf(int id) throws SQLException, ClassNotFoundException {
        UserDTO user = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement(CHECK_INF);
        stm.setInt(1, id);
        ResultSet rs = stm.executeQuery();
        if (rs.next()) {
            int userID = rs.getInt("userID");
            String userName = rs.getString("userName");
            String firstName = rs.getString("firstName");
            String lastName = rs.getString("lastName");
            Date dob = rs.getDate("dob");
            boolean gender = rs.getBoolean("gender");
            String phone = rs.getString("phone");
            String gmail = rs.getString("gmail");
            String password = rs.getString("password");
            String role = rs.getString("role");
            boolean status = rs.getBoolean("status");
            user = new UserDTO(userID, userName, dob, gender, phone, gmail, password, "1", role, status);
        }
        con.close();
        return user;
    }

    public boolean update(UserDTO updateUser) throws SQLException, ClassNotFoundException {
        boolean checkUpdate = false;
        Connection conn = null;
        PreparedStatement stm = null;
        try {
            conn = DBContext.getConnection();
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

    public UserDTO checkPass(String password, int id) throws SQLException, ClassNotFoundException {
        UserDTO user = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement(CHECK_PASS);
        stm.setString(1, password);
        stm.setInt(2, id);
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
            user.setRole(rs.getString("role"));
            user.setStatus(rs.getBoolean("status"));
        }
        con.close();
        return user;
    }

    public UserDTO changePass(String password, int userID) throws SQLException, NoSuchAlgorithmException, ClassNotFoundException {
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement(CHANGE_PASS);
        stm.setString(1, Hasher.hash(password));
        stm.setInt(2, userID);
        int count = stm.executeUpdate();
        return null;
    }

    //Admin method
    public boolean createUser(UserDTO acc) throws SQLException {
        boolean check = true;
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBContext.getConnection();
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
            con = DBContext.getConnection();
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
            con = DBContext.getConnection();
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
}
