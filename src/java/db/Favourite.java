/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phamt
 */
public class Favourite {
    private List<Item> items;
    public Favourite() {
        this.items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    
    public Item getItemById(int id) {
        for(Item item: items) {
            if(item.getProduct().getId() == id) 
                return item;          
        }
        return null;
    }
    
    public int getQuantity(int id) {
        return getItemById(id).getQuality();
    }
    
    public void addItem(Item item) {       
            items.add(item); 
    }
    
    public void removeItem(int id) {
        if(getItemById(id) != null) {
            items.remove(getItemById(id));
        }
    }
}
