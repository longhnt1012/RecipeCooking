/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.Category;

/**
 *
 * @author truc0
 */
public class CategoryDTO {
    private int categoryID;
    private String categoryName;
    private String image;

    public CategoryDTO() {
    }

    public CategoryDTO(int categoryID, String categoryName, String image) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.image = image;
    }
    
    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    
    @Override
    public String toString() {
        return "CategoryDTO{" + "categoryID=" + categoryID + ", categoryName=" + categoryName + '}';
    }
    
}
