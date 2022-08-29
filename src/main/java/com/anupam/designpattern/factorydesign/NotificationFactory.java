package com.anupam.designpattern.factorydesign;

public class NotificationFactory {

    public static Notification createNotification(Channels channel){
        if(channel==null){
            return null;
        }
        switch (channel){
            case SMS:
                return new SMSNotification();

            case EMAIL:
                return new EMailNotification();

            case PUSH:
                return new pushNotification();

            default:
                throw new IllegalArgumentException("Unknown channel "+channel);

        }
    }
}
