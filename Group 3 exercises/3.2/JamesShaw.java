/**
 * Read in a word and display the number of vowels in the word.
 *
 * @author James Shaw - Student jps60
 * @version 08/10/2017
 */
 
class Main
{
    public static void main( String args[] )
    {
        String input = BIO.getString();							//get word as input
        int count = 0;
        char character;									//create other variables
        
        while (!input.equals("END"))							//while input does not equal "END"
        {
	    input = input.toLowerCase();						//changes all the characters from input to lower case so you only have to check for lower case vowells
            for (int i = 0; i < input.length(); i++)					//for all values from 0 to input length -1
            {
                character = input.charAt(i);						//character equals whatever character is at position i
                if (character == 'a'||character == 'e'||character == 'i'||character == 'o'||character == 'u')
											//if character is equal to either a, e, i, o or u
                {
                    count++;								//increase count by 1
                }
            }
            System.out.printf("%1s %-10s","[ ",count+"] vowels in \""+input+"\"");	//print the result
	    count = 0;									//reset count
            input = BIO.getString();							//get next word as input (or END condition)
        }
    }   
}
