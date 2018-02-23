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
		int sn = BIO.getInt();									//get student number as input
		int cw = 0;
		int exam = 0;
		double mark = 0;									//create other variables
		while (sn != 0 && String.valueOf(sn).length() == 8)					//While loop that says while sn does not equal 0 and the length of the student number is 8 characters, then run this code
		{
			cw= BIO.getInt();								//get coursework mark
			exam = BIO.getInt();								//get exam mark
			mark = ((double)cw + (double)exam)/2;						//calculate final mark
			System.out.println("sn = "+sn+" ex = "+exam+" cw = "+cw+" mark = "+mark);	//print the summary to the terminal
			sn = BIO.getInt();								//get the next student number or get the end value (0)
		}
   	}
}
