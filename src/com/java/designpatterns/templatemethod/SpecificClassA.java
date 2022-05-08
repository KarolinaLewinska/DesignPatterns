package com.java.designpatterns.templatemethod;

public class SpecificClassA extends AbstractClass {
    @Override
    public void firstMethod() {
        System.out.println("SpecificClassA firstMethod()");
    }

    @Override
    public void secondMethod() {
        System.out.println("SpecificClassA secondMethod()");
    }
}