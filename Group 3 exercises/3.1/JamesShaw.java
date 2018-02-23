/**
 * Write an application that reads in lines of text and returns the number of spaces in each line.
 *
 * @author James Shaw - Student jps60
 * @version 08/10/2017
 */
 
class Main
{
    public static void main( String args[] )
    {
        String input = BIO.getString();							//get line of text as input
        int count = 0;
        char character;									//create other variables
        
        while (!input.equals("END"))							//while input does not equal "END"
        {
            for (int i = 0; i < input.length(); i++)					//for all values from 0 to input length -1
            {
                character = input.charAt(i);						//character is at whichever character is at position i
                if (character == ' ')							//if character equals a space
                {
                    count++;								//count increases by 1
                }
            }
            System.out.printf("%1s %-10s","[ ",count+"] spaces in \""+input+"\"");	//print the result
	    count = 0;									//reset count
            input = BIO.getString();							//get the next line of text (or END condition)
        }
    }   
}
