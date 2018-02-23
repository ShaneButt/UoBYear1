package com.company;

public class Main {

    public static boolean isPalindrome(String input) {
        String word = input.toLowerCase();
        int length = word.length();
        for (int i = 0; i < length/2; ++i) {
            if (word.charAt(i) != word.charAt(length-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
	    String word = "";
	    while (word.equals("END") != true) {
	        word = BIO.getString();
	        if (word.equals("END") == true) {
	            break;
            }
            if (isPalindrome(word) == true) {
                System.out.println(word + "       is a palindrome");
            } else {
                System.out.println(word + "       is not a palindrome");
            }
        }
    }
}
