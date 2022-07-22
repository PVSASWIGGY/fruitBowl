package com.ultralesson.capstoneProject.shoppingcart;

public class App {
    public static void main(String[] args) {
        Wallet wallet=new Wallet("Akhil");
        ShoppingCart shoppingCart=new ShoppingCart();
        Person person=new Person("Akhil",wallet,shoppingCart);
        Item apple=new Item("apple",2);
        person.addItem(apple);
        Item milk=new Item("milk",3);
        person.addItem(milk);
        Item newsPaper=new Item("news paper",1);
        person.addItem(newsPaper);
        System.out.println(person.getShoppingCart().getTotalPrice());
        person.getWallet().addMoney(500);
        person.payBill();
        System.out.println(person.getWallet().getMoney());
    }
}