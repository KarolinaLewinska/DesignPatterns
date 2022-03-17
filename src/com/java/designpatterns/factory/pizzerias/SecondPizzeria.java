package com.java.designpatterns.factory.pizzerias;

public class SecondPizzeria extends Pizzeria {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Pizza addPizza(String name) throws Exception {
        switch (name) {
            case "Neapolitan" -> {
                return new NeapolitanPizza();
            }
            default -> throw new Exception("Pizza unavailable");
        }
    }
}