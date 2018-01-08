/**
 * Read in a word and say if it is a palindrome.
 *
 * @author James Shaw - Student jps60
 * @version 09/10/2017
 */
 
class Main
{
    public static void main( String args[] )
    {
        String word = BIO.getString();						//get word as input
	String newWord = "";
	String backwards = "";							//create other variables
		
        while (!word.equals("END"))						//while word does not equal "END"
        {
            newWord = word.toLowerCase();					//newWord equals word as all lower case
	    for (int i = word.length(); i > 0; i--)				//for all values from 0 to word length in descending order
            {
                backwards = backwards + newWord.charAt(i-1);			//add the character at position i-1 to the end of backwards
            }
            if ( newWord.equals(backwards))					//if newWord equals backwards
            {
                System.out.printf("%-10s %-10s",word,"is a palindrome");	//print that word is a palindrome
            }
            else								//if newWord does not equal backwards
            {
                System.out.printf("%-10s %-10s",word,"is not a palindrome");	//print that word is not a palindrome
            }
            word = BIO.getString();						//get a new word
        }
    }
}
