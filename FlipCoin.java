package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;
import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of times to flip the coin: ");
        int numFlips = input.nextInt();
        input.close();

        if (numFlips <= 0) {
            System.out.println("Invalid input. The number of flips must be a positive integer.");
            return;
        }

        int numHeads = 0;
        int numTails = 0;

        for (int i = 0; i < numFlips; i++) {
            if (random.nextDouble() < 0.5) {
                numTails++;
            } else {
                numHeads++;
            }
        }

        double headPercentage = (double) numHeads / numFlips * 100;
        double tailPercentage = (double) numTails / numFlips * 100;

        System.out.printf("Heads: %.2f%%\n", headPercentage);
        System.out.printf("Tails: %.2f%%\n", tailPercentage);
    }
}