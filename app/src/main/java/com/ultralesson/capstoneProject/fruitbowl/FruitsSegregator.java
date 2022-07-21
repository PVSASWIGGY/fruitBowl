package com.ultralesson.capstoneProject.fruitbowl;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class FruitsSegregator {
    public TreeSet getFruitsSet(ArrayList<Fruit> fruits){
        TreeSet set=new TreeSet<>();
        fruits.forEach(fruit->{
            set.add(fruit.getName());
        });
        return set;
    }

    public BasketStand segregateByName(Bowl bowl,BasketStand basket){
        ArrayList<Fruit> fruits = bowl.getFruits();
        TreeSet<String> names=getFruitsSet(fruits);
        ArrayList namesArray=new ArrayList<>();
        names.forEach(name->{
            namesArray.add(name);
        });
        for(int i=0;i<fruits.size();i++){
           int j=namesArray.indexOf(fruits.get(i).getName());
           basket.addFruit(j%basket.getNoOfLayers(),fruits.get(i));
        }
        return basket;
    }
    public BasketStand segregateByColor(Bowl bowl,BasketStand basket){
        Set<Color> colors=new TreeSet<>();
        ArrayList<Fruit> fruits = bowl.getFruits();
        fruits.forEach(fruit->{
            colors.add(fruit.getColor());
        });
        ArrayList colorsArray=new ArrayList<>();
        colors.forEach(color->{
            colorsArray.add(color);
        });
        for(int i=0;i<fruits.size();i++){
            int j=colorsArray.indexOf(fruits.get(i).getColor())-1;
            basket.addFruit(j%basket.getNoOfLayers(),fruits.get(i));
        }
        return basket;
    }
    public BasketStand segregateByTaste(Bowl bowl,BasketStand basket){
        Set<Taste> tastes=new TreeSet<>();
        ArrayList<Fruit> fruits = bowl.getFruits();
        fruits.forEach(fruit->{
            tastes.add(fruit.getTaste());
        });
        ArrayList tastesArray=new ArrayList<>();
        tastes.forEach(taste->{
            tastesArray.add(taste);
        });
        for(int i=0;i<fruits.size();i++){
            int j=tastesArray.indexOf(fruits.get(i).getTaste());
            basket.addFruit(j% basket.getNoOfLayers(),fruits.get(i));
        }
        return basket;
    }
}