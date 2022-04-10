package com.java.designpatterns.proxy;

public class SpecificObject extends Object {

    @Override
    public void query() {
        System.out.println("Query from SpecificObject");
    }
}