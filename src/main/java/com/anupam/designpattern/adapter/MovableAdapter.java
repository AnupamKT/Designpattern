package com.anupam.designpattern.adapter;

//This is adapter which will convert speed from miles/h to km/h
public class MovableAdapter implements MovableSpeedInKMPerHour{

    private MovableSpeedInMilesPerSecond car;

    public MovableAdapter(MovableSpeedInMilesPerSecond car) {
        this.car=car;
    }

    @Override
    public int getSpeed() {
       return (int) ((car.getSpeed())*1.6);
    }
}
