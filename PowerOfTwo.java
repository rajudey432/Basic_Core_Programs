package com.bridgelabz.BasicCorePrograms;

public class PowerOfTwo {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java PowerOfTwo <N>");
            System.exit(1);
        }

        int n = Integer.parseInt(args[0]);

        if (n < 0 || n >= 31) {
            System.out.println("N must be between 0 and 30");
            System.exit(1);
        }

        for (int i = 0; i <= n; i++) {
            System.out.println("2^" + i + " = " + (int)Math.pow(2, i));
        }
    }
}