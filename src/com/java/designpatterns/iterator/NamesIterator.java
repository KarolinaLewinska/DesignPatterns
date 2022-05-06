package com.java.designpatterns.iterator;

public class NamesIterator extends Iterator {
    private NamesManager namesContainer;
    private int currentIndex = 0;

    public NamesIterator(NamesManager namesManager) {
        this.namesContainer = namesManager;
    }

    @Override
    public Object firstElement() {
        return namesContainer.getElement(0);
    }

    @Override
    public Object nextElement() {
        Object nextElement = null;
        if (currentIndex < namesContainer.getSize() - 1) {
            nextElement = namesContainer.getElement(++currentIndex);
        }

        return nextElement;
    }

    @Override
    public Object getElement() {
        return namesContainer.getElement(currentIndex);
    }

    @Override
    public boolean isEnd() {
        return currentIndex >= namesContainer.getSize();
    }
}