/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.recipe;

import java.sql.Time;

/**
 *
 * @author Admin
 */
public class RecipeDTO {
    private String recipeID;
    private String recipeName;
    private String cookingTime;
    private int difficultyLevel;
    private String instructions;
    private String userID;
    private String picture;

    public RecipeDTO() {
    }

    public RecipeDTO(String recipeID, String recipeName, String cookingTime, int difficultyLevel, String instructions, String userID, String picture) {
        this.recipeID = recipeID;
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
        this.difficultyLevel = difficultyLevel;
        this.instructions = instructions;
        this.userID = userID;
        this.picture = picture;
    }

    public String getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(String recipeID) {
        this.recipeID = recipeID;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(String cookingTime) {
        this.cookingTime = cookingTime;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    
    
}
