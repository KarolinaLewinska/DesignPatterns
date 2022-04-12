package com.java.designpatterns.composite;

public abstract class Element {
    protected String name;

    public Element(String name) {
        this.name = name;
    }

    public abstract void add(Element element);
    public abstract void delete(Element element);
    public abstract void show(int index);
}