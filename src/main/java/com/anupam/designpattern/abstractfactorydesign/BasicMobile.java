package com.anupam.designpattern.abstractfactorydesign;

public class BasicMobile implements Mobile{
    @Override
    public void call() {
        System.out.println("This is basic mobile");
    }
}
