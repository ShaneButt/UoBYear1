/**
 * Eli Murray - ejdm11
 */

public class Main {
	public static void main(String[] args) {
		int size = BIO.getInt();
		String row = "";			//Initialise row as an empty string
		for (int w = 0; w < size; w++) {
			row = row+"*";			//Add * to string row
		}
		for (int h = 0; h < size; h++) {
			System.out.println(row);	//Print out string row (with added *s)
		}
	}
}
