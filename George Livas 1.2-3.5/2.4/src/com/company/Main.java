package com.company;

public class Main {

    public static boolean isValidDiamondSize(int sizeOfDiamond) {
        if (sizeOfDiamond % 2 == 0) {
            System.out.println("Side of diamond (" + sizeOfDiamond + ") must be odd");
            return false;
        }
        if (sizeOfDiamond < 5 || sizeOfDiamond > 41) {
            System.out.println("Side of diamond (" + sizeOfDiamond + ") must be between 5 & 41");
            return false;
        }
        return true;
    }

    public static int abs(int num) {
        return num > 0 ? num : -num;
    }

    public static void drawDiamondLine(int size, int i) {
        for (int j = 0; j < size; j++) {
            System.out.print((abs(size/2 - j) == i)? "*" : ".");
        }
        System.out.println();
    }

    public static void drawDiamond(int size) {
        if (!isValidDiamondSize(size)) {
            return;
        }
        for (int i = 0; i < size/2; i++) {
            drawDiamondLine(size, i);
        }
        for (int i = size/2; i >= 0; i--) {
            drawDiamondLine(size, i);
        }
    }

    public static void main(String[] args) {
        System.out.println("#Enter the size of the diamond: ");
        int sizeOfDiamond = BIO.getInt();
        drawDiamond(sizeOfDiamond);
    }
}
