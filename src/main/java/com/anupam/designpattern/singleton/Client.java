package com.anupam.designpattern.singleton;

public class Client {
    public static void main(String[] args) {
        Singleton obj1= Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        try{
        Singleton obj3= (Singleton) obj2.clone();
        System.out.println(obj3.hashCode());
        }catch(CloneNotSupportedException e){
           System.out.println("exception occurred");
        }
        //starting new thread to check how getInstance is performing
        new Thread(()->System.out.println(Singleton.getInstance().hashCode())).start();
    }
}
