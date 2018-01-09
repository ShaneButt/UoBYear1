public class Main {
	public static void main(String[] args) {
		while (true) {
			String input = BIO.getString();
			if (input.equals("END")) {
				System.exit(1);
			}
			int withspaces = input.length();
			int nospaces = input.toLowerCase().replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "").length();
			int x = withspaces - nospaces;
			
			System.out.print("[  ");
			if (x < 10) {
				System.out.print(" " + x);
			} else {
				System.out.print(x);
			}
			System.out.print("] vowels in ");
			System.out.print("\"" + input + "\"");
		}
	}
}