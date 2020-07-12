package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;

        while (true) {
            System.out.println("Enter a number: ");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int num = scanner.nextInt();
                sum += num;
                counter ++;

                if (counter == 5) {
                    break;
                }
            } else {
                System.out.println("invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("sum is " + sum);
    }

}