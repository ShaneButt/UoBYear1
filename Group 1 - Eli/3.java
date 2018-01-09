/**
 * Eli Murray - ejdm11
 */

public class Main {
	public static void main(String[] args) {
		int sn = BIO.getInt(); //sn is Student Number
		while (sn != 0) {
			double cw = BIO.getInt();
			double ex = BIO.getInt();
			double mark = ( (cw + ex) /2);
			System.out.println("sn="+sn+" ex= "+(int)ex+" cw= "+(int)cw+" mark= "+mark);
			sn = BIO.getInt();
		}
	}
}
