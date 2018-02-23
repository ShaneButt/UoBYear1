package com.company;

public class Main {

    public static void main(String[] args) {
        int data = 0;
        for (int i = 0; i <= data; i++) {
            System.out.println("#The students name");
            String studentName = BIO.getString();

            if (studentName.equals("END")) {
                break;
            } else {
                data++;
            }
            System.out.println("#the Mark");
            int mark = BIO.getInt();
            if (mark >= 40) {
                System.out.println(studentName + "  Pass");
            } else {
                System.out.println(studentName + "  Fail");
            }
            System.out.println();

        }
    }
}
