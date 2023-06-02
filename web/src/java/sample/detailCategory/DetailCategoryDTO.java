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
public class DetailCategoryDTO {
    private String DcID;
    private String recipeID;
    private String categoryID;

    public DetailCategoryDTO() {
    }

    public DetailCategoryDTO(String DcID, String recipeID, String categoryID) {
        this.DcID = DcID;
        this.recipeID = recipeID;
        this.categoryID = categoryID;
    }

    public String getDcID() {
        return DcID;
    }

    public void setDcID(String DcID) {
        this.DcID = DcID;
    }

    public String getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(String recipeID) {
        this.recipeID = recipeID;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }
    
    
}
