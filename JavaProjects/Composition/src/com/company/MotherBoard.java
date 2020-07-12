package com.company;

public class MotherBoard {

    private String model;
    private String name;
    private int ramSlot;

    private Monitor monitor;
    private Case theCase;

    public MotherBoard(String model, String name, int ramSlot) {
        this.model = model;
        this.name = name;
        this.ramSlot = ramSlot;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public int getRamSlot() {
        return ramSlot;
    }
}
