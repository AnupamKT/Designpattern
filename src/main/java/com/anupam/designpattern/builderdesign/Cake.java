package com.anupam.designpattern.builderdesign;

public class Cake {
    private double sugar;
    private double butter;
    private int eggs;
    private int vanilla;
    private double floor;
    private double bakingPowder;
    private double milk;
    private int cherry;

    public static class Builder{
        private double sugar;
        private double butter;
        private int eggs;
        private int vanilla;
        private double floor;
        private double bakingPowder;
        private double milk;
        private int cherry;

        public Builder sugar(double cup){
            this.sugar=cup;
            return this;
        }
        public Builder butter(double spoon){
            this.butter=spoon;
            return this;
        }
        public Builder eggs(int eggs){
            this.eggs=eggs;
            return this;
        }
        public Builder vanilla(int spoon){
            this.vanilla=spoon;
            return this;
        }
        public Builder flour(double cup){
            this.floor=cup;
            return this;
        }
        public Builder bakingPowder(int spoon){
            this.bakingPowder=spoon;
            return this;
        }
        public Builder milk(int cup){
            this.milk=cup;
            return this;
        }
        public Builder cherry(int cherry){
            this.cherry=cherry;
            return this;
        }

        public Cake build(){
            return new Cake(this);
        }
    }

    private Cake(Builder builder){
        this.sugar=builder.sugar;
        this.butter=builder.butter;
        this.eggs=builder.eggs;
        this.vanilla=builder.vanilla;
        this.floor=builder.floor;
        this.bakingPowder=builder.bakingPowder;
        this.milk=builder.milk;
        this.cherry=builder.cherry;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "sugar=" + sugar +
                ", butter=" + butter +
                ", eggs=" + eggs +
                ", vanilla=" + vanilla +
                ", floor=" + floor +
                ", bakingPowder=" + bakingPowder +
                ", milk=" + milk +
                ", cherry=" + cherry +
                '}';
    }
}
