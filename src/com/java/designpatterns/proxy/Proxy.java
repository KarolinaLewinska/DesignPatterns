package com.java.designpatterns.proxy;

public class Proxy extends Object {
    private SpecificObject specificObject;

    @Override
    public void query() {
        if (specificObject == null) {
            specificObject = new SpecificObject();
        }
        specificObject.query();
    }
}