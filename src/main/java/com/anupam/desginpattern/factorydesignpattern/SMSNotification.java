package com.anupam.desginpattern.factorydesignpattern;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("sending SMS notification");
    }
}
