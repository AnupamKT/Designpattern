package com.anupam.designpattern.adapter;

import java.util.ArrayList;
import java.util.List;

//So we have classes implementing two different interfaces,
// we used Adapter to make them compatible with each other
public class Client {
    public static void main(String[] args) {
        SpeedPrinter printer= new SpeedPrinter();
        printer.addCars(new Lamborghini());
        printer.addCars(new Mercedez());
        //wrapping incompatible object in adapter
        printer.addCars(new MovableAdapter(new BMW()));
        printer.addCars(new MovableAdapter(new Ferrari()));

        printer.printCarsSpeed();
    }
}
