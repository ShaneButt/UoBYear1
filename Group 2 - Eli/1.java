/**
 * Eli Murray - ejdm11
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static List<String> names = new ArrayList<String>();	// Stores the names and
	public static List<String> scores = new ArrayList<String>();	// scores in ArrayLists

	public static void main(String[] args) {
		String name = "";					// These two variables store the
		int score = 0;						// current name and score

		while(true) {
			name = BIO.getString();
			if (name.equals("END")) {
				print();
			}
			score = BIO.getInt();
			names.add(name);				// Add name to the names ArrayList declared line 9

			if(score < 40) {
				scores.add(" Fail");
			} else {
				scores.add(" Pass");
			}						// Push " Fail" or " Pass" to the
		}							// scores ArrayList declared line 10
	}

	private static void print() {
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i) + scores.get(i));	// ___.get pulls the value at index
		}								// i from each ArrayList
		System.exit(1);
	}
}
