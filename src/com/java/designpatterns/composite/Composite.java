package com.java.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Element {
    private List<Element> elements = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void delete(Element element) {
        elements.remove(element);
    }

    @Override
    public void show(int index) {
        System.out.println("Index: " + index + " Name: " + name);

        elements.forEach(e -> e.show(index));
    }
}