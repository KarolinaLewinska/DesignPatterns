package com.java.designpatterns.prototype;

public abstract class Prototype {
    public String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Prototype clone() throws CloneNotSupportedException {
        return this;
    }
}