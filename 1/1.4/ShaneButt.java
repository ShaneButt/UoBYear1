
/**
 * Write a description of class Main here.
 *
 * @author Shane Butt - Student sb1451
 * @version 03/10/2017
 */
public class Main
{
    public static void main(String[] args)
    {
        int num = BIO.getInt();
        for (int x = 1; x <= num; x++)
        {
            for (int y = 1; y <= num; y++)
            {
                if (y == num)
                {
                    System.out.println("*");
                } 
                else
                {
                    System.out.print("*");
                }
            }
        }
    }
}