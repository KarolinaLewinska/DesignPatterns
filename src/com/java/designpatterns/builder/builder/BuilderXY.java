package com.java.designpatterns.builder.builder;

public class BuilderXY extends Builder {
    private Product productXY = new Product();

    @Override
    public void assemblePieceA() {
        productXY.complete("Part X");
    }

    @Override
    public void assemblePieceB() {
        productXY.complete("Part Y");
    }

    @Override
    public Product returnProduct() {
        return productXY;
    }
}