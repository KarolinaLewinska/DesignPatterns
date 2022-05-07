package com.java.designpatterns.decorator;

public class Movie extends LibraryPosition {
    private String director;
    private String title;
    private int duration;

    public Movie(String director, String title, int duration, int numberOfCopies) {
        this.director = director;
        this.title = title;
        this.duration = duration;
        this.numberOfCopies = numberOfCopies;
    }

    @Override
    public void show() {
        System.out.println("Movie: \ndirector: " + director + "\ntitle: " + title + " duration: " + duration + "\nnumber of copies: " + numberOfCopies);
    }
}