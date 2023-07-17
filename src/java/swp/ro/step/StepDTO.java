/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.step;

/**
 *
 * @author Admin
 */
public class StepDTO {
    private int stepID;
    private int recipeID;
    private int stepNumber;
    private String instructions;

    public StepDTO() {
    }

    public StepDTO(int stepID, int recipeID, int stepNumber, String instruction) {
        this.stepID = stepID;
        this.recipeID = recipeID;
        this.stepNumber = stepNumber;
        this.instructions = instruction;
    }

    public int getStepID() {
        return stepID;
    }

    public void setStepID(int stepID) {
        this.stepID = stepID;
    }

    public int getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }

    public int getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(int stepNumber) {
        this.stepNumber = stepNumber;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
    
}
