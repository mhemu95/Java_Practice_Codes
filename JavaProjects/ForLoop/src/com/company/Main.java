package com.company;

public class Main {

    public static void main(String[] args) {
        calculateInterest(10000);
    }

    private static double calculateInterest (double amount) {

        for (double interestRate=2; interestRate<=8; interestRate++) {
             double interest = Math.round(amount * (interestRate / 100));
            System.out.println("interest rate is  " + interest);
        }
        return 0;

    }
}
