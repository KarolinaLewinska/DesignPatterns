package com.java.designpatterns.prototype.colors;

public abstract class ColorPrototype {
    public ColorPrototype clone() throws CloneNotSupportedException {
        return this;
    }
}