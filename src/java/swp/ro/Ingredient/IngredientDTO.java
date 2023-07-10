/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.Ingredient;

/**
 *
 * @author truc0
 */
public class IngredientDTO {
    private int ingredientID;
    private String ingredientName;

    public IngredientDTO() {
    }

    public IngredientDTO(int ingredientID, String ingredientName) {
        this.ingredientID = ingredientID;
        this.ingredientName = ingredientName;
    }

    public int getIngredientID() {
        return ingredientID;
    }

    public void setIngredientID(int ingredientID) {
        this.ingredientID = ingredientID;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    @Override
    public String toString() {
        return "IngredientDTO{" + "ingredientID=" + ingredientID + ", ingredientName=" + ingredientName + '}';
    }
    
}
