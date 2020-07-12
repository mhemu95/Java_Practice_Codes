package com.company;

public class Main {

    public static void main(String[] args) {

/*        boolean gameOver;
        int score;
        int levelBonus;
        int bonus;

        scoreCalculate(true, 10000, 8, 1000);
        System.out.println("---------------------------------------------");
*/

        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Tom", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Jerry", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Samurai", highScorePosition);

    }

    public static int scoreCalculate(boolean gameOver, int score, int levelBous, int bonus) {
        if (gameOver) {
            int finalScore = score * levelBous + bonus;
            System.out.println("final score is = " + finalScore);

            return finalScore;

        }
        return -1;

    }


    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
 /*       if (score >= 1000){
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
 */

/*        if (score >= 1000) {
            return 1;
        }else if (score >= 500) {
            return 2;
        }else if (score >= 100) {
            return 3;
        }else {
            return 4;
        }

 */
        int position = 4;

        if (score >=1000) {
            return position = 1;
        }else if (score >= 500) {
            return position = 2;
        }else if (score >= 100) {
            return position =3;
        }

        return position;
    }
}
