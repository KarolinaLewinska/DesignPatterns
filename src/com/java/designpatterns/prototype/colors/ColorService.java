package com.java.designpatterns.prototype.colors;

import java.util.HashMap;
import java.util.Map;

public class ColorService {
    private Map<String, ColorPrototype> colors = new HashMap<>();

    public Map<String, ColorPrototype> getColors() {
        return colors;
    }

    public void setColor(String colorName, Color colorValue) {
        this.colors.put(colorName, colorValue);
    }
}