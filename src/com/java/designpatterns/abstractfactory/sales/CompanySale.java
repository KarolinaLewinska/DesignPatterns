package com.java.designpatterns.abstractfactory.sales;

public class CompanySale extends SaleFactory {
    @Override
    public OrderItem createSaleDocument() {
        return new SecondItem("Rubber", 4, 2.99f);
    }
}