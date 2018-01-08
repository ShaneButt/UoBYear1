/**
 * Read in several sets of data representing student numbers and marks, then output a summary of each students performance.
 *
 * @author James Shaw - Student jps60
 * @version 04/10/2017
 */
 
 class Main
{
    public static void main( String args[] )
    	{
		int sn = BIO.getInt();
		int cw = 0;
		int exam = 0;
		double mark = 0;
		while (sn != 0 && String.valueOf(sn).length() == 8)
		{
			cw= BIO.getInt();
			exam = BIO.getInt();
			mark = ((double)cw + (double)exam)/2;
			System.out.println("sn = "+sn+" ex = "+exam+" cw = "+cw+" mark = "+mark);
			sn = BIO.getInt();
		}
   	}
}