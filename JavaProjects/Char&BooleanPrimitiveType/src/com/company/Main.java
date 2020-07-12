package com.company;

public class Main {

    public static void main(String[] args) {
        //char primitive type
        char myChar = 's';
        System.out.println(myChar);
        char myunicode = '\u0033';
        System.out.println(myunicode);

        //boolean primitive type
        boolean mytrueboolean  = true;
        boolean myfalseboolean = false;
        System.out.println(mytrueboolean);

        //String (is not primitive but a datatype)
        String myString = "this is a string";
        String myNewString = myString + 2020;
        System.out.println(myString);
        System.out.println(myNewString);
    }
}
