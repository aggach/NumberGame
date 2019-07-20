package com.company;

import java.util.Scanner;

public class NumberGame {

    public static void main(String[] arg) {

        int random = (int) (Math.random() * 100) + 1;
        boolean isWon = false;

        System.out.println("There is random number between 1- 100. Try to guess ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess left. Try again! ");
            int guess = scanner.nextInt();

            if (random > guess) {
                System.out.println("Number is to small");
            }
            if (random < guess) {
                System.out.println("Number is to big");
            }
            if (random == guess) {
                isWon = true;
                break;
            }
        }
        if (isWon) {
            System.out.println("You won");
        } else {
            System.out.println(" You loose. The numer is " + random);
        }

        System.out.println();
    }
}
