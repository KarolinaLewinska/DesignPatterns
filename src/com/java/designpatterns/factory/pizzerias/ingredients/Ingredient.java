package com.java.designpatterns.factory.pizzerias.ingredients;

public abstract class Ingredient {
    public float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}