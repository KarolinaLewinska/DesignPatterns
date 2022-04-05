package com.java.designpatterns.flyweight.signs;

public class SpecificSign extends Sign {
    public char symbol;
    public int size;

    public SpecificSign(char symbol, int size) {
        this.symbol = symbol;
        this.size = size;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    @Override
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + symbol + " in font size " + size);
    }
}