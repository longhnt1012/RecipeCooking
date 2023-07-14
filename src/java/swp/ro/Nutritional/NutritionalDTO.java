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
    private float calories;
    private float fat;
    private float proteins;
    private float carb;
    private float sugar;

    public NutritionalDTO() {
    }

    public NutritionalDTO(int nutritionalID, String name, float calories, float fat, float proteins, float carb, float sugar) {
        this.nutritionalID = nutritionalID;
        this.name = name;
        this.calories = calories;
        this.fat = fat;
        this.proteins = proteins;
        this.carb = carb;
        this.sugar = sugar;
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

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public float getProteins() {
        return proteins;
    }

    public void setProteins(float proteins) {
        this.proteins = proteins;
    }

    public float getCarb() {
        return carb;
    }

    public void setCarb(float carb) {
        this.carb = carb;
    }

    public float getSugar() {
        return sugar;
    }

    public void setSugar(float sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "NutritionalDTO{" + "nutritionalID=" + nutritionalID + ", name=" + name + ", calories=" + calories + ", fat=" + fat + ", proteins=" + proteins + ", carb=" + carb + ", sugar=" + sugar + '}';
    }

    
}
