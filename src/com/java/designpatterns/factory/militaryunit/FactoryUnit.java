package com.java.designpatterns.factory.militaryunit;

public class FactoryUnit extends MilitaryFactory {
    @Override
    public MilitaryUnit createUnit(UnitType militaryType) throws Exception {
        switch (militaryType) {
            case SHOOTER -> {
                return new Shooter(99, 22, 50);
            }
            case TANK -> {
                return new Tank(100, 60, 70);
            }
            default -> throw new Exception("Unsupported type!");
        }
    }
}