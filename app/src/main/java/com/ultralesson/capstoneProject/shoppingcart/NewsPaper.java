package com.ultralesson.capstoneProject.shoppingcart;

public class NewsPaper extends Item{
    private static int price=5;
    public NewsPaper(int quantity){
        super("newspaper",quantity);
    }
    @Override
    public int priceCalculator() {
        return this.getQuantity()*price;
    }

    public void setPrice(int price) {
        NewsPaper.price=price;
    }
}