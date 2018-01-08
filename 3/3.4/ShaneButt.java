import java.lang.Object;

class Main extends BIO
{
    public static boolean checkPalindrome(String line)
    {
        return (line.toLowerCase().equals(new StringBuilder(line.toLowerCase()).reverse().toString()));
    }
    
    public static void main(String[] args)
    {
        String line = BIO.getString();
        while(!line.equals("END"))
        {
            boolean palindrome = checkPalindrome(line);
            if (palindrome)
            {
                System.out.println(line + "\tis a palindrome");
            } 
            else
            {
                System.out.println(line + "\tis not a palindrome");
            }
            line = BIO.getString();
        }
    }
}