package com.ultralesson.capstoneProject.fruitbowl;

public class Fruit {
    private String name;
    private Color color;
    private Taste taste;

    public Fruit(String name){
        this(name,new Color(255),new Taste());
    }
    public Fruit(String name,Color color){
        this(name,color,new Taste());
    }
    public Fruit(String name,Taste taste){
        this(name,new Color(255),taste);
    }
    public Fruit(String name,Color color,Taste taste){
        this.name=name;
        this.color=color;
        this.taste=taste;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Taste getTaste() {
        return taste;
    }
}
