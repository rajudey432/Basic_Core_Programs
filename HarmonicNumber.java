package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        sc.close();

        double harmonic = 0;
        for (int i = 1; i <= N; i++) {
            harmonic += (double) 1 / i;
        }

        System.out.println("The " + N + "th Harmonic number is: " + harmonic);
    }
}