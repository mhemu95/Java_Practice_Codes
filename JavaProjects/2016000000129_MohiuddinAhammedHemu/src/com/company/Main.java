package com.company;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;

        System.out.println("input number of cities: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        int[] A = new int[n];
        for (int i =0; i<n; i++) {
            System.out.println("Enter number of people: ");
            A[i] = s.nextInt();
        }
        for (int i=0; i<n; i++) {
            System.out.println(A[i]);
        }
        maxCoverage();
    }

    public static void maxCoverage(int A[]) {

        int dp[] = new int[n+1];
        int soln[] = new int[n+1];
        int i;

        dp[0] = 0;
        dp[1] = A[1];
        soln[1] = 1;

        for (i=2; i<=A; i++) {
            dp[i] = Math.max(dp[i-1], i + dp[i-2]);
            if ( (dp[i-1]) > (i + dp[i-2]) ) {
                soln[i] = 0;
            }
            else {
                soln[i] = 1;
            }

        }
        System.out.println("output dp: " + dp[i]);

    }

}
