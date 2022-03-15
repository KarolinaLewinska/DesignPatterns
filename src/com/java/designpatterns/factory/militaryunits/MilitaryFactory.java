package com.java.designpatterns.factory.militaryunits;

public abstract class MilitaryFactory {
    public abstract MilitaryUnit createUnit(UnitType type) throws Exception;

    public enum UnitType {
        SHOOTER,
        TANK
    }
}