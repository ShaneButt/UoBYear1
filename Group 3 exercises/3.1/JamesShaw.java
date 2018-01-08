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
        String input = BIO.getString();
        int count = 0;
        char character;
        
        while (!input.equals("END"))
        {
            for (int i = 0; i < input.length(); i++)
            {
                character = input.charAt(i);
                if (character == ' ')
                {
                    count++;
                }
            }
            System.out.printf("%1s %-10s","[ ",count+"] spaces in \""+input+"\"");
			count = 0;
            input = BIO.getString();
        }
    }   
}