package com.ultralesson.capstoneProject.shoppingcart;

public class Item {
    private String name;
    private int quantity;
    public Item(String name,int quantity){
        this.name=name;
        this.quantity=quantity;
    }

    public String getName(){
        return this.name;
    }
    public void changeQuantity(int addQuantity){
        this.quantity+=addQuantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public boolean equals(Item obj) {
        return this.name.equals(obj.name);
    }
}
