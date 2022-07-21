package com.ultralesson.capstoneProject.shoppingcart;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;
    public ShoppingCart(){
        items= new ArrayList<Item>();
    }
    public int getTotalPrice(){
        int totalPrice=0;
        for(Item item:items)
            totalPrice+= item.priceCalculator();
        return totalPrice;
    }
    public ArrayList<Item> getItems(){
        return items;
    }

    public void addItem(Item newItem) {
        boolean isItemPresent=false;
        for(Item item: items){
            if(item.getName().equals(newItem.getName())){
                item.changeQuantity(newItem.getQuantity());
                isItemPresent=true;
                break;
            }
        }
        if(!isItemPresent){
            items.add(newItem);
        }
    }
}
