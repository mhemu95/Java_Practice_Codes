package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 1000;
        int roundBonus = 800;
        int bonus = 500;

        if (gameOver == true) {
            int finalScore = score + roundBonus + bonus;
            System.out.println("round 1 completed. score =  " + finalScore);
        } else {
            System.out.println("round 1 is not over");
        }

        if (gameOver && score>1500) {
            int finalScore = (score + roundBonus + bonus) * 2;
            System.out.println("round 2 completed. score= " + finalScore);
        } else if (gameOver || score<1500) {
            System.out.println("round 2 over but score not reached !");
        } else {
            System.out.println("round 2 is not over !");
        }

        if (!gameOver) {
            int finalScore = (score + roundBonus + (bonus*2) );
            System.out.println("round 3 completed. score= " + finalScore);
        } else {
            System.out.println("round 3 is not over !");
        }
    }
}
