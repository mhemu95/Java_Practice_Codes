package com.company;


public class Car {
    private String model;
    private String colour;
    private String engine;
    private int wheel;
    private int doors;

    // constructor get all the perameter names in class call in main class
    public Car(String model, String colour, String engine, int wheel, int doors) {
        this.model = model;
        this.colour = colour;
        this.engine = engine;
        this.wheel = wheel;
        this.doors = doors;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
