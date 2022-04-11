package com.java.designpatterns.proxy.authentication;

public class SpecificDirectory extends Directory {
    private String data;

    public SpecificDirectory() {
        System.out.println("Specific directory launched");
        data = "fk12550clsfsk6";
    }

    @Override
    public String getData() {
        return data;
    }
}