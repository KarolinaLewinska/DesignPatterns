package com.java.designpatterns.prototype;

public class PrototypeY extends Prototype{

    public PrototypeY(String id) {
        super(id);
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return super.clone();
    }
}