package com.java.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class Rental extends Decorator {
    protected List<String> libraryReaders = new ArrayList<>();

    public Rental(LibraryPosition libraryPosition) {
        super(libraryPosition);
    }

    public void rentLibraryPosition(String readerName) {
        libraryReaders.add(readerName);
        libraryPosition.numberOfCopies--;
    }

    public void returnLibraryPosition(String readerName) {
        libraryReaders.remove(readerName);
        libraryPosition.numberOfCopies++;
    }

    @Override
    public void show() {
        super.show();
        for (String reader: libraryReaders) {
            System.out.println("Library reader: " + reader);
        }
    }
}