/**
 * Eli Murray - ejdm11
 */

public class Main {
	public static void main(String[] args) {
		String topLine = "";		//Initialise 3 variables, similar to 1.4
		String bottomLine = "";
		String midLine="*";
		int size = BIO.getInt();
		int dots = size-2;
		for (int i = 0;i < size; i++) {
			topLine = topLine + "*";
		}
		bottomLine = topLine;
		System.out.println(topLine);
		for (int i = 0; i < dots; i++) {
			midLine = midLine+".";
		}
		for (int i = 0; i < dots; i++) {
			System.out.println(midLine+"*");
		}
		System.out.println(bottomLine);
	}
}
