package com.anupam.designpattern.factorydesignpattern;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("sending SMS notification");
    }
}
