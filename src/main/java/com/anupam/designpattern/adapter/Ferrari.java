package com.anupam.designpattern.adapter;

public class Ferrari implements MovableSpeedInMilesPerSecond{
    @Override
    public int getSpeed() {
        return 200;
    }
}
