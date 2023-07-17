/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.Nutritional;

/**
 *
 * @author truc0
 */
public class NutritionalDTO {
    private int nutritionalID;
    private String name;
    private int ingredientID;
    private double measurement;

    public NutritionalDTO() {
    }

    public NutritionalDTO(int nutritionalID, String name, int ingredientID, double measurement) {
        this.nutritionalID = nutritionalID;
        this.name = name;
        this.ingredientID = ingredientID;
        this.measurement = measurement;
    }

    public int getNutritionalID() {
        return nutritionalID;
    }

    public void setNutritionalID(int nutritionalID) {
        this.nutritionalID = nutritionalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIngredientID() {
        return ingredientID;
    }

    public void setIngredientID(int ingredientID) {
        this.ingredientID = ingredientID;
    }

    public double getMeasurement() {
        return measurement;
    }

    public void setMeasurement(double measurement) {
        this.measurement = measurement;
    }

    @Override
    public String toString() {
        return "NutritionalDTO{" + "nutritionalID=" + nutritionalID + ", name=" + name + ", ingredientID=" + ingredientID + ", measurement=" + measurement + '}';
    }
    
}
