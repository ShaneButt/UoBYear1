/**
 * Construct a program that reads in an integer, 'num',
 * and creates a square whose exterior/outline is constructed
 * of *'s and interior/body is filled with periods/full stops (.'s)
 *
 * @author Shane Butt sb1451
 * @version 05/10/2017
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
                if (x == 1 || x == num)
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
                else
                {
                    if (y == num)
                    {
                        System.out.println("*");
                    }
                    else if (y == 1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(".");
                    }
                }

            }
        }
    }
}

