/**
 * Eli Murray - ejdm11
 */

public class Main {
	public static void main(String[] args) {
		String input = BIO.getString();
		while (true) {
			String input = BIO.getString();
			if (input.equals("END")) {
				System.exit(1);
			}
			int withspaces = input.length();
			int nospaces = input.replace(" ", "").length();
			int count = withspaces - nospaces;		// Length of string with spaces - length of
									// string without spaces = amount of spaces
			System.out.print("[");
			if (count < 10) {
				System.out.print(" " + count);
			} else {
				System.out.print(count);
			}
			System.out.print("] spaces in ");
			System.out.println("\"" + input + "\"");	// Print statement split for code readability
		}
	}
}
