package com.ultralesson.capstoneProject.fruitbowl;

import java.util.ArrayList;

public class Bowl {
    private ArrayList<Fruit> fruits;
    public Bowl(ArrayList<Fruit> fruits){
        this.fruits=fruits;
    }
    public Bowl(){
        this(new ArrayList<Fruit>());
    }
    public ArrayList<Fruit> getFruits() {
        return fruits;
    }
    public void addFruits(Fruit fruit) {
        fruits.add(fruit);
    }
}
