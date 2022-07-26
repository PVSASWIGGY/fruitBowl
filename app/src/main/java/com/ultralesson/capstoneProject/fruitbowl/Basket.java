package com.ultralesson.capstoneProject.fruitbowl;

import java.util.ArrayList;

public class Basket {
    private int noOfLayers;
    private ArrayList<Bowl> layers;

    public Basket(int noOfLayers){
        this.noOfLayers=noOfLayers;
        layers=new ArrayList<>();
        for(int i=0;i<noOfLayers;i++)
            layers.add(new Bowl());
    }

    public int getNoOfLayers() {
        return noOfLayers;
    }

    public ArrayList<Bowl> getLayers() {
        return layers;
    }

    public void addFruit(int layerNo,Fruit fruit) {
        if(layerNo>noOfLayers-1)
            return;
        this.layers.get(layerNo).addFruits(fruit);
    }
}
