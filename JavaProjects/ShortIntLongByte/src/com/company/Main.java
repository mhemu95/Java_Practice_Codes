package com.company;

public class Main {

    public static void main(String[] args) {
        //primitive types
        int maxintValue = Integer.MAX_VALUE;
        int minintvalue = Integer.MIN_VALUE;
        System.out.println(maxintValue);
        System.out.println(minintvalue);

        short maxShortValue = Short.MAX_VALUE;
        short minShortValue = Short.MIN_VALUE;
        System.out.println("max short value = " + maxShortValue);
        System.out.println("min short value = " + minShortValue);

        byte maxByteValue = Byte.MAX_VALUE;
        byte minByteValue = Byte.MIN_VALUE;
        System.out.println("max byte value = " + maxByteValue);
        System.out.println("min byte value = " + minByteValue);

        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;
        System.out.println("max long value = " + maxLongValue);
        System.out.println("min long value = " + minLongValue);

        //casting:
        short total = (short) (minintvalue);
        System.out.println("cast value = " + total);

        //long declaration:
        long aNumber = 24565894644445454L;

    }
}
