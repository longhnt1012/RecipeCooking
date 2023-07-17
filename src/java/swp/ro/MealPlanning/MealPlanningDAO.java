/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.MealPlanning;

import DBUtil.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import swp.ro.savedRecipes.SavedRecipesDTO;

/**
 *
 * @author truc0
 */
public class MealPlanningDAO {
     private static final String INSERT="INSERT INTO tblMealPlanning(userID,savedRecipeID,date) VALUES(?,?,?)";
    
    
     public boolean insert (MealPlanningDTO planning) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn= DBUtil.getConnection1();
            if(conn!= null){
                ptm= conn.prepareStatement(INSERT);
                ptm.setInt(1,  planning.getUserID() );
                ptm.setInt(2,planning.getSavedRecipeID());
                ptm.setDate(3, planning.getDate());
                  check= ptm.executeUpdate()>0?true:false;
                
            }   
           
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(ptm!= null) ptm.close();
            if(conn!= null) conn.close();
        }
        
        
        return check;
    }
}
