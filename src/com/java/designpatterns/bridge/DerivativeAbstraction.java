package com.java.designpatterns.bridge;

public class DerivativeAbstraction extends Abstraction {

    @Override
    public void implementationMethod() {
        implementation.implementationMethod();
    }
}