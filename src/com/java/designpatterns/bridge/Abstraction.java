package com.java.designpatterns.bridge;

public class Abstraction {
    protected Implementation implementation;

    public void setImplementation(Implementation implementation) {
        this.implementation = implementation;
    }

    public void implementationMethod() {
        implementation.implementationMethod();
    }
}