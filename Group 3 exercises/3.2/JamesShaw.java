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
        String input = BIO.getString();
        int count = 0;
        char character;
        
        while (!input.equals("END"))
        {
            for (int i = 0; i < input.length(); i++)
            {
                character = input.charAt(i);
                if (character == 'a'||character == 'e'||character == 'i'||character == 'o'||character == 'u'||character == 'A'||character == 'E'||character == 'I'||character == 'O'||character == 'U')
                {
                    count++;
                }
            }
            System.out.printf("%1s %-10s","[ ",count+"] vowels in \""+input+"\"");
			count = 0;
            input = BIO.getString();
        }
    }   
}