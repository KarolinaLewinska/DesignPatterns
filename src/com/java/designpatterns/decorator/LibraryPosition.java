package com.java.designpatterns.decorator;

public abstract class LibraryPosition {
    public int numberOfCopies;
    private int copies;

    public int getNumberOfCopies() {
        return copies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.copies = numberOfCopies;
    }

    public abstract void show();
}