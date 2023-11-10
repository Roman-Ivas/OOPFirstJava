package org.example;

public class MusicalInstrument {
    private String name;

    // Constructor to set the name of the musical instrument
    public MusicalInstrument(String name) {
        this.name = name;
    }

    // Method to emit the sound of the musical instrument
    public void sound() {
        System.out.println("Playing the sound of the " + name);
    }

    // Method to display the name of the musical instrument
    public void show() {
        System.out.println("Musical Instrument: " + name);
    }

    // Method to display the description of the musical instrument
    public void desc() {
        System.out.println("Description of " + name + ": This is a musical instrument.");
    }

    // Method to display the history of the creation of the musical instrument
    public void history() {
        System.out.println("History of " + name + ": No specific history available.");
    }
}
