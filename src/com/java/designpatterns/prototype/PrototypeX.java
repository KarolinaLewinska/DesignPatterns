package com.java.designpatterns.prototype;

public class PrototypeX extends Prototype {

    public PrototypeX(String id) {
        super(id);
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return super.clone();
    }
}