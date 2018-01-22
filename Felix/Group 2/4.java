// Felix Angell - fa302

import java.util.Arrays;

public class Main {

	private int size;
	private int halfSize;
	
	public Main(int size) {
		this.size = size;
		this.halfSize = size / 2;
		
		// there will always be a * at the middle
		// at the top and bottom of the ascii grid
		printGap(0);
		
		for (int i = 1; i < halfSize; i++) {
			int diff = ((i * 2) - 1);
			printGap(diff);
		}
		
		for (int i = halfSize; i > 0; i--) {
			int diff = ((i * 2) - 1);
			printGap(diff);
		}
		
		printGap(0);
	}
	
	// again another assumption is we have
	// two asterisks and a gap between them.
	private void printGap(int gapSize) {
		if (gapSize == 0) {
			printLine(new int[] {halfSize, halfSize});
			return;
		}
		
		char[] line = new char[size];
		Arrays.fill(line, '.');
		
		int pos = ((size - gapSize) / 2) - 1;
		if (pos < 0) pos = 0;
		line[pos] = '*';
		line[(size - 1) - pos] = '*';
		
		System.out.println(line);
	}
	
	// this is based on the assumption that
	// there will only be two asterisks on 
	// a line at once.
	private void printLine(int[] coords) {
		char[] line = new char[size];
		Arrays.fill(line, '.');
		for (int c : coords) {
			line[c] = '*';
		}
		System.out.println(new String(line));
	}
	
	private static boolean isOdd(int n) {
		return (n & 1) != 0;
	}
	
	public static void main(String[] args) {
		int size = BIO.getInt();
		if (!isOdd(size)) {
			System.out.println("Side of diamond (" + size + ") must be odd");
			return;
		}
		
		if (size < 5 || size > 41) {
			System.out.println("Side of diamond (" + size + ") must be between 5 & 41");
			return;
		}
		
		// this is probably a bit of an excessive
		// solution but its the only way i can 
		// think of solving it right now!!!
		new Main(size);
	}
	
}


