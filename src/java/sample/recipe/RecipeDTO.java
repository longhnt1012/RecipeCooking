/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.recipe;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Admin
 */
public class RecipeDTO {
    private int recipeID;
    private int userID;
    private String recipeName;
    private Date datePost;
    private String introduction;
    private String description;
    private float cookingTime;
    private int levelID;
    private float calories;
    private int cuisineID;
    private int rateID;
    private String image;
    

    public RecipeDTO() {
    }

    public RecipeDTO(int recipeID, int userID, String recipeName, Date datePost, String introduction, String description, float cookingTime, int levelID, float calories, int cuisineID, int rateID, String image) {
        this.recipeID = recipeID;
        this.userID = userID;
        this.recipeName = recipeName;
        this.datePost = datePost;
        this.introduction = introduction;
        this.description = description;
        this.cookingTime = cookingTime;
        this.levelID = levelID;
        this.calories = calories;
        this.cuisineID = cuisineID;
        this.rateID = rateID;
        this.image = image;
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

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(float cookingTime) {
        this.cookingTime = cookingTime;
    }

    public int getLevelID() {
        return levelID;
    }

    public void setLevelID(int levelID) {
        this.levelID = levelID;
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public int getCuisineID() {
        return cuisineID;
    }

    public void setCuisineID(int cuisineID) {
        this.cuisineID = cuisineID;
    }

    public int getRateID() {
        return rateID;
    }

    public void setRateID(int rateID) {
        this.rateID = rateID;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
}
