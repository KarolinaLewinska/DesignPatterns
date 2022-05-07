package com.java.designpatterns.decorator;

public class Decorator extends LibraryPosition {
    protected LibraryPosition libraryPosition;

    public Decorator(LibraryPosition libraryPosition) {
        this.libraryPosition = libraryPosition;
    }

    @Override
    public void show() {
        libraryPosition.show();
    }
}