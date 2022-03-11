package com.java.designpatterns.builder.builder1;

public class BuilderQW extends Builder {
    private Product productQW = new Product();

    @Override
    public void assemblePieceA() {
        productQW.complete("Part Q");
    }

    @Override
    public void assemblePieceB() {
        productQW.complete("Part W");
    }

    @Override
    public Product returnProduct() {
        return productQW;
    }
}