package com.java.designpatterns.builder.builder1;

public class Director {
    public void assembly(Builder builder) {
        builder.assemblePieceA();
        builder.assemblePieceB();
    }
}