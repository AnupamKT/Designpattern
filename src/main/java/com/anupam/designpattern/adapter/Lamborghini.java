package com.anupam.designpattern.adapter;

public class Lamborghini implements MovableSpeedInKMPerHour{
    @Override
    public int getSpeed() {
        return 500;
    }
}
