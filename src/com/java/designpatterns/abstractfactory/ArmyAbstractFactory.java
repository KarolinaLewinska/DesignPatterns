package com.java.designpatterns.abstractfactory;

import com.java.designpatterns.abstractfactory.militaryunits.AirUnit;
import com.java.designpatterns.abstractfactory.militaryunits.GroundUnit;
import com.java.designpatterns.abstractfactory.militaryunits.WalkingUnit;
import com.java.designpatterns.factory.militaryunits.MilitaryFactory;

public abstract class ArmyAbstractFactory {
    public abstract WalkingUnit createWalkingUnit(MilitaryFactory.UnitType type) throws Exception;
    public abstract GroundUnit createGroundUnit(MilitaryFactory.UnitType type) throws Exception;
    public abstract AirUnit createAirUnit(MilitaryFactory.UnitType type) throws Exception;
}