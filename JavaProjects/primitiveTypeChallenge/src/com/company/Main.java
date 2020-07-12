package com.company;

public class Main {

    public static void main(String[] args) {
        int intVar = 2016000;
        byte byteVar = 127;
        short shortVar = 32676;
        long longVar = 50000L;
        long newlongVar = longVar + 10*(1+2+7) + shortVar + intVar;
        System.out.println(newlongVar);

        double pound = 35.24;
        double kilogram = pound * 0.45359237;
        System.out.println("pound to kilogram: " +kilogram);
    }
}
