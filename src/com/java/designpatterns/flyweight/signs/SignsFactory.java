package com.java.designpatterns.flyweight.signs;

import java.util.Hashtable;

public class SignsFactory {
    int size;
    Hashtable signs;

    public SignsFactory(int size) {
        this.size = size;
        signs = new Hashtable();
    }
    public SignsFactory() {
        this.size = 12;
        signs = new Hashtable();
    }

    public SpecificSign getSign(char key) {
        SpecificSign sign = (SpecificSign) signs.get(key);

        if (sign == null) {
            sign = new SpecificSign(key, size);
            signs.put(key, sign);
        }
        return sign;
    }
}