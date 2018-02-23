/**
 * Eli Murray - ejdm11
 */

public class Main {
	public static void main(String[] args) {
		double cw = BIO.getInt(); //Coursework mark
		double ex = BIO.getInt(); //Exam mark
		double mark = ( (cw + ex)/2);
		System.out.println("ex = "+(int)ex+" cw = "+(int)cw+" mark = "+mark);
		/**
		 * 
		 * Please note: The use of (int) in front of ex and cw on line 10 are for
		 * casting (converting on the fly) the variables to an integer
		 */
	}
}
