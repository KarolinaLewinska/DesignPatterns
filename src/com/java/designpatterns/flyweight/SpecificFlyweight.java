package com.java.designpatterns.flyweight;

public class SpecificFlyweight extends Flyweight {
    @Override
    public void method(int externalData) {
        System.out.println("Specific Flyweight: " + externalData);
    }
}