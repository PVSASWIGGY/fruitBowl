package com.ultralesson.capstoneProject.fruitbowl;

import java.util.ArrayList;
import java.util.List;

public class FruitsSegregator {
    public Basket segregateByName(Bowl bowl, Basket basket){
        ArrayList<Fruit> fruits = bowl.getFruits();
        List<String> namesArray = fruits.stream().map(fruit -> fruit.getName()).toList().stream().distinct().toList();
        for(int i=0;i<fruits.size();i++){
           int j=namesArray.indexOf(fruits.get(i).getName());
           basket.addFruit(j%basket.getNoOfLayers(),fruits.get(i));
        }
        return basket;
    }
    public Basket segregateByColor(Bowl bowl, Basket basket){
        ArrayList<Fruit> fruits = bowl.getFruits();
        List<Color> colorsArray = fruits.stream().map(fruit -> fruit.getColor()).toList().stream().distinct().toList();
        for(int i=0;i<fruits.size();i++){
            int j=colorsArray.indexOf(fruits.get(i).getColor())-1;
            basket.addFruit(j%basket.getNoOfLayers(),fruits.get(i));
        }
        return basket;
    }
    public Basket segregateByTaste(Bowl bowl, Basket basket){
        ArrayList<Fruit> fruits = bowl.getFruits();
        List<Taste> tastesArray = fruits.stream().map(fruit -> fruit.getTaste()).toList().stream().distinct().toList();
        for(int i=0;i<fruits.size();i++){
            int j=tastesArray.indexOf(fruits.get(i).getTaste());
            basket.addFruit(j% basket.getNoOfLayers(),fruits.get(i));
        }
        return basket;
    }
}