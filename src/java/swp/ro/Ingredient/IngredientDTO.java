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
    private int recipeID;
<<<<<<< HEAD
    private double quantity;
=======
    private float quantity;
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
    private String unit;

    public IngredientDTO() {
    }

<<<<<<< HEAD
    public IngredientDTO(int ingredientID, String ingredientName, int recipeID, double quantity, String unit) {
=======
    public IngredientDTO(int ingredientID, String ingredientName, int recipeID, float quantity, String unit) {
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
        this.ingredientID = ingredientID;
        this.ingredientName = ingredientName;
        this.recipeID = recipeID;
        this.quantity = quantity;
        this.unit = unit;
<<<<<<< HEAD
    }
     public IngredientDTO(String ingredientName, int recipeID, double quantity, String unit) {
        this.ingredientID = ingredientID;
        this.ingredientName = ingredientName;
        this.recipeID = recipeID;
        this.quantity = quantity;
        this.unit = unit;
=======
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
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

    public int getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }

<<<<<<< HEAD
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
=======
    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
<<<<<<< HEAD

=======
   
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
    @Override
    public String toString() {
        return "IngredientDTO{" + "ingredientID=" + ingredientID + ", ingredientName=" + ingredientName + ", recipeID=" + recipeID + ", quantity=" + quantity + ", unit=" + unit + '}';
    }

    
}
