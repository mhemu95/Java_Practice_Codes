package com.company;

public class Door {

    private String madeOf;
    private int count;

    public Door(String madeOf, int count) {
        this.madeOf = madeOf;
        this.count = count;
    }

    public void doorOn() {
        System.out.println("Door -> opening");
    }

    public String getMadeOf() {
        return madeOf;
    }

    public int getCount() {
        return count;
    }
}
