package com.company;

public class Wall {

    private String direction;
    private String colour;

    public Wall(String direction, String colour) {
        this.direction = direction;
        this.colour = colour;
    }

    public String getDirection() {
        return direction;
    }

    public String getColour() {
        return colour;
    }
}
