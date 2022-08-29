package com.anupam.designpattern.adapter;

public class BMW implements MovableSpeedInMilesPerSecond{
    @Override
    public int getSpeed() {
        return 100;
    }
}
