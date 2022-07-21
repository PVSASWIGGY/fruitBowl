package com.ultralesson.capstoneProject.fruitbowl;

public class Color {
    private int red,green,blue;
    public Color(int red,int green,int blue){
        this.red=red;
        this.blue=blue;
        this.green=green;
    }
    public Color(int red,int green){
        this(red,green,0);
    }
    public Color(int red){
        this(red,0,0);
    }
    public Color(){
        this(0,0,0);
    }
}
