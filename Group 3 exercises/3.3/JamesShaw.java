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
        String word = BIO.getString();
		String newWord = word.toLowerCase();
	
        while (! "END".equals(word))
        {
            Boolean swapped = false;
            for (int i = 1; i < newWord.length(); i++)
            {
                if (newWord.charAt(i-1) > newWord.charAt(i))
                {
                    swapped = true;
                }
            }
            
            if (swapped == true)
            {
                System.out.printf("%-10s %-10s",word,"letters not in ascending order");
            }
            else
            {
                System.out.printf("%-10s %-10s",word,"letters in ascending order");
            }
            word = BIO.getString();
			if (!"END".equals(word))
			{
				newWord = word.toLowerCase();
			}
        }
    }
}