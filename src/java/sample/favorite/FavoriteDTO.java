/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.favorite;

/**
 *
 * @author Admin
 */
public class FavoriteDTO {
    private String favoriteID;
    private String recipeID;
    private String cookerID;

    public FavoriteDTO() {
    }

    public FavoriteDTO(String favoriteID, String recipeID, String cookerID) {
        this.favoriteID = favoriteID;
        this.recipeID = recipeID;
        this.cookerID = cookerID;
    }

    public String getFavoriteID() {
        return favoriteID;
    }

    public void setFavoriteID(String favoriteID) {
        this.favoriteID = favoriteID;
    }

    public String getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(String recipeID) {
        this.recipeID = recipeID;
    }

    public String getCookerID() {
        return cookerID;
    }

    public void setCookerID(String cookerID) {
        this.cookerID = cookerID;
    }
    
    
}
