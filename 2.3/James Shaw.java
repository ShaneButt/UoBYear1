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
		String name = BIO.getString();						//get name as input
		int cw = 0;
		int exam = 0;
		double mark = 0;
		String result = "";							//create other variables 
		while (!name.equals("END"))						//while name does not equal "END"
		{
			cw = BIO.getInt();						//get coursework mark
			exam = BIO.getInt();						//get exam mark
			mark = ((double)cw + (double) exam)/2;				//calculate overall mark
			if (mark >= 40 && cw >= 30 && exam >= 30)			//if mark is 40 or greater AND coursework is 30 or greater AND exam is 30 or greater
			{
				result = "Pass";					//result equals "Pass"
			}
			else if (mark >= 40 && (cw <= 30 || exam <= 30))		//if mark is 40 or greater and EITHER coursework or exam is 30 or greater
			{
				result = "Fail [Threshold]";				//result equals "Fail [Threshold]"
			}
			else								//if mark is less than 40 OR mark is greater than 40 but both exam and coursework are less than 30
			{
				result = "Fail";					//result equals "Fail"
			}
			System.out.print(name+" ["+cw+", "+exam+"] "+mark+" "+result);	//print the result
			name = BIO.getString();						//get the next name (or END condition)
		}
	}
}
