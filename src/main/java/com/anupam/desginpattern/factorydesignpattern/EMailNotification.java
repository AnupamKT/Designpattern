package com.anupam.desginpattern.factorydesignpattern;

public class EMailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("sending email notification");
    }
}
