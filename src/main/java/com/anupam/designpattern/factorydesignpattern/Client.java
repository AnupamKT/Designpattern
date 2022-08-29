package com.anupam.designpattern.factorydesignpattern;

public class Client {
    public static void main(String[] args) {
        NotificationFactory.createNotification(Channels.SMS).notifyUser();
        NotificationFactory.createNotification(Channels.EMAIL).notifyUser();
    }
}
