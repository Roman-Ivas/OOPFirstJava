package org.example;

public class Pilot extends Human{
    private String aircraftType;

    public Pilot(String name, int age, String aircraftType) {
        super(name, age);
        this.aircraftType = aircraftType;
    }

    // Getters and setters for aircraftType
    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }
}
