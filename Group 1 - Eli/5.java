public class Main {
	public static void main(String[] args) {
		String topLine = "";
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