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
		String name = BIO.getString();
		int mark = 0;
		String result = "";
		while (!"END".equals(name))
		{
			mark = BIO.getInt();
			if (mark < 40)
			{
				result = "fails";
			}
			else if (mark < 50)
			{
				result = "gains a 3rd";
			}
			else if (mark < 60)
			{
				result = "gains a 2.2";
			}
			else if (mark < 70)
			{
				result = "gains a 2.1";
			}
			else
			{
				result = "gains a 1st";
			}
			System.out.print(name+" ["+mark+"] "+result);
			name = BIO.getString();
		}
	}
}