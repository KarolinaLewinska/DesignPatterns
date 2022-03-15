package com.java.designpatterns.builder.players;

public class Player {
    private String name;

    public void showName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }
}