package com.java.designpatterns.factory.militaryunits;

public abstract class MilitaryUnit {
    public int life;
    public int experience;
    public int forceOfDestruction;

    protected MilitaryUnit(int life, int experience, int forceOfDestruction) {
        this.life = life;
        this.experience = experience;
        this.forceOfDestruction = forceOfDestruction;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getForceOfDestruction() {
        return forceOfDestruction;
    }

    public void setForceOfDestruction(int forceOfDestruction) {
        this.forceOfDestruction = forceOfDestruction;
    }
}