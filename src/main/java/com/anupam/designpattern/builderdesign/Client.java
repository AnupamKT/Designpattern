package com.anupam.designpattern.builderdesign;

public class Client {
    public static void main(String[] args) {
     Cake cake=    new Cake.Builder().
                 sugar(10).
                 bakingPowder(20).
                 eggs(2).
                 flour(20).
                 butter(10).
                 milk(5).
                 cherry(5).build();
     System.out.println(cake);

    }
}
