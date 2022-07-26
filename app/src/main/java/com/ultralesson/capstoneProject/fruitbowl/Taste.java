package com.ultralesson.capstoneProject.fruitbowl;

public class Taste {
    private String name;
    private int degree;

    public Taste(Builder builder){
        this.name=builder.name;
        this.degree=builder.degree;
    }

    public boolean equals(Taste obj) {
        if(this.name==obj.name && this.degree==obj.degree)
            return true;
        return false;
    }
    public static class Builder{
        private String name;
        private int degree;

        public Builder(String name){
            this.name=name;
        }

        public Builder setDegree(int degree) {
            this.degree = degree;
            return this;
        }
        public Taste createTaste(){
            return new Taste(this);
        }
    }
}
