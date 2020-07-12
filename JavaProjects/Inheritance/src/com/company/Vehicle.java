package com.company;

public class Vehicle {

    private String name;
    private String type;
    private String use;

    public Vehicle(String name, String type, String use) {
        this.name = name;
        this.type = type;
        this.use = use;
    }

    public void speed() {
        System.out.println("called from vehicle class");
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getUse() {
        return use;
    }
}
