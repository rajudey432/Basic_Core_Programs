package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        // Check if the given character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a consonant");
        }
    }
}