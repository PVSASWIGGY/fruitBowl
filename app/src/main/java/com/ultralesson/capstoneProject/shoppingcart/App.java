package com.ultralesson.capstoneProject.shoppingcart;

public class App {
    public static void main(String[] args) {
        Person person=new Person("Akhil");
        Item apple=new Apple(2);
        person.addItem(apple);
        Item milk=new Milk(3);
        person.addItem(milk);
        Item newsPaper=new NewsPaper(1);
        person.addItem(newsPaper);
        System.out.println(person.getShoppingCart().getTotalPrice());
        person.getWallet().addMoney(500);
        person.payBill();
        System.out.println(person.getWallet().getMoney());
    }
}