package com.java.designpatterns.flyweight.signs;

public abstract class Sign {
    char symbol;
    int size;

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract void draw();
}