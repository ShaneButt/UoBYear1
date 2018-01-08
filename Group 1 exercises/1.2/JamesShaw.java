/**
 * Write a program that calculates an average mark from a given exam and coursework mark, and then output them all.
 *
 * @author James Shaw - Student jps60
 * @version 04/10/2017
 */
 
 class Main
{
    public static void main( String args[] )
    {
        int cw = BIO.getInt();		//get coursework mark
        int exam = BIO.getInt();	//get exam mark
        double mark = ((double)cw + (double)exam)/2;	//change cw and exam from int to double, then work out the overall mark
		System.out.print("ex = " + exam + " cw = " + cw + " mark = " + mark);
    }
}