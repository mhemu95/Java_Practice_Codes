package com.company;

public class Monitor {

    private String name;
    private String model;
    private int speed;

    private MotherBoard motherBoard;
    private Case theCase;

    public Monitor(String name, String model, int speed) {
        this.name = name;
        this.model = model;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }
}