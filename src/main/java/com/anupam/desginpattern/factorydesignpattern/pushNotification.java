package com.anupam.desginpattern.factorydesignpattern;

public class pushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending push notification");
    }
}
