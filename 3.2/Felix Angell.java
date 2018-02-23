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
	
	public static int countVowels(String line) {
		// assuming the input is all ascii which is 0 - 128
		// not the most memory efficient but hey it's quick and easy
		int[] vowelCount = new int[255];

		for (char c : line.toCharArray()) {
			// quicker (to program) counting every letter
			// then pick the ones we need later.
			vowelCount[c]++;
		}
		
		// add up all the vowel counts
		return vowelCount['a'] + 
				vowelCount['e'] + 
				vowelCount['i'] + 
				vowelCount['o'] + 
				vowelCount['u'];
	}
	
	public static void main(String[] args) {
		ArrayList<Pair<String, Integer>> lines = new ArrayList<>();

		String line = null;
		while (!(line = BIO.getString()).equals("END")) {
			// we convert all the chars to lowercase only when counting
			// the vowels, this is because the countVowels function works
			// in lowercase
			lines.add(Pair.MakePair(line, countVowels(line.toLowerCase())));
		}
		
		lines.forEach(lineInfo -> {
			System.out.println("[\t" + lineInfo.snd + "] vowels in \"" + lineInfo.fst + "\"");
		});
	}
	
}


