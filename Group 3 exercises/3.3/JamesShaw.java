/**
 * Read in a word and display if the letters are in ascending order or not in ascending order
 *
 * @author James Shaw - Student jps60
 * @version 09/10/2017
 */
 
class Main
{
    public static void main( String args[] )
    {
        String word = BIO.getString();							//set word as input
	String newWord = "";
	Boolean swapped;								//create other variables
	
        while (!word.equals("END"))							//while word does not equal "END"
        {
            swapped = false;								//Set a boolean called swapped to false
	    newWord = word.toLowerCase();						//set newWord as the lowercase version of word
            for (int i = 1; i < newWord.length(); i++)					//for all values from 1 to newWord length -1
            {
                if (newWord.charAt(i-1) > newWord.charAt(i))				//if character at position i has a higher ascii value than the character before it
                {
                    swapped = true;							//change swapped to true
		    break;								//break out of the loop as you don't need to check anymore characters
                }
            }
            
            if (swapped == true)							//if swapped is true
            {
                System.out.printf("%-10s %-10s",word,"letters not in ascending order");	//print that the letters are not in ascending order
            }
            else									//if swapped is false
            {
                System.out.printf("%-10s %-10s",word,"letters in ascending order");	//print that the  letters are in ascending order
            }
            word = BIO.getString();							//get a new word
        }
    }
}
