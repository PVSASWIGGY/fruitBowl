package com.ultralesson.capstoneProject.fruitbowl;

public class BasketStand {
    private int noOfLayers;
    private Bowl[] layers;

    public BasketStand(int noOfLayers){
        this.noOfLayers=noOfLayers;
        layers=new Bowl[noOfLayers];
    }

    public int getNoOfLayers() {
        return noOfLayers;
    }

    public Bowl[] getLayers() {
        return layers;
    }

    public void addFruit(int layerNo,Fruit fruit) {
        this.layers[layerNo].addFruits(fruit);
    }
}
