package com.ultralesson.capstoneProject.shoppingcart;

public class Person {
    private String name;
    private Wallet wallet;
    private ShoppingCart shoppingCart;

    public Person(String name,Wallet wallet,ShoppingCart shoppingCart){
        this.name=name;
        this.wallet=wallet;
        this.shoppingCart=shoppingCart;
    }
    public void addItem(Item newItem){
        shoppingCart.addItem(newItem);
    }

    public ShoppingCart getShoppingCart(){
        return this.shoppingCart;
    }
    public void payBill(){
        if(wallet.deductMoney(0.95*shoppingCart.getTotalPrice())){
            System.out.println("Payment successful");
        }
        else
            System.out.println("Insufficient balance");
    }

    public Wallet getWallet() {
        return this.wallet;
    }
}