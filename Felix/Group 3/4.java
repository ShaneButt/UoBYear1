// Felix Angell - fa302

import java.util.ArrayList;

public class Main {

	// my little helper pair thing
	private static class Pair<T, K> {
		public T fst;
		public K snd;
		
		public Pair(T fst, K snd) {
			this.fst = fst;
			this.snd = snd;
		}
		
		public static <T, K> Pair<T, K> MakePair(T t, K k) {
			return new Pair<T, K>(t, k);
		}
	}

	public static boolean isPalindrome(String s) {
		char[] raw = s.toCharArray();	
		
		final int len = s.length();
		final int half = len / 2;
		
		for (int i = 0; i < half; i++) {
			if (raw[i] != raw[len - i - 1]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		ArrayList<Pair<String, Boolean>> lines = new ArrayList<>();

		String line = null;
		while (!(line = BIO.getString()).equals("END")) {
			lines.add(Pair.MakePair(line, isPalindrome(line.toLowerCase())));
		}
		
		lines.forEach(lineInfo -> {
			final boolean isPalindrome = lineInfo.snd;
			System.out.println(lineInfo.fst + "\t" 
					+ (isPalindrome ? "is a palindrome" : "is not a palindrome"));
		});
	}
	
}


