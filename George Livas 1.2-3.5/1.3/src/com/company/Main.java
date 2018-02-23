package com.company;

public class Main {
    public static void main(String[] args) {
        int data = 0;
        for (int i = 0; i <= data; i++) {
            System.out.println("#The students number");
            int studentNumber = BIO.getInt();
            if (studentNumber == 0) {
                break;
            } else {
                data++;
            }
            System.out.println("#Their cw Mark");
            int cwMark = BIO.getInt();
            System.out.println("#Their exam Mark");
            int examMark = BIO.getInt();

            double mark = (double)(examMark + cwMark)/2;
            System.out.println(
                    "sn=" + studentNumber + " ex=" + examMark + "  cw=" + cwMark + "  mark=" + mark);

        }
    }
}
