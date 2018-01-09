public class Main {
	public static void main(String[] args) {
		int size = BIO.getInt();
		String row = "";
		for (int w = 0; w < size; w++) {
			row = row+"*";
		}
		for (int h = 0; h < size; h++) {
			System.out.println(row);
		}
	}
}