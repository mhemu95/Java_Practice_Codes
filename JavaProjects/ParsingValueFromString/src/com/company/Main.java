package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2016000000129";
        System.out.println("number as string is: " + numberAsString);

        long number = Long.parseLong(numberAsString);
        System.out.println("number from string is: " + number);

        // Reading input from user:
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number ");
        int number2 = scanner.nextInt();
        //this scanner input the (enter key) as string so that String can be taken input next
        scanner.nextLine();

        System.out.println("Enter your name ");
        String name = scanner.nextLine();


        System.out.println("name is " + name);
        System.out.println("number is " + number2);
    }
}
