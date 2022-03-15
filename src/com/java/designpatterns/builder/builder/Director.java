package com.java.designpatterns.builder.builder;

public class Director {
    public void assemblePieces(Builder builder) {
        builder.assemblePieceA();
        builder.assemblePieceB();
    }
}