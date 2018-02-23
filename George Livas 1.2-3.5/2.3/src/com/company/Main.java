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

            System.out.println("#the coursework Mark");
            int coursework = BIO.getInt();

            System.out.println("#the coursework Mark");
            int exam = BIO.getInt();

            double mark = (double)(coursework + exam)/2;

            if(mark >= 40 && exam >= 30 && coursework >= 30) {
                System.out.println(
                                studentName + " [" +
                                coursework + ", " +
                                exam + "]  " +
                                mark + " Pass"
                );
            } else if(mark >= 40 && (exam < 30 || coursework < 30)) {
                System.out.println(
                        studentName + " [" +
                                coursework + ", " +
                                exam + "]  " +
                                mark + " Fail [Threshold]"
                );
            } else if(mark <= 40) {
                System.out.println(
                        studentName + " [" +
                                coursework + ", " +
                                exam + "]  " +
                                mark + " Fail"
                );
            }

        }
    }
}
