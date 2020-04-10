package com.company;

import java.util.Scanner;

public class RocketOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj poziom: ");
        int sequences = input.nextInt();

        System.out.println("Podaj czy ma być tarcza (N / Y):");
        char shield = input.next().charAt(0);

        switch (shield) {
            case 'N':
                printSequence(sequences);
                break;
            case 'Y':
                System.out.println("Not implemented...");
                break;
            default:
                break;
        }

    }

    private static void printSequence(int sequences) {
        int numberOfDots = 0;
        int numberOfSpaces = sequences;
        int currentLevel = 1;
        int numberOfLevels = (sequences * 2) - 1;

        while (currentLevel <= numberOfLevels) {
            if (currentLevel <= sequences) {
                numberOfSpaces--;
                numberOfDots++;
            } else {
                numberOfSpaces++;
                numberOfDots--;
            }
            printLevel(numberOfSpaces, sequences, numberOfDots);
            System.out.println();
            System.out.println();
            currentLevel++;
        }

        /*printLevel(4, 5, 1);
        System.out.println();
        printLevel(3, 5, 2);
        System.out.println();
        printLevel(2, 5, 3);
        System.out.println();
        printLevel(1, 5, 4);
        System.out.println();
        printLevel(0, 5, 5);
        System.out.println();
        printLevel(1, 5, 4);
        System.out.println();
        printLevel(2, 5, 3);
        System.out.println();
        printLevel(3, 5, 2);
        System.out.println();
        printLevel(4, 5, 1);*/
    }

    public static void printLevel(int spaces, int sequences, int numberOfDots) {
        final String star = "*";
        final String space = " ";
        for (int i = 0; i < sequences; i++) {
            System.out.print(star.repeat(numberOfDots) + space.repeat(spaces));
        }
    }
}

