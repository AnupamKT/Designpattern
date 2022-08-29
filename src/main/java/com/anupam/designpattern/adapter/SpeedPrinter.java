package com.anupam.designpattern.adapter;

import java.util.ArrayList;
import java.util.List;

//This class prints speed of all the cars available in the system in km/h unit
//Here two cars however are implementing MovableSpeedInMilesPerSecond and they are returning speed in miles/s
public class SpeedPrinter {
    List<MovableSpeedInKMPerHour> cars = new ArrayList();

    public void addCars(MovableSpeedInKMPerHour car) {
        cars.add(car);
    }

    public void printCarsSpeed() {
        cars.stream().forEach(car->System.out.println(car.getSpeed()));
    }
}
