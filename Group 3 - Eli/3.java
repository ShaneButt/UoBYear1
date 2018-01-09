import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		while (true) {
			String input = BIO.getString();
			if (input.equals("END")) {
				System.exit(1);
			}
			String str = input;
			
			Character[] chars = new Character[str.length()];
			for (int i = 0; i < chars.length; i++)
			    chars[i] = str.charAt(i);

			Arrays.sort(chars, new Comparator<Character>() {
			    public int compare(Character c1, Character c2) {
			        int cmp = Character.compare(
			            Character.toLowerCase(c1.charValue()),
			            Character.toLowerCase(c2.charValue())
			        );
			        if (cmp != 0) return cmp;
			        return Character.compare(c1.charValue(), c2.charValue());
			    }
			});

			StringBuilder sb = new StringBuilder(chars.length);
			for (char c : chars) sb.append(c);
			str = sb.toString();
			
			if (str.equalsIgnoreCase(input)) {
				System.out.printf("%-10s letters in ascending order", input);
			} else {
				System.out.printf("%-10s letters not in ascending  order", input);
			}
		}
	}
}