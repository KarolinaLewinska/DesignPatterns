package com.java.designpatterns.composite;

public class Leaf extends Element {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Element element) {
        System.out.println("Cannot add element");
    }

    @Override
    public void delete(Element element) {
        System.out.println("Cannot delete element");
    }

    @Override
    public void show(int index) {
        System.out.println("Index: " + index + " Name: " + name);
    }
}