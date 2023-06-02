/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.detailCategory;

/**
 *
 * @author Admin
 */
public class CategoryOfRecipesDTO {
    private int ID;
    private int categoryID;
    private int recipeID;
    
    public CategoryOfRecipesDTO() {
    }

    public CategoryOfRecipesDTO(int ID, int categoryID, int recipeID) {
        this.ID = ID;
        this.categoryID = categoryID;
        this.recipeID = recipeID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    
}
