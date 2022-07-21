package com.ultralesson.capstoneProject.fruitbowl;

public class Taste {
    private String name;
    private int degree;

    public Taste(String name,int degree){
        this.name=name;
        this.degree=degree;
    }
    public Taste(String name){
        this(name,0);
    }
    public Taste(int degree){
        this("sweet",degree);
    }
    public Taste(){
        this("sweet",0);
    }
}
