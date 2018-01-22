// Felix Angell - fa302

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public int countSpaces(String s) {
		int numSpaces = 0;
		for (char c : s.toCharArray()) {
			if (c == ' ') numSpaces++;
		}
		return numSpaces;
	}
	
	private String reformat(String line, int width) {
		// cut into words
		String[] words = line.split(" ");
		String[] spaces = new String[words.length - 1];
		Arrays.fill(spaces, " ");
		
		// work out how many spaces we can add to the string
		int gap = width - line.length();

		// if theres only one word
		if (words.length == 1) {
			char[] hack = new char[width - words[0].length()];
			return words[0] + new String(hack).replace('\0', ' ');
		}
		
		int idx = 0;
		while (gap > 0) {
			if (idx >= spaces.length) idx = 0;
			spaces[idx++] += ' '; gap--;
		}
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < words.length - 1; i++) {
			result.append(words[i] + spaces[i]);
		}
		// apend the last word manually.
		result.append(words[words.length - 1]);
		
		return result.toString();
	}
	
	public void printText(ArrayList<String> lines, int width) {
		for (String line : lines) {
			System.out.println(reformat(line, width).replace(' ', '.'));
		}
	}
	
	public static void main(String[] args) {
		int lineWidth = BIO.getInt();
		ArrayList<String> lines = new ArrayList<>();
		
		String line = null;
		while (!(line = BIO.getString()).equals("END")) {
			lines.add(line);
		}
		
		new Main().printText(lines, lineWidth);
	}
	
}


