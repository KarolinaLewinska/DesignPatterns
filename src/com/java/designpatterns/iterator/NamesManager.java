package com.java.designpatterns.iterator;

import java.util.ArrayList;

public class NamesManager extends Manager  {
    private ArrayList elements = new ArrayList();

    public int getSize() {
        return elements.size();
    }

    public Object getElement(int index) {
        return elements.get(index);
    }

    public void setElement(Object element) {
        elements.add(element);
    }

    @Override
    public Iterator createIterator() {
        return new NamesIterator(this);
    }
}