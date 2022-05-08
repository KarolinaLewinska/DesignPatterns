package com.java.designpatterns.templatemethod;

public class SpecificClassB extends AbstractClass {
    @Override
    public void firstMethod() {
        System.out.println("SpecificClassB firstMethod()");
    }

    @Override
    public void secondMethod() {
        System.out.println("SpecificClassB secondMethod()");
    }
}