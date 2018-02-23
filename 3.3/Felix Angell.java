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
	
	// returns true if letters of string are in ascending order.
	public static boolean checkLine(String line) {
		// just because i hate reading charAt
		char[] raw = line.toCharArray();
		
		for (int i = 0; i < line.length() - 1; i++) {
			if (raw[i] > raw[i + 1]) {
				return false;
			}
		}
		
		// if we made it this far it's in
		// ascending order.
		return true;
	}
	
	public static void main(String[] args) {
		ArrayList<Pair<String, Boolean>> lines = new ArrayList<>();

		String line = null;
		while (!(line = BIO.getString()).equals("END")) {
			lines.add(Pair.MakePair(line, checkLine(line.toLowerCase())));
		}
		
		lines.forEach(lineInfo -> {
			final boolean ascendingOrder = lineInfo.snd;
			System.out.println(lineInfo.fst + "\tletters " 
					+ (ascendingOrder ? "in ascending order" : "not in ascending order"));
		});
	}
	
}


