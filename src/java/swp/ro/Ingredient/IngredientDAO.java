/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.Ingredient;

import DBUtil.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author truc0
 */
public class IngredientDAO {
    private static final String INSERT_INGREDIENT="INSERT INTO Ingredient (recipeID,ingredientName,quantity,unit) Values(?,?,?,?)";

    
    public boolean insertIngredient(IngredientDTO idto) throws SQLException {
boolean check = false;
       Connection con = null;
       PreparedStatement ptm = null;
       try{
           con=DBUtil.getConnection();
           if(con != null){
               
               ptm=con.prepareStatement(INSERT_INGREDIENT);
               int recipeID = idto.getRecipeID();
               String ingredientName = idto.getIngredientName();
               double quantity = idto.getQuantity();
               String unit = idto.getUnit();
               ptm.setInt(1, idto.getRecipeID());
               ptm.setString(2, idto.getIngredientName());
               ptm.setDouble(3, idto.getQuantity());
               ptm.setString(4, idto.getUnit());
               check = ptm.executeUpdate()>0?true:false;   
           }
           
       }finally{
           if(ptm != null) ptm.close();
           if(con != null) con.close();
       }    
       return check;    
    }   
}
