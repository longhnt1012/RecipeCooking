
package swp.ro.CategoryOfRecipes;

public class CategoryOfRecipesDTO {
    private int corID;
    private int categoryID;
    private int recipeID;
    private String categoryName;
    private String recipeName;
    private boolean status;
    
    public CategoryOfRecipesDTO() {
    }

<<<<<<< HEAD
    public CategoryOfRecipesDTO(int ID, int categoryID, int recipeID, String categoryName, String recipeName, boolean status) {
        this.ID = ID;
=======
    public CategoryOfRecipesDTO(int corID, int categoryID, int recipeID, String categoryName, String recipeName, boolean status) {
        this.corID = corID;
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
        this.categoryID = categoryID;
        this.recipeID = recipeID;
        this.categoryName = categoryName;
        this.recipeName = recipeName;
        this.status = status;
    }

    public int getCorID() {
        return corID;
    }

<<<<<<< HEAD
    public void setID(int corID) {
        this.ID = ID;
=======
    public void setCorID(int corID) {
        this.corID = corID;
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
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
