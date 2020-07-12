package com.company;
// Method overloading is we can use same method name everytime but parameter will be different for
// every method
public class Main {

    public static void main(String[] args) {
//        int highScore = highScore("Hemu", 500);
//        System.out.println("New High Score is " + highScore);

        double centimeterCompriseFeetAndIches = calcFeetAndInches(6, 0);
        System.out.println(centimeterCompriseFeetAndIches);

        centimeterCompriseFeetAndIches = calcFeetAndInches(156);
        System.out.println(centimeterCompriseFeetAndIches);

    }

//    public static int highScore(String name, int score) {
//        System.out.println("player " + name + " scored " + score + " points");
//        return score * 1000;
//    }

    public static double calcFeetAndInches (double feet, double inches) {
        if (feet < 0) {
            return -1;
        }else if (inches <0 || inches >=12) {
            return -1;
        }
        return inches * 2.54 + feet * 30.48;
    }

    public static double calcFeetAndInches (double inches) {
        if (inches <=0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remaining = (int) inches % 12;
        return calcFeetAndInches(feet, remaining);
    }
}
