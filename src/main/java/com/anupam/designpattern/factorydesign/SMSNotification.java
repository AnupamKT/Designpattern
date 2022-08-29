package com.anupam.designpattern.factorydesign;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("sending SMS notification");
    }
}
