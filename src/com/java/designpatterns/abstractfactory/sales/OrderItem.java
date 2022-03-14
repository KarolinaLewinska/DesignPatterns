package com.java.designpatterns.abstractfactory.sales;

public abstract class OrderItem {
    public String name;
    public int numberOfItems;
    public float singleItemPrice;

    protected OrderItem(String name, int numberOfItems, float singleItemPrice) {
        this.name = name;
        this.numberOfItems = numberOfItems;
        this.singleItemPrice = singleItemPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public float getSingleItemPrice() {
        return singleItemPrice;
    }

    public void setSingleItemPrice(float singleItemPrice) {
        this.singleItemPrice = singleItemPrice;
    }
}