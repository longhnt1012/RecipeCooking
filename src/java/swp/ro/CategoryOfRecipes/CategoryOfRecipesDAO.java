/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp.ro.CategoryOfRecipes;

import DBUtil.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Admin
 */
public class CategoryOfRecipesDAO {

    private static final String GET_ALL = "SELECT * FROM CategoryOfRecipes A \n"
            + "JOIN Category B ON A.categoryID = B.categoryID\n"
            + "JOIN Recipe C ON A.recipeID = C.recipeID";
    private static final String GET_BY_RECIPEID = "SELECT * FROM CategoryOfRecipes A\n"
            + "JOIN Category B ON A.categoryID = B.categoryID\n"
            + "JOIN Recipe C ON A.recipeID = C.recipeID\n"
            + "WHERE A.recipeID = ?";
    private static final String TAG_CATEGORIES_RECIPES = "INSERT INTO [CategoryOfRecipes](categoryID, recipeID) VALUES(?, ?)";
    private static final String DELETE_CATEGORIES_RECIPES = "DELETE [CategoryOfRecipes] WHERE categoryID = ? AND recipeID = ?";
    private static final String SEARCH_BY_CATEGORIESID = "SELECT * FROM CategoryOfRecipes A JOIN Category B ON A.categoryID = B.categoryID JOIN Recipe C ON A.recipeID = C.recipeID WHERE A.categoryID = ?";

    public List<CategoryOfRecipesDTO> getAll() throws SQLException {
        List<CategoryOfRecipesDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ptm = conn.prepareStatement(GET_ALL);
            rs = ptm.executeQuery();
            while (rs.next()) {
                int corID = rs.getInt("corID");
                int categoryID = rs.getInt("categoryID");
                int recipeID = rs.getInt("recipeID");
                String categoryName = rs.getString("categoryName");
                String recipeName = rs.getString("recipeName");
                list.add(new CategoryOfRecipesDTO(corID, recipeID, categoryID, categoryName, recipeName));
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

    public List<CategoryOfRecipesDTO> getByRecipeID(int recipeID) throws SQLException {
        List<CategoryOfRecipesDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ptm = conn.prepareStatement(GET_BY_RECIPEID);
            ptm.setInt(1, recipeID);
            rs = ptm.executeQuery();
            while (rs.next()){
                int corID = rs.getInt("corID");
                int categoryID = rs.getInt("categoryID");
                String categoryName = rs.getString("categoryName");
                String recipeName = rs.getString("recipeName");
                list.add(new CategoryOfRecipesDTO(corID, categoryID, recipeID, categoryName, recipeName));
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

    public boolean insert(int categoryID, int recipeID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBContext.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(TAG_CATEGORIES_RECIPES);
                ptm.setInt(1, categoryID);
                ptm.setInt(2, recipeID);
                check = ptm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }
    
    public boolean delete(int categoryID, int recipeID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBContext.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(DELETE_CATEGORIES_RECIPES);
                ptm.setInt(1, categoryID);
                ptm.setInt(2, recipeID);
                check = ptm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }
    
    public List<CategoryOfRecipesDTO> searchByCategoryID(int categoryID) throws SQLException {
        List<CategoryOfRecipesDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ptm = conn.prepareStatement(SEARCH_BY_CATEGORIESID);
            ptm.setInt(1, categoryID);
            rs = ptm.executeQuery();
            while(rs.next()){
                int corID = rs.getInt("corID");
                int recipeID = rs.getInt("recipeID");
                String categoryName = rs.getString("categoryName");
                String recipeName = rs.getString("recipeName");
                list.add(new CategoryOfRecipesDTO(corID, categoryID, recipeID, categoryName, recipeName));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
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
