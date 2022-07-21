package com.ultralesson.capstoneProject.shoppingcart;

public abstract class Item {
    private String name;
    private int quantity;
    public Item(String name,int quantity){
        this.name=name;
        this.quantity=quantity;
    }
    abstract public int priceCalculator();
    abstract public void setPrice(int price);

    public String getName(){
        return this.name;
    }
    public void changeQuantity(int addQuantity){
        this.quantity+=addQuantity;
    };
    public int getQuantity() {
        return quantity;
    }
}
