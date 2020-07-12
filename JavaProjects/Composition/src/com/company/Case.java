package com.company;

public class Case {

    private String name;
    private String type;
    private int powerSupply;
    private MotherBoard motherboard;
    private Monitor monitor;

    public Case(String name, String type, int powerSupply) {
        this.name = name;
        this.type = type;
        this.powerSupply = powerSupply;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPowerSupply() {
        return powerSupply;
    }
}
