package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("#enter a number");
        int sideOfSquare = BIO.getInt();

        for (int j = 0; j < sideOfSquare; j++) {
            System.out.print("*");
        }

        for (int i = 0; i < sideOfSquare-2; i ++) {
            System.out.println();
            System.out.print("*");
            for (int x = 0; x < sideOfSquare-2; x++) {
                System.out.print(".");
            }
            System.out.print("*");
        }
        System.out.println();
        for (int j = 0; j < sideOfSquare; j++) {
            System.out.print("*");
        }
    }
}
