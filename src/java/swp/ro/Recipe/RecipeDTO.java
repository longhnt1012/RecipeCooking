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
    private float cookingTime;
    private String imageRecipe;    
    private boolean status;
    private String meal;
    private String userName;

    public RecipeDTO() {
    }

<<<<<<< HEAD
    public RecipeDTO(int recipeID, int userID, String recipeName, Date datePost, String description, double cookingTime, String image, boolean status, String meal, String userName) {
=======
    public RecipeDTO(int recipeID, int userID, String recipeName, Date datePost, String description, float cookingTime, String imageRecipe, boolean status, String userName) {
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
        this.recipeID = recipeID;
        this.userID = userID;
        this.recipeName = recipeName;
        this.datePost = datePost;
        this.description = description;
        this.cookingTime = cookingTime;
        this.imageRecipe = imageRecipe;
        this.status = status;
        this.meal = meal;
        this.userName = userName;
    }

<<<<<<< HEAD
    public RecipeDTO(int recipeID, int userID, String recipeName, Date datePost, String description, double cookingTime, String image, String meal, boolean status) {
        this.recipeID = recipeID;
        this.userID = userID;
        this.recipeName = recipeName;
        this.datePost = datePost;
        this.description = description;
        this.cookingTime = cookingTime;
        this.image = image;
        this.status = status;
        this.meal = meal;
    }

    public RecipeDTO(int userID, String recipeName, Date datePost, String description, double cookingTime, String image, String meal, boolean status) {
        this.userID = userID;
        this.recipeName = recipeName;
        this.datePost = datePost;
        this.description = description;
        this.cookingTime = cookingTime;
        this.image = image;
        this.status = status;
        this.meal = meal;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public int getRecipeID() {
=======
   public int getRecipeID() {
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
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

    public float getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(float cookingTime) {
        this.cookingTime = cookingTime;
    }

    public String getImageRecipe() {
        return imageRecipe;
    }

    public void setImageRecipe(String imageRecipe) {
        this.imageRecipe = imageRecipe;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
<<<<<<< HEAD

=======
    
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
}
