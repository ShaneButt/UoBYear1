package com.company;

public class Main {

    public static void main(String[] args) {
        String input = "";
        while (input.equals("END") != true) {
            input = BIO.getString();
            if(input.equals("END") == true) {
                break;
            }

            int spaces = input.replaceAll("[^ ]", "").length();
            System.out.println("[" + spaces + "] in line \"" + input + "\"");
        }
    }
}
