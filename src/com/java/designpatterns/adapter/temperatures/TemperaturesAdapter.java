package com.java.designpatterns.adapter.temperatures;

public class TemperaturesAdapter extends Sensor {
    FahrenheitSensor fs;

    public TemperaturesAdapter(FahrenheitSensor fs) {
        this.fs = fs;
    }

    @Override
    public float getTemperature() {
        return (fs.getTemperature() - 32.0f) * 5.0f / 9.0f;
    }
}