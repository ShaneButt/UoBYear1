
/**
 * Construct a program to output a square of stars
 *
 * @author Shane Butt - Student sb1451
 * @version 05/10/2017
 */
public class Main
{
    public static void main(String[] args)
    {
        int num = BIO.getInt(); // this is the width and length of the square (squares have equal length and width!);
        for (int y = 1; y <= num; y++) // Here we intialise a for loop for our x-axis (going top-bottom) / the columns;
        {
            for (int x = 1; x <= num; x++) // Here we intialise a for loop for our x-axis (going left-right) / the row;
            {
                // Both for loops start at index 1, and run until both indexes reach the value of 'num';
                if (x == num) // Here we check to see if the index we are at is the last of the row
                    // we do this so that we can create a new line after it
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