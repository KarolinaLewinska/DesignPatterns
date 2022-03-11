package com.java.designpatterns.builder.builder1;

public abstract class Builder {
    public abstract void assemblePieceA();
    public abstract void assemblePieceB();
    public abstract Product returnProduct();
}