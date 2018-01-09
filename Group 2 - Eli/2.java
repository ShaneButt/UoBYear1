/**
 * Eli Murray - ejdm11
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static List<String> names = new ArrayList<String>();
	public static List<String> scores = new ArrayList<String>();

	public static void main(String[] args) {
		String name = "";
		int score = 0;

		while(true) {
			name = BIO.getString();
			if (name.equals("END")) {
				for (int i = 0; i < names.size(); i++) {
					System.out.println(names.get(i) + scores.get(i));
				}
				System.exit(1);
			}
			score = BIO.getInt();
			names.add(name);

			if (score < 40) {
				scores.add(" ["+score+"] fails");
			} else if (score >= 40 && score < 50) {
				scores.add(" ["+score+"] gains a 3rd");
			} else if (score >= 50 && score < 60) {
				scores.add(" ["+score+"] gains a 2.2");
			} else if (score >= 60 && score < 70) {
				scores.add(" ["+score+"] gains a 2.1");
			} else {
				scores.add(" ["+score+"] gains a 1st");
			}
		}
	}
}
