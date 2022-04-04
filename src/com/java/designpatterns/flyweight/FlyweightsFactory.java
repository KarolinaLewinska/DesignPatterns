package com.java.designpatterns.flyweight;

import java.util.HashMap;

public class FlyweightsFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    public FlyweightsFactory() {
        flyweights.put("Q", new SpecificFlyweight());
        flyweights.put("W", new SpecificFlyweight());
        flyweights.put("E", new SpecificFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return flyweights.get(key);
    }
}