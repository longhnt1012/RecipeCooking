/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.Step;

import DBUtil.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author My PC
 */
public class StepDAO {

    private static final String INSERT_STEP="INSERT INTO Step (recipeID,stepNumber,instructions) Values(?,?,?)";
   public boolean insertStep(StepDTO step) throws SQLException {
       boolean check = false;
       Connection con = null;
       PreparedStatement ptm = null;
       try{
           con=DBUtil.getConnection();
           if(con != null){
               ptm=con.prepareStatement(INSERT_STEP);
               int recipeID =  step.getRecipeID();
               int stepNumber = step.getStepNumber();
               String instructions = step.getInstructions();
               ptm.setInt(1, step.getRecipeID());
               ptm.setInt(2, step.getStepNumber());
               ptm.setString(3, step.getInstructions());
               check = ptm.executeUpdate()>0?true:false;   
           }
           
       }finally{
           if(ptm != null) ptm.close();
           if(con != null) con.close();
       }    
       return check;    }
    
}
