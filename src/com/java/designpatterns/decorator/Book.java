package com.java.designpatterns.decorator;

public class Book extends LibraryPosition {
    private String author;
    private String title;

    public Book(String author, String title, int numberOfCopies) {
        this.author = author;
        this.title = title;
        this.numberOfCopies = numberOfCopies;

    }

    @Override
    public void show() {
        System.out.println("Book: \nauthor: " + author + "\ntitle: " + title + "\nnumber of copies: " + numberOfCopies);
    }
}