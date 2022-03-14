package com.java.designpatterns.abstractfactory.sales;

public class IndividualSale extends SaleFactory {

    @Override
    public OrderItem createSaleDocument() {
        return new FirstItem("Pencil", 2, 5.50f);
    }
}