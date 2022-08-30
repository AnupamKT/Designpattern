package com.anupam.designpattern.singleton;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {
    private static Singleton singletonInstance;

    private Singleton() {

    }

    public static synchronized Singleton getInstance(){
        if(singletonInstance==null){
            singletonInstance=  new Singleton();
        }
        return singletonInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //this will make sure that even with clone method same object is getting returned
        return getInstance();
    }
    //This method is required to prevent Singleton class in case of serialization/deserialization
    //while deserializing the object readResolve gets called.
    protected Object readResolve() {
        return getInstance();
    }
}