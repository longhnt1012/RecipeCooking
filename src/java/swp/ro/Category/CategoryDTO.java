
package swp.ro.Category;



public class CategoryDTO {
    private int categoryID;
    private String categoryName;
<<<<<<< HEAD
    private String imageCate;
=======
    private String image;
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71

    public CategoryDTO() {
    }

    public CategoryDTO(int categoryID, String categoryName, String image) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.image = image;
    }
<<<<<<< HEAD

    public CategoryDTO(int categoryID, String categoryName, String imageCate) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.imageCate = imageCate;
    }

=======
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
    
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

<<<<<<< HEAD
    public String getImageCate() {
        return imageCate;
    }

    public void setImageCate(String imageCate) {
        this.imageCate = imageCate;
=======
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
    }

    
    @Override
    public String toString() {
        return "CategoryDTO{" + "categoryID=" + categoryID + ", categoryName=" + categoryName + '}';
    }
    
}
