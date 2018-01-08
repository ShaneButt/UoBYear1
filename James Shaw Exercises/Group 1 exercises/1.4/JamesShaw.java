/**
 * Input a number and then print a square of *'s that has a length and width the size of the inputted number
 *
 * @author James Shaw - Student jps60
 * @version 04/10/2017
 */
 
class Main
{
    public static void main( String args[] )
    {
        int size = BIO.getInt();
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}