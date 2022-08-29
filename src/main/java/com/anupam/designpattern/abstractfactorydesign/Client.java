package com.anupam.designpattern.abstractfactorydesign;

public class Client {
    public static void main(String[] args) {
        MobileFactory.getBrandFactory(Brand.SAMSUNG).produceMobile(MobileType.ANDROID).call();
        MobileFactory.getBrandFactory(Brand.NOKIA).produceMobile(MobileType.BASIC).call();
    }
}
