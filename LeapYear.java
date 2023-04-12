package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year (4 digits): ");
        int year = input.nextInt();

        boolean isLeapYear = false;

        // Checking if the year is divisible by 4
        if (year % 4 == 0) {
            // If the year is divisible by 100, it must also be divisible by 400 to be a leap year
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}