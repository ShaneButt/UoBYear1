package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("input class work grade:");
        int classWork =  BIO.getInt();
        System.out.println("input exam grade:");
        int exam = BIO.getInt();

        double mark = (double)(exam + classWork) / 2;
        System.out.println("ex = " + exam + " cw = " + classWork + " mark = " + mark);
    }
}
