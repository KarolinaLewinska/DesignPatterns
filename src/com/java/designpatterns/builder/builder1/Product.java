package com.java.designpatterns.builder.builder1;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> pieces = new ArrayList<>();

    public void showPieces() {
        System.out.println("Pieces of product:");
        pieces.forEach(System.out::println);
    }

    public void complete(String piece) {
        pieces.add(piece);
    }
}