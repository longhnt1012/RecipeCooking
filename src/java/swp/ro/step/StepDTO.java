/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<< HEAD
package swp.ro.Step;

/**
 *
 * @author My PC
 */
public class StepDTO {

    private int stepID;
    private int recipeID;
    private String stepNumber;
=======
package swp.ro.step;

/**
 *
 * @author Admin
 */
public class StepDTO {
    private int stepID;
    private int recipeID;
    private int stepNumber;
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
    private String instructions;

    public StepDTO() {
    }

<<<<<<< HEAD
    public StepDTO(int stepID, int recipeID, String stepNumber, String instructions) {
        this.stepID = stepID;
        this.recipeID = recipeID;
        this.stepNumber = stepNumber;
        this.instructions = instructions;
    }

    public StepDTO(int recipeID, String stepNumber, String instructions) {
        this.recipeID = recipeID;
        this.stepNumber = stepNumber;
        this.instructions = instructions;
=======
    public StepDTO(int stepID, int recipeID, int stepNumber, String instruction) {
        this.stepID = stepID;
        this.recipeID = recipeID;
        this.stepNumber = stepNumber;
        this.instructions = instruction;
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
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

<<<<<<< HEAD
    public String getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(String stepNumber) {
=======
    public int getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(int stepNumber) {
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
        this.stepNumber = stepNumber;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
<<<<<<< HEAD

    @Override
    public String toString() {
        return "StepDTO{" + "stepID=" + stepID + ", recipeID=" + recipeID + ", stepNumber=" + stepNumber + ", instructions=" + instructions + '}';
    }

=======
    
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
}
