package com.company;

public class Main {

    public static void main(String[] args) {

	    Tank tank = new Tank("vt5","tank","war", 105, "7.62" );

	    System.out.println("tank name " + tank.getName() + " barrel size " + tank.getBarrel());
        tank.speed();
    }
}
