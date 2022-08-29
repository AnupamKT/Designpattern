package com.anupam.desginpattern.factorydesignpattern;

public class Client {
    public static void main(String[] args) {
        NotificationFactory.createNotification(Channels.SMS).notifyUser();
        NotificationFactory.createNotification(Channels.EMAIL).notifyUser();
    }
}
