package com.ultralesson.capstoneProject.shoppingcart;

public class Apple extends Item {
    private static int price=100;
    public Apple(int quantity){
        super("apple",quantity);
    }
    public int priceCalculator(){
        return this.getQuantity()*price;
    }

    public void setPrice(int price) {
        Apple.price=price;
    }

}