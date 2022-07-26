package com.ultralesson.capstoneProject.fruitbowl;

public class Fruit {
    private String name;
    private Color color;
    private Taste taste;
    public Fruit(Builder builder){
        this.name=builder.name;
        this.color=builder.color;
        this.taste=builder.taste;
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

    @Override
    public String toString() {
        return this.name;
    }

    public static class Builder{
        String name;
        Color color;
        Taste taste;
        public Builder(String name){
            this.name=name;
        }

        public Builder setColor(Color color) {
            this.color = color;
            return this;
        }

        public Builder setTaste(Taste taste) {
            this.taste = taste;
            return this;
        }
        public Fruit createFruit(){
            return new Fruit(this);
        }
    }
}
