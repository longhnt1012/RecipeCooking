/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp.ro.CategoryOfRecipes;

/**
 *
 * @author Admin
 */
public class CategoryOfRecipesDTO {
    private int corID;
    private int categoryID;
    private int recipeID;
    private String categoryName;
    private String recipeName;
    
    public CategoryOfRecipesDTO() {
    }

    public CategoryOfRecipesDTO(int corID, int categoryID, int recipeID, String categoryName, String recipeName) {
        this.corID = corID;
        this.categoryID = categoryID;
        this.recipeID = recipeID;
        this.categoryName = categoryName;
        this.recipeName = recipeName;
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
}
