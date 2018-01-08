/**
 * Write an application to read a series of data items representing students performance in a module. The output is the individual students result in the module.
 *
 * @author James Shaw - Student jps60
 * @version 04/10/2017
 */
 
 class Main
{
	public static void main( String args[] )
	{
		String name = BIO.getString();
		int cw = 0;
		int exam = 0;
		double mark = 0;
		String result = "";
		while (!"END".equals(name))
		{
			cw = BIO.getInt();
			exam = BIO.getInt();
			mark = ((double)cw + (double) exam)/2;
			if (mark >= 40 && cw >= 30 && exam >= 30)
			{
				result = "Pass";
			}
			else if (mark >= 40 && (cw <= 30 || exam <= 30))
			{
				result = "Fail [Threshold]";
			}
			else
			{
				result = "Fail";
			}
			System.out.print(name+" ["+cw+", "+exam+"] "+mark+" "+result);
			name = BIO.getString();
		}
	}
}