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
				print();
			}
			score = BIO.getInt();
			names.add(name);

			if(score < 40) {
				scores.add(" Fail");
			} else {
				scores.add(" Pass");
			}
		}
	}

	private static void print() {
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i) + scores.get(i));
		}
		System.exit(1);
	}
}