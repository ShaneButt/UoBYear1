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
        String word = BIO.getString();
		
        while (! "END".equals(word))
        {
            String newWord = word.toLowerCase();
			String backwards = "";
			for (int i = word.length(); i > 0; i--)
            {
                backwards = backwards + newWord.charAt(i-1);
            }
            if ( newWord.equals(backwards))
            {
                System.out.printf("%-10s %-10s",word,"is a palindrome");
            }
            else
            {
                System.out.printf("%-10s %-10s",word,"is not a palindrome");
            }
            word = BIO.getString();
        }
    }
}