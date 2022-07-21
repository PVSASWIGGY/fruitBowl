package com.ultralesson.capstoneProject.shoppingcart;

public class Milk extends Item{
    private static int price=60;
    public Milk(int quantity){
        super("milk",quantity);
    }
    public int priceCalculator(){
        int newQuantity=(int)Math.ceil(this.getQuantity()*2/3);
        return newQuantity*price;
    }

    @Override
    public void setPrice(int price) {
        Milk.price=price;
    }
}
