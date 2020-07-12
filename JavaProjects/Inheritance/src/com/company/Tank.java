package com.company;

public class Tank extends Vehicle {

    private double Barrel;
    private String auxileryGun;

    public double getBarrel() {
        return Barrel;
    }

    public String getAuxileryGun() {
        return auxileryGun;
    }

    public Tank(String name, String type, String use, double Barrel, String auxileryGun) {
        super(name, type, use);
        this.Barrel = Barrel;
        this.auxileryGun = auxileryGun;

    }

    @Override
    public void speed() {
        System.out.println("called from Tank class");
        super.speed();
    }
}
