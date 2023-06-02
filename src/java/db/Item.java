/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author phamt
 */
public class Item {
    private int quality;
    private Product product;

    public Item(int quantity) {
        this.quality = quantity;
    }

    public Item(int quality, Product product) {
        this.quality = quality;
        this.product = product;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
}
