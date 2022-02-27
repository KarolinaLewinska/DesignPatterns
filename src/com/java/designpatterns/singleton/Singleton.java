package com.java.designpatterns.singleton;

public class Singleton {
    private static Singleton instance;
    protected Singleton() {

    }

    public static synchronized Singleton returnInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}