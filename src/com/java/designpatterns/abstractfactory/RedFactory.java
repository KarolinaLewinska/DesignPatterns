package com.java.designpatterns.abstractfactory;

import com.java.designpatterns.abstractfactory.militaryunits.AirUnit;
import com.java.designpatterns.abstractfactory.militaryunits.GroundUnit;
import com.java.designpatterns.abstractfactory.militaryunits.HelicoptersUnit;
import com.java.designpatterns.abstractfactory.militaryunits.ShootersUnit;
import com.java.designpatterns.abstractfactory.militaryunits.TanksUnit;
import com.java.designpatterns.abstractfactory.militaryunits.WalkingUnit;
import com.java.designpatterns.factory.militaryunits.MilitaryFactory;

public class RedFactory extends ArmyAbstractFactory {
    @Override
    public WalkingUnit createWalkingUnit(MilitaryFactory.UnitType type) throws Exception {
        switch (type) {
            case SHOOTER -> {
                return new ShootersUnit(45, 30, 12);
            }
            default -> throw new Exception("Unknown military unit");
        }
    }

    @Override
    public GroundUnit createGroundUnit(MilitaryFactory.UnitType type) throws Exception {
        switch (type) {
            case TANK -> {
                return new TanksUnit(85, 70, 120);
            }
            default -> throw new Exception("Unknown military unit");
        }
    }

    @Override
    public AirUnit createAirUnit(MilitaryFactory.UnitType type) throws Exception {
        switch (type) {
            case HELICOPTER -> {
                return new HelicoptersUnit(170, 80, 180);
            }
            default -> throw new Exception("Unknown military unit");
        }
    }
}