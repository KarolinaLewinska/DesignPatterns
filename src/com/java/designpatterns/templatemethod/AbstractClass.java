package com.java.designpatterns.templatemethod;

public abstract class AbstractClass {
    public abstract void firstMethod();
    public abstract void secondMethod();

    public void templateMethod() {
        firstMethod();
        secondMethod();
    }
}