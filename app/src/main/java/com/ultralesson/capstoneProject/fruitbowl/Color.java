package com.ultralesson.capstoneProject.fruitbowl;

public class Color {
    private int red,green,blue;
    private Color(Builder builder){
        this.red=builder.red;
        this.blue= builder.blue;
        this.green=builder.green;
    }

    public boolean equals(Color obj) {
        if(this.red==obj.red && this.green==obj.green && this.blue==obj.blue)
            return true;
        return false;
    }

    public static class Builder{
        private int red,blue,green;
        public Builder setRed(int red) {
            this.red = red;
            return this;
        }
        public Builder setBlue(int blue) {
            this.blue = blue;
            return this;
        }
        public Builder setGreen(int green) {
            this.green = green;
            return this;
        }
        public Color createColor(){
            return new Color(this);
        }
    }
}
