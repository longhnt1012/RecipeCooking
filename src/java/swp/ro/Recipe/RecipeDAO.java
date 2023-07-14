/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.Recipe;

import DBUtil.DBUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import swp.ro.User.UserDTO;

/**
 *
 * @author truc0
 */
public class RecipeDAO {

    private static final String SEARCH = "SELECT recipeID, userID, recipeName, datePost, description, cookingTime, imageRecipe FROM Recipe where recipeName like ? AND STATUS =1";
    private static final String SEARCH_RECIPE = "SELECT recipeID FROM Recipe where recipeName = ? ";
    private static final String SEARCH_CATETAGORY = "select recipeID, userID, recipeName, datePost, description, cookingTime, imageRecipe,ID, c.categoryID, c.categoryName from \n"
            + "(SELECT r.recipeID, userID, recipeName, datePost, description, cookingTime, imageRecipe,ID, categoryID FROM  [Recipe] r, [CategoryOfRecipes] C \n"
            + " WHERE r.recipeID=c.recipeID ) as[RC] inner join [Category] c on [RC].categoryID=c.categoryID where c.categoryName=?";
    private static final String SEARCH_USER = "SELECT * FROM [User] WHERE userID IN (SELECT distinct userID FROM Recipe where recipeName like ? AND STATUS =1 )";
    private static final String SEARCH_NAME_RECIPE_HOME = "SELECT recipeID, userID, recipeName, datePost, description, cookingTime, imageRecipe FROM Recipe where recipeName = ? AND STATUS =1";
    //Admin
    private static final String UPDATE = "UPDATE [Recipe] SET [recipeName] = ?, [description] = ?, [cookingTime] = ?, [imageRecipe] = ?, [status] = ? WHERE [recipeID] = ?";
    private static final String REMOVE_RECIPE = "DELETE [Rating] WHERE recipeID = ?\n"
            + "DELETE [Feedback] WHERE recipeID = ?\n"
            + "DELETE [MealPlanning] WHERE recipeID = ?\n"
            + "DELETE [FavoriteRecipe] WHERE recipeID = ?\n"
            + "DELETE [CategoryOfRecipes] WHERE recipeID = ?\n"
            + "DElETE [IngredientOfRecipe] WHERE recipeID = ?\n"
            + "DElETE [SavedRecipes] WHERE recipeID = ?\n"
            + "DELETE [Recipe] WHERE recipeID = ?";
    private static final String RECENT_RECIPE = "SELECT TOP 5 * FROM [Recipe] re JOIN [User] u "
                                                + "ON re.userID = u.userID ORDER BY datePost DESC";
    private static final String READ = "SELECT * FROM [Recipe] a JOIN [User] b ON a.userID = b.userID";
    private static final String COUNT_RECIPE = "SELECT COUNT(recipeID) AS countRecipe FROM [Recipe]";
    
    public List<RecipeDTO> getListSearchRecipe(String search) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        List<RecipeDTO> listRecipe = new ArrayList<>();

