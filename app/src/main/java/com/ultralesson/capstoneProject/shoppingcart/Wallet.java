package com.ultralesson.capstoneProject.shoppingcart;

public class Wallet {
    private int money;
    public Wallet(){
        money=0;
    }

    public int getMoney() {
        return money;
    }
    public void addMoney(int money) {
        this.money += money;
    }
    public boolean deductMoney(int money){
        if(this.money>money) {
            this.money -= money;
            return true;
        }
        else
            return false;
    }
}
