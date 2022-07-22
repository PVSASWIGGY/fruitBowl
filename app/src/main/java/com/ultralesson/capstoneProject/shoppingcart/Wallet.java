package com.ultralesson.capstoneProject.shoppingcart;

public class Wallet {
    private String name;
    private double money;
    public Wallet(String name){
        money=0;
        this.name=name;
    }

    public double getMoney() {
        return money;
    }
    public void addMoney(int money) {
        this.money += money;
    }
    public boolean deductMoney(double money){
        if(this.money>money) {
            this.money -= money;
            return true;
        }
        else
            return false;
    }

    public String getName() {
        return name;
    }
}
