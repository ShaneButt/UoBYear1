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
        String name = BIO.getString();		//get student name as input
        int mark = 0;
        String result = "";			//create other variables with empty placeholder values
        while (!name.equals("END"))		//while the variable name does not equal "END"
        {
            mark = BIO.getInt();		//get student mark as input
            if (mark >= 40)			//if the mark is greater than or equal to 40
            {
                result = " Pass";		//result is equal to pass
            }
            else				//if the result is less than 40
            {
                result = " Fail";		//result is equal to fail
            }
            System.out.print(name + result);	//print the student's name and their result
            name = BIO.getString();		//get the next student's name as input (or get END value)
        }
    }
}
