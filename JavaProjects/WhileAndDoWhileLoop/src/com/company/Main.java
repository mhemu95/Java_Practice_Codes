package com.company;

public class Main {

    public static void main(String[] args) {
        //isEvenNumber(12);

        int count = 1;
        while(count!=5){
            System.out.println(count);
            count++;
        }

        count=6;
        do {
            System.out.println(count);
            count++;
        }while (count<10);
    }

    public static int isEvenNumber(int num) {
        if (num%2==0) {
            System.out.println(num + " is an even number");
        }else {
            System.out.println(num + " is an odd number");
        }
        return 0;
    }
}
