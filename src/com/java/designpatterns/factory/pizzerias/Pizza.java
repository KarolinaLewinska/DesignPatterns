package com.java.designpatterns.factory.pizzerias;

import com.java.designpatterns.factory.pizzerias.ingredients.Ingredient;

import java.util.List;

public abstract class Pizza {
    public List<Ingredient> ingredients;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}