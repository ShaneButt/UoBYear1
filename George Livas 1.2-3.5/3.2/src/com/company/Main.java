package com.company;

public class Main {
    public static boolean isAscending(String input){
        String word = input.toLowerCase();
        if (word==null || word.length()==0){
            return false;
        }
        for (int i=1; i<word.length(); i++){
            if (word.charAt(i) < word.charAt(i-1))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "";
        while (input.equals("END") != true) {
            input = BIO.getString();
            if(input.equals("END") == true) {
                break;
            }
            if (isAscending(input) == true) {
                System.out.println(input + "  letters in ascending order");
            } else {
                System.out.println(input + "  letters not in ascending order");
            }

        }
    }
}
