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
            if (mark >= 70 ) {
                System.out.println(studentName + " [" + mark + "] " + " gains a 1st");
            } else if (mark >= 60 && mark <= 69) {
                System.out.println(studentName + " [" + mark + "] " + " gains a 2.1");
            } else if (mark >= 50 && mark <= 59) {
                System.out.println(studentName + " [" + mark + "] " + " gains a 2.2");
            } else if (mark >= 40 && mark <= 49) {
                System.out.println(studentName + " [" + mark + "] " + " gains a 3rd");
            } else if (mark >= 0 && mark <= 39) {
                System.out.println(studentName + " [" + mark + "] " + " fails");
            }
            System.out.println();
        }
    }
}
