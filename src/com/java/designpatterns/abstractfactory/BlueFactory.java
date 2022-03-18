package com.java.designpatterns.abstractfactory;

import com.java.designpatterns.abstractfactory.militaryunits.AirUnit;
import com.java.designpatterns.abstractfactory.militaryunits.GroundUnit;
import com.java.designpatterns.abstractfactory.militaryunits.HelicoptersUnit;
import com.java.designpatterns.abstractfactory.militaryunits.ShootersUnit;
import com.java.designpatterns.abstractfactory.militaryunits.TanksUnit;
import com.java.designpatterns.abstractfactory.militaryunits.WalkingUnit;
import com.java.designpatterns.factory.militaryunits.MilitaryFactory;

public class BlueFactory extends ArmyAbstractFactory {
    @Override
    public WalkingUnit createWalkingUnit(MilitaryFactory.UnitType type) throws Exception {
        switch (type) {
            case SHOOTER -> {
                return new ShootersUnit(55, 50, 15);
            }
            default -> throw new Exception("Unknown military unit");
        }
    }

    @Override
    public GroundUnit createGroundUnit(MilitaryFactory.UnitType type) throws Exception {
        switch (type) {
            case TANK -> {
                return new TanksUnit(85, 50, 100);
            }
            default -> throw new Exception("Unknown military unit");
        }
    }

    @Override
    public AirUnit createAirUnit(MilitaryFactory.UnitType type) throws Exception {
        switch (type) {
            case HELICOPTER -> {
                return new HelicoptersUnit(150, 70, 200);
            }
            default -> throw new Exception("Unknown military unit");
        }
    }
}