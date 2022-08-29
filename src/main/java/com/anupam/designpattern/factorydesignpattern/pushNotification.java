package com.anupam.designpattern.factorydesignpattern;

public class pushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending push notification");
    }
}
