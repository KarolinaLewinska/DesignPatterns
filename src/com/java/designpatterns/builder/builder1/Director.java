package com.java.designpatterns.builder.builder1;

public class Director {
    public void assemblePieces(Builder builder) {
        builder.assemblePieceA();
        builder.assemblePieceB();
    }
}