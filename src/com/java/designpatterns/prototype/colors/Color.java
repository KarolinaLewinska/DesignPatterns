package com.java.designpatterns.prototype.colors;

public class Color extends ColorPrototype {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public ColorPrototype clone() throws CloneNotSupportedException {
        System.out.println("Clones of colors: " + red + " " + green + " " + blue);
        return super.clone();
    }
}