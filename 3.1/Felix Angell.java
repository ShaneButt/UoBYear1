// Felix Angell - fa302

import java.util.ArrayList;

public class Main {

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
	
	public static int countSpaces(String line) {
		int numSpaces = 0;
		for (char c : line.toCharArray()) {
			if (c == ' ') numSpaces++;
		}
		return numSpaces;
	}
	
	public static void main(String[] args) {
		ArrayList<Pair<String, Integer>> lineSpaceCount = new ArrayList<>();
		
		String line = null;
		while (!(line = BIO.getString()).equals("END")) {
			lineSpaceCount.add(Pair.MakePair(line, countSpaces(line)));
		}
		
		for (Pair<String, Integer> lineInfo : lineSpaceCount) {
			System.out.println("[ " + lineInfo.snd + "] spaces in \"" + lineInfo.fst + "\"");
		}
	}
	
}


