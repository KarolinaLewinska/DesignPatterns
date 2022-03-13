package com.java.designpatterns.factory.militaryunit;

public abstract class MilitaryFactory {
    public abstract MilitaryUnit createUnit(UnitType type) throws Exception;

    public enum UnitType {
        SHOOTER,
        TANK
    }
}