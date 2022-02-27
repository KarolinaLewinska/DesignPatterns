package com.java.designpatterns;

import com.java.designpatterns.singleton.Singleton;

public class Main {

    public static void main(String[] args) {

        //Singleton
        Singleton singleton = Singleton.returnInstance();
        Singleton singleton2 = Singleton.returnInstance();

        if (singleton == singleton2) {
            System.out.println("Objects are the same");
        }
    }
}