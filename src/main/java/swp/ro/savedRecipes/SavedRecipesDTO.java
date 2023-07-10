/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.savedRecipes;

/**
 *
 * @author truc0
 */
public class SavedRecipesDTO {
    private int savedRecipeID;
    private int recipeID;
    private int userID;

    public SavedRecipesDTO() {
    }

    public SavedRecipesDTO(int savedRecipeID, int recipeID, int userID) {
        this.savedRecipeID = savedRecipeID;
        this.recipeID = recipeID;
        this.userID = userID;
    }

    public int getSavedRecipeID() {
        return savedRecipeID;
    }

    public void setSavedRecipeID(int savedRecipeID) {
        this.savedRecipeID = savedRecipeID;
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

    @Override
    public String toString() {
        return "SavedRecipesDTO{" + "savedRecipeID=" + savedRecipeID + ", recipeID=" + recipeID + ", userID=" + userID + '}';
    }
    
}
