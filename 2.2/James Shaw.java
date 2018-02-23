/**
 * Write an application to read a series of data items representing students performance in the course. The output is the individual students result in the course.
 *
 * @author James Shaw - Student jps60
 * @version 04/10/2017
 */
 
 class Main
{
	public static void main( String args[] )
	{
		String name = BIO.getString();				//get name as input
		int mark = 0;
		String result = "";					//create other variables with empty placeholder values
		while (!name.equals("END"))				//while name does not equal "END"
		{
			mark = BIO.getInt();				//get mark as input
			if (mark < 40)					//if mark is less than 40
			{
				result = "fails";			//result equals "fails"
			}
			else if (mark < 50)				//if mark is greater than or equal to 40 but less than 50
			{
				result = "gains a 3rd";			//result equals "gains a 3rd"
			}
			else if (mark < 60)				//if mark is greater than or equal to 50 but less than 60
			{
				result = "gains a 2.2";			//result equals "gains a 2.2"
			}
			else if (mark < 70)				//if mark is greater than or equal to 60 but less than 70
			{
				result = "gains a 2.1";			//result equals "gains a 2.1"
			}
			else						//if mark is greater than or equal to 70
			{
				result = "gains a 1st";			//result equals "gains a 1st"
			}
			System.out.print(name+" ["+mark+"] "+result);	//print the result
			name = BIO.getString();				//get next name (or END value)
		}
	}
}	