        try {
            conn = DBUtil.getConnection1();
            if (conn != null) {
                ptm = conn.prepareStatement(SEARCH);
                ptm.setString(1, "%" + search + "%");
                rs = ptm.executeQuery();
                while (rs.next()) {
                    RecipeDTO recipe = new RecipeDTO();
                    recipe.setRecipeID(rs.getInt("recipeID"));
                    recipe.setUserID(rs.getInt("userID"));
                    recipe.setRecipeName(rs.getString("recipeName"));
                    recipe.setDatePost(rs.getDate("datePost"));
                    recipe.setDescription(rs.getString("description"));
                    recipe.setCookingTime(rs.getInt("cookingTime"));
                    recipe.setImageRecipe(rs.getString("imageRecipe"));
                    listRecipe.add(recipe);
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
        return listRecipe;
    }

    public String getSearchRecipe(String search) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        String recipe = null;
        try {
            conn = DBUtil.getConnection1();
            if (conn != null) {
                ptm = conn.prepareStatement(SEARCH);
                ptm.setString(1, search);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    String recipeID = rs.getString("recipeID");
                    recipe = recipeID;
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
        return recipe;
    }

    public List<RecipeDTO> getListCategotyRecipe(String searchCategory) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        List<RecipeDTO> listRecipe = new ArrayList<>();

        try {
            conn = DBUtil.getConnection1();
            if (conn != null) {
                ptm = conn.prepareStatement(SEARCH_CATETAGORY);
                ptm.setString(1, searchCategory);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    RecipeDTO recipe = new RecipeDTO();
                    recipe.setRecipeID(rs.getInt("recipeID"));
                    recipe.setUserID(rs.getInt("userID"));
                    recipe.setRecipeName(rs.getString("recipeName"));
                    recipe.setDatePost(rs.getDate("datePost"));
                    recipe.setDescription(rs.getString("description"));
                    recipe.setCookingTime(rs.getInt("cookingTime"));
                    recipe.setImageRecipe(rs.getString("imageRecipe"));
                    listRecipe.add(recipe);
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
        return listRecipe;
    }

    public List<RecipeDTO> getListRecipeHome() throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        List<RecipeDTO> listRecipe = new ArrayList<>();
        List<String> listNameRecipe = new ArrayList<>();
        listNameRecipe.add("Homemade Pho");
        listNameRecipe.add("Easy Spaghetti Bolognese");
        listNameRecipe.add("Beefsteak");
        listNameRecipe.add("Baked Salmon - Leek parcel");
        listNameRecipe.add("Chicken Fries");
        listNameRecipe.add("Aubergine - chickpea stew");
        listNameRecipe.add("Baked Kale Chips");
        listNameRecipe.add("Maple Salmon");
        listNameRecipe.add("Miso Soup");
        listNameRecipe.add("Green Salad");
        listNameRecipe.add("Hambuger Vegetables");
        listNameRecipe.add("Pineapple And Banana Smoothie");
        listNameRecipe.add("Baked Salmon - Leek Parcel");
        listNameRecipe.add("Pho");
        listNameRecipe.add("Broken Rice");

        try {
            conn = DBUtil.getConnection1();
            if (conn != null) {
                for (String list : listNameRecipe) {
                    ptm = conn.prepareStatement(SEARCH_NAME_RECIPE_HOME);
                    ptm.setString(1, list.toString());
                    rs = ptm.executeQuery();
                    while (rs.next()) {
                        RecipeDTO recipe = new RecipeDTO();
                        recipe.setRecipeID(rs.getInt("recipeID"));
                        recipe.setUserID(rs.getInt("userID"));
                        recipe.setRecipeName(rs.getString("recipeName"));
                        recipe.setDatePost(rs.getDate("datePost"));
                        recipe.setDescription(rs.getString("description"));
                        recipe.setCookingTime(rs.getInt("cookingTime"));
                        recipe.setImageRecipe(rs.getString("imageRecipe"));
                        listRecipe.add(recipe);
                    }
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
        return listRecipe;
    }

    public int countPro() throws SQLException, ClassNotFoundException {
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement("select count(*) from [Recipe]");
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            return rs.getInt(1);
        }
        return 0;
    }

    public List<RecipeDTO> getAll() throws SQLException, ClassNotFoundException {
        List<RecipeDTO> list = null;
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement("select * from [Recipe]");
        ResultSet rs = stm.executeQuery();
        list = new ArrayList<>();
        while (rs.next()) {
            RecipeDTO recipe = new RecipeDTO();
            recipe.setRecipeID(rs.getInt("recipeID"));
            recipe.setUserID(rs.getInt("userID"));
            recipe.setRecipeName(rs.getString("recipeName"));
            recipe.setDatePost(rs.getDate("datePost"));
            recipe.setDescription(rs.getString("description"));
            recipe.setCookingTime(rs.getFloat("cookingTime"));
            recipe.setImageRecipe(rs.getString("imageRecipe"));
            recipe.setStatus(rs.getBoolean("status"));
            list.add(recipe);
        }
        return list;
    }

    public List<RecipeDTO> pageIndex(int index) throws SQLException, ClassNotFoundException {
        List<RecipeDTO> list = null;
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement("select * from [Recipe] a join [User] b"
                + " on a.userID = b.userID order by [recipeID] "
                + "offset ? rows fetch next 9 rows only"
        );
        stm.setInt(1, (index - 1) * 9);
        ResultSet rs = stm.executeQuery();
        list = new ArrayList<>();
        while (rs.next()) {
            RecipeDTO recipe = new RecipeDTO();
            recipe.setRecipeID(rs.getInt("recipeID"));
            recipe.setUserID(rs.getInt("userID"));
            recipe.setRecipeName(rs.getString("recipeName"));
            recipe.setUserName(rs.getString("userName"));
            recipe.setDatePost(rs.getDate("datePost"));
            recipe.setDescription(rs.getString("description"));
            recipe.setCookingTime(rs.getFloat("cookingTime"));
            recipe.setImageRecipe(rs.getString("imageRecipe"));
//            recipe.setUserCount(rs.getInt("userCount"));
//            recipe.setTotalScore(rs.getInt("totalScore"));
            recipe.setStatus(rs.getBoolean("status"));
            list.add(recipe);
        }
        return list;
    }

    public List<RecipeDTO> myPro(int userID) throws SQLException, ClassNotFoundException {
        List<RecipeDTO> list = null;
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement("select * from [Recipe] where userID = ? and [status] = 1");
        stm.setInt(1, userID);
        ResultSet rs = stm.executeQuery();
        list = new ArrayList<>();
        while (rs.next()) {
            RecipeDTO recipe = new RecipeDTO();
            recipe.setRecipeID(rs.getInt("recipeID"));
            recipe.setUserID(rs.getInt("userID"));
            recipe.setRecipeName(rs.getString("recipeName"));
            recipe.setDatePost(rs.getDate("datePost"));
            recipe.setDescription(rs.getString("description"));
            recipe.setCookingTime(rs.getFloat("cookingTime"));
            recipe.setImageRecipe(rs.getString("image"));
            recipe.setStatus(rs.getBoolean("status"));
            list.add(recipe);
        }
        con.close();
        return list;
    }

    public void addPro(RecipeDTO recipe) throws SQLException, ClassNotFoundException {
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement("insert [Recipe] values(?, ?, ?, ?, ?, ?, ?, 0)");
        stm.setInt(1, recipe.getUserID());
        stm.setString(2, recipe.getRecipeName());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        stm.setString(3, sdf.format(recipe.getDatePost()));
        stm.setString(4, recipe.getDescription());
        stm.setDouble(5, recipe.getCookingTime());
        stm.setString(6, recipe.getImageRecipe());
        stm.executeUpdate();
        con.close();
    }

    public RecipeDTO updatePro(String name, String description, double cookingTime, String image, int recipeID)
            throws SQLException, ClassNotFoundException {
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement("update [Recipe] set [recipeName] = ?, "
                + "[description] = ?, [cookingTime] = ?, "
                + "[image] = ?, [status] = 0 where [recipeID] = ?");
        stm.setString(1, name);
        stm.setString(2, description);
        stm.setDouble(3, cookingTime);
        stm.setString(4, image);
        stm.setInt(5, recipeID);
        int count = stm.executeUpdate();
        con.close();
        return null;
    }

    public void deletePro(int recipeID) throws SQLException, ClassNotFoundException {
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement("delete [Recipe] where recipeID = ?");
        stm.setInt(1, recipeID);
        int count = stm.executeUpdate();
        con.close();
    }

    public RecipeDTO getOne(int recipeID) throws SQLException, ClassNotFoundException {
        RecipeDTO recipe = null;
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement("select * from [Recipe] a join [User] b on a.userID = b.userID where a.recipeID = ?");
        stm.setInt(1, recipeID);
        ResultSet rs = stm.executeQuery();
        if (rs.next()) {
            recipe = new RecipeDTO();
            recipe.setRecipeID(rs.getInt("recipeID"));
            recipe.setUserID(rs.getInt("userID"));
            recipe.setRecipeName(rs.getString("recipeName"));
            recipe.setDatePost(rs.getDate("datePost"));
            recipe.setDescription(rs.getString("description"));
            recipe.setCookingTime(rs.getFloat("cookingTime"));
            recipe.setUserName(rs.getString("userName"));
            recipe.setImageRecipe(rs.getString("imageRecipe"));
            recipe.setStatus(rs.getBoolean("status"));
        }
        con.close();
        return recipe;
    }

    public void addRecipeForUser(int recipeID) throws SQLException, ClassNotFoundException {
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement("update Recipe set [status] = 1 where recipeID = ?");
        stm.setInt(1, recipeID);
        int count = stm.executeUpdate();
        con.close();
    }
    
    //Admin method
    public List<RecipeDTO> load() throws SQLException {
        List<RecipeDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection1();
            ptm = conn.prepareCall(READ);
            rs = ptm.executeQuery();
            while (rs.next()) {
                int recipeID = rs.getInt("recipeID");
                int userID = rs.getInt("userID");
                String recipeName = rs.getString("recipeName");
                Date datePost = rs.getDate("datePost");
                String description = rs.getString("description");
                float cookingTime = rs.getFloat("cookingTime");
                boolean status = rs.getBoolean("status");
                String image = rs.getString("imageRecipe");
                String userName = rs.getString("userName");
                list.add(new RecipeDTO(recipeID, userID, recipeName, datePost,  description, cookingTime, image, status, userName));
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
    
    public boolean update(RecipeDTO updateRecipe) throws SQLException {
        boolean checkUpdate = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtil.getConnection1();
            if (conn != null) {
                ptm = conn.prepareStatement(UPDATE);
                ptm.setString(1, updateRecipe.getRecipeName());
                ptm.setString(3, updateRecipe.getDescription());
                ptm.setFloat(4, updateRecipe.getCookingTime());
                ptm.setString(5, updateRecipe.getImageRecipe());
                ptm.setBoolean(6, updateRecipe.isStatus());
                ptm.setInt(7, updateRecipe.getRecipeID());
                checkUpdate = ptm.executeUpdate() > 0 ? true : false;
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
        return checkUpdate;
    }

    public boolean removeRecipe(int recipeID) throws SQLException {
        boolean checkRemove = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtil.getConnection1();
            if (conn != null) {
                ptm = conn.prepareStatement(REMOVE_RECIPE);
                ptm.setInt(1, recipeID);
                ptm.setInt(2, recipeID);
                ptm.setInt(3, recipeID);
                ptm.setInt(4, recipeID);
                ptm.setInt(5, recipeID);
                ptm.setInt(6, recipeID);
                ptm.setInt(7, recipeID);
                ptm.setInt(8, recipeID);
                checkRemove = ptm.executeUpdate() > 0 ? true : false;
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
        return checkRemove;
    }
    
    public List<RecipeDTO> recentRecipes() throws SQLException {
        List<RecipeDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection1();
            ptm = conn.prepareCall(RECENT_RECIPE);
            rs = ptm.executeQuery();
            while (rs.next()) {
                int recipeID = rs.getInt("recipeID");
                int userID = rs.getInt("userID");
                String recipeName = rs.getString("recipeName");
                Date datePost = rs.getDate("datePost");
                String description = rs.getString("description");
                float cookingTime = rs.getFloat("cookingTime");
                boolean status = rs.getBoolean("status");
                String image = rs.getString("imageRecipe");
                String userName = rs.getString("userName");
                list.add(new RecipeDTO(recipeID, userID, recipeName, datePost, description, cookingTime, image, status, userName));
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
    
    public int countRecipes() throws SQLException, ClassNotFoundException {
        Connection con = DBUtil.getConnection1();
        PreparedStatement stm = con.prepareStatement(COUNT_RECIPE);
        ResultSet rs = stm.executeQuery();
        int count = 0;
        try {
            if (rs.next()) {
                count = rs.getInt("countRecipe");
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
