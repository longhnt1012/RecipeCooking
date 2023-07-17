/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.MealPlanning;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author truc0
 */
public class MealPlanningDTO {
    private int planningID;
    private int userID;
    private int savedRecipeID;
  
    private Date date;

    public MealPlanningDTO() {
    }

    public MealPlanningDTO(int planningID, int userID, int savedRecipeID,  Date date) {
        this.planningID = planningID;
        this.userID = userID;
        this.savedRecipeID = savedRecipeID;
      
        this.date = date;
    }

    public int getPlanningID() {
        return planningID;
    }

    public void setPlanningID(int planningID) {
        this.planningID = planningID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getSavedRecipeID() {
        return savedRecipeID;
    }

    public void setSavedRecipeID(int savedRecipeID) {
        this.savedRecipeID = savedRecipeID;
    }

   

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MealPlanningDTO{" + "planningID=" + planningID + ", userID=" + userID + ", savedRecipeID=" + savedRecipeID + ", date=" + date + '}';
    }
    
}
