/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import hash.Hasher;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phamt
 */
public class AccountFacade {

    public int getAllAcc() throws SQLException {
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("select count(*) from Account");
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            return rs.getInt(1);
        }
        return 0;
    }

    public List<Account> pageIndex(int index) throws SQLException {
        List<Account> list = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from Account order by id offset ? rows fetch next 8 rows only");
        stm.setInt(1, (index - 1) * 8);
        ResultSet rs = stm.executeQuery();
        list = new ArrayList<>();
        while(rs.next()) {
            Account account = new Account();
            account.setId(rs.getInt("id"));
            account.setName(rs.getString("name"));
            account.setAddress(rs.getString("address"));
            account.setPhone(rs.getString("phone"));
            account.setEmail(rs.getString("email"));
            account.setPassword(rs.getString("password"));
            account.setRole(rs.getString("role"));
            list.add(account);
        }
        con.close();
        return list;
    }

    public List<Account> selectAll() throws SQLException {
        List<Account> list = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from Account");
        ResultSet rs = stm.executeQuery();
        list = new ArrayList<>();
        while (rs.next()) {
            Account account = new Account();
            account.setId(rs.getInt("id"));
            account.setName(rs.getString("name"));
            account.setAddress(rs.getString("address"));
            account.setPhone(rs.getString("phone"));
            account.setEmail(rs.getString("email"));
            account.setPassword(rs.getString("password"));
            account.setRole(rs.getString("role"));
            list.add(account);
        }
        con.close();
        return list;
    }

    public Account login(String email, String password) throws SQLException, NoSuchAlgorithmException {
        Account account = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from Account where email = ? and [password] = ?");
        stm.setString(1, email);
        stm.setString(2, Hasher.hash(password));
        ResultSet rs = stm.executeQuery();
        if (rs.next()) {
            account = new Account();
            account.setId(rs.getInt("id"));
            account.setName(rs.getString("name"));
            account.setAddress(rs.getString("address"));
            account.setPhone(rs.getString("phone"));
            account.setEmail(rs.getString("email"));
            account.setPassword(rs.getString("password"));
            account.setRole(rs.getString("role"));
        }
        con.close();
        return account;
    }

    public Account signUp(String name, String address, String phone, String email, String password) throws SQLException, NoSuchAlgorithmException {
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("insert into Account values(?, ?, ?, ?, ?, 'USER')");
        stm.setString(1, name);
        stm.setString(2, address);
        stm.setString(3, phone);
        stm.setString(4, email);
        stm.setString(5, Hasher.hash(password));
        stm.executeUpdate();
        con.close();
        return null;
    }

    public Account checkEmail(String email) throws SQLException {
        Account account = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from Account where email = ?");
        stm.setString(1, email);
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            account = new Account();
            account.setId(rs.getInt("id"));
            account.setName(rs.getString("name"));
            account.setAddress(rs.getString("address"));
            account.setPhone(rs.getString("phone"));
            account.setEmail(rs.getString("email"));
            account.setPassword(rs.getString("password"));
            account.setRole(rs.getString("role"));
        }
        con.close();
        return account;
    }

    public Account checkInf(int id) throws SQLException {
        Account account = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from Account where id = ?");
        stm.setInt(1, id);
        ResultSet rs = stm.executeQuery();
        if (rs.next()) {
            account = new Account();
            account.setId(rs.getInt("id"));
            account.setEmail(rs.getString("email"));
            account.setPassword(rs.getString("password"));
            account.setName(rs.getString("name"));
            account.setAddress(rs.getString("address"));
            account.setPhone(rs.getString("phone"));
            account.setRole(rs.getString("role"));
        }
        con.close();
        return account;
    }

    public void update(String name, String address, String phone, int id) throws SQLException {
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("update Account set name = ?, address = ?, phone = ? where id = ?");
        stm.setString(1, name);
        stm.setString(2, address);
        stm.setString(3, phone);
        stm.setInt(4, id);
        int count = stm.executeUpdate();
        con.close();
    }

    public void updateByAdmin(String name, String address, String phone, String email, String password, String role, int id) throws SQLException, NoSuchAlgorithmException {
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("update Account set name = ?, address = ?, phone = ?, email = ?, password = ?, role = ? where id = ?");
        stm.setString(1, name);
        stm.setString(2, address);
        stm.setString(3, phone);
        stm.setString(4, email);
        stm.setString(5, Hasher.hash(password));
        stm.setString(6, role);
        stm.setInt(7, id);
        int count = stm.executeUpdate();
        con.close();
    }

    public Account checkPass(String password, int id) throws SQLException {
        Account account = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from Account where [password] = ? and id = ?");
        stm.setString(1, password);
        stm.setInt(2, id);
        ResultSet rs = stm.executeQuery();
        if (rs.next()) {
            account = new Account();
            account.setId(rs.getInt("id"));
            account.setEmail(rs.getString("email"));
            account.setPassword(rs.getString("password"));
            account.setName(rs.getString("name"));
            account.setAddress(rs.getString("address"));
            account.setPhone(rs.getString("phone"));
            account.setRole(rs.getString("role"));
        }
        con.close();
        return account;
    }

    public Account changePass(String password, int id) throws SQLException, NoSuchAlgorithmException {
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("update Account set [password] = ? where id = ?");
        stm.setString(1, Hasher.hash(password));
        stm.setInt(2, id);
        int count = stm.executeUpdate();
        return null;
    }

    public void remove(int id) throws SQLException {
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("delete Account where id = ?");
        stm.setInt(1, id);
        int count = stm.executeUpdate();
        con.close();
    }
}
