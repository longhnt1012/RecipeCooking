/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.Recipe;

import java.util.Date;



/**
 *
 * @author truc0
 */

public class RecipeDTO {
    private int recipeID;
    private int userID;
    private String recipeName;
    private Date datePost;
    private String description;
    private double cookingTime;
    private String image;
    private boolean status;

    public RecipeDTO() {
    }

    public RecipeDTO(int recipeID, int userID, String recipeName, Date datePost, String description, double cookingTime, String image, boolean status) {
        this.recipeID = recipeID;
        this.userID = userID;
        this.recipeName = recipeName;
        this.datePost = datePost;
        this.description = description;
        this.cookingTime = cookingTime;
        this.image = image;
        this.status = status;
    }
    
    public RecipeDTO(int userID, String recipeName, Date datePost, String description, double cookingTime, String image, boolean status) {
        this.userID = userID;
        this.recipeName = recipeName;
        this.datePost = datePost;
        this.description = description;
        this.cookingTime = cookingTime;
        this.image = image;
        this.status = status;
    }
    public int getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public Date getDatePost() {
        return datePost;
    }

    public void setDatePost(Date datePost) {
        this.datePost = datePost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(double cookingTime) {
        this.cookingTime = cookingTime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RecipeDTO{" + "recipeID=" + recipeID + ", userID=" + userID + ", recipeName=" + recipeName + ", datePost=" + datePost + ", description=" + description + ", cookingTime=" + cookingTime + ", image=" + image + ", status=" + status + '}';
    }

    
}
