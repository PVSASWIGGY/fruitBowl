package com.ultralesson.capstoneProject.shoppingcart;

public class Person {
    private String name;
    private Wallet wallet;
    private ShoppingCart shoppingCart;

    public Person(String name){
        this.name=name;
        shoppingCart=new ShoppingCart();
        wallet=new Wallet();
    }
    public void addItem(Item newItem){
        shoppingCart.addItem(newItem);
    }

    public ShoppingCart getShoppingCart(){
        return this.shoppingCart;
    }
    public void payBill(){
        if(wallet.deductMoney(shoppingCart.getTotalPrice())){
            System.out.println("Payment successful");
        }
        else
            System.out.println("Insufficient balance");
    }

    public Wallet getWallet() {
        return this.wallet;
    }
}