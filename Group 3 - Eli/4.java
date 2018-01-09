public class Main {
	public static void main(String[] args) {
		while (true) {
			String input = BIO.getString().trim();
			if (input.equals("END")) {
				System.exit(1);
			}
			
			if (isPalindrome(input)) {
				System.out.printf("%-10s is a palindrome", input);
			} else {
				System.out.printf("%-10s is not a palindrome", input);
			}
		}
	}
	
	static boolean isPalindrome(String s) {
		  int n = s.length();
		  for (int i = 0; i < (n/2); ++i) {
		     if (s.toLowerCase().charAt(i) != s.toLowerCase().charAt(n - i - 1)) {
		         return false;
		     }
		  }

		  return true;
		}
}
