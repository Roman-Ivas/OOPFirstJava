package org.example;

public class Sailor extends Human{
    private String shipName;

    public Sailor(String name, int age, String shipName) {
        super(name, age);
        this.shipName = shipName;
    }

    // Getters and setters for shipName
    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }
}
