package com.company;

public class Main {

    public static void main(String[] args) {
        //if statement
        boolean isEmpty = false;
        if (!isEmpty == true) {
            System.out.println("the box is empty !");
        }

        // Logical &&
        int topScore = 90;
        int secondTopScore = 85;
        if (topScore > secondTopScore && topScore <= 100) {
            System.out.println("the condition worked !");
        }

        boolean isbikeon = false;   //when isbikeon = true; the statemwnt works
        if (isbikeon) {
            System.out.println("turn the bike off");
        }

        //ternary operator
        int age = 20;
        boolean isAgeTwenty = (age == 10) ? false : true;
        if (isAgeTwenty) {
            System.out.println("age is twenty !");
        }

        int newAge = 18;
        boolean isNewAge = (newAge == 18) ? true : false;
        if (isNewAge) {
            System.out.println("age is = " + isNewAge);
        }

        //operator challenge

        double firstVariable = 20.00;
        double secondVariable = 80.00;
        double addition = firstVariable + secondVariable * 100.00;
        System.out.println("addition is = " + addition);
        double remainder = addition % 40.00;
        System.out.println("remainder is = " + remainder);
        boolean isRemainder = (remainder == 0) ? true : false;
        System.out.println(isRemainder);
        if (!isRemainder) {
            System.out.println("Got Some Remainder !");
        }

        //variable inside a code block is called scope
        boolean gameOver = true;
        int score = 1000;
        int roundBonus = 50;
        int gameOverBonus = 500;

        if (gameOver) {
            //int finalScore is a scope
            int finalScore = (score + roundBonus) * gameOverBonus;
            System.out.println("Your final score is = " + finalScore);
        } else {
            System.out.println("Game is not over !");
        }
    }
}
