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

    @Override
    public String toString() {
        return "CategoryOfRecipesDTO{" + "ID=" + ID + ", categoryID=" + categoryID + ", recipeID=" + recipeID + '}';
    }
    
}
