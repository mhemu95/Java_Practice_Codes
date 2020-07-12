package com.company;

public class Main {

    public static void main(String[] args) {
	    //operators (+, -, *, /, %) operands (1,2,3,...,n)]
        int mynum = 16;
        int add = mynum + 4;
        int sub = mynum - 6;
        int mult = mynum * 2;
        double div = mynum / 3;
        int mod = mynum % 3;

        System.out.println("addition = " + add);
        System.out.println("subtraction = " + sub);
        System.out.println("multiplication = " + mult);
        System.out.println("division = " + div);
        System.out.println("modulus = " + mod);

        //Expression
        int exp = mynum + 3 - (3 * 6);
        System.out.println("result of expression = " + exp);

    }
}
