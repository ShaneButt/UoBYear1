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
        int num = BIO.getInt(); // width integer
        for (int x = 1; x <= num; x++) // intialise the column
        {
            for (int y = 1; y <= num; y++) // intialise the row (i inversed the variables as i wrote this)
            {
                if (x == 1 || x == num) // is it the first or last row?
                {
                    // if yes, then we need to make it *s, this is ebcause
                    // this would be the outline
                    if (y == num) // is it the end of that row?
                    {
                        System.out.println("*"); // new line required after
                    }
                    else
                    {
                        System.out.print("*"); // no? no new line needed, as you were
                    }
                }
                else // not the first or last row...
                {
                    if (y == num) // end of the row
                    {
                        System.out.println("*"); // still requires a new line and last index
                        // of the row would be outline, therefore *.
                    }
                    else if (y == 1)
                    {
                        System.out.print("*"); // first index is outline, therefore *
                        // no new line needed
                    }
                    else
                    {
                        System.out.print("."); // if it is not the first or last index
                        // it is not the outline, and therefore it is the body
                        // fill it with full stops bois
                    }
                }

            }
        }
    }
}

