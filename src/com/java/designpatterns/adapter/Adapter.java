package com.java.designpatterns.adapter;

public class Adapter extends DestinationElement {
    private Adapted adapted = new Adapted();

    @Override
    public  void MethodA() {
        adapted.AdaptedMethod();
    }
}