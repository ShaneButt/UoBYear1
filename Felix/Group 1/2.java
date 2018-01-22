// Felix Angell - fa302

public class Main {
	
	// 1.2
	// reads in two numbers the coursework mark
	// and the exam mark for ci101. 
	public static void main(String[] args) {
		int cwMark = BIO.getInt(); // coursework mark
		int exMark = BIO.getInt(); // exam mark
		double mark = (double) (exMark + cwMark) / 2;
		System.out.printf("ex = %d cw = %d mark = %.1f\n", exMark, cwMark, mark);
	}
	
}


