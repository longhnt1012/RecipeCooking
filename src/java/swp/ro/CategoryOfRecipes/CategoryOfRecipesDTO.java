/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.CategoryOfRecipes;

/**
 *
 * @author truc0
 */
public class CategoryOfRecipesDTO {
    private int corID;
    private int categoryID;
    private int recipeID;
    private String categoryName;
    private String recipeName;
    private boolean status;
    
    public CategoryOfRecipesDTO() {
    }

    public CategoryOfRecipesDTO(int corID, int categoryID, int recipeID, String categoryName, String recipeName, boolean status) {
        this.corID = corID;
        this.categoryID = categoryID;
        this.recipeID = recipeID;
        this.categoryName = categoryName;
        this.recipeName = recipeName;
        this.status = status;
    }

    public int getCorID() {
        return corID;
    }

    public void setCorID(int corID) {
        this.corID = corID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
