/*
 * Construct a program that creates a diamond using *'s and .'s;
 *
 * @author Shane Butt sb1451;
 * @version 08/10/2017;
 */
public class Main
{
    public static void main(String[] args)
    {
        int Size = BIO.getInt(); // read in the size
        int Offset = 1; // helps with maths later on
        int y = 1; // intial column value
        if (Size%2==0) // this is how you calculate if a number is even
        {
            System.out.println("Side of diamond ("+Size+") must be odd");
            return; // if that is true you must output the above and terminate
            // the methods.
        }
        if (Size < 5 || Size > 41) // the size has to be between these values
        {
            System.out.println("Side of diamond ("+Size+") must be between 5 & 41");
            return;
        }
        while (y <= Size) // in this case, the terminator is when y==Size
        {
            for (int x = 1; x <= Size; x++) // intialise our column indexes
            {
                String input = "";
                if (y==1 || y==Size) // is it the first or last row?
                {
                    if (x==(Size+1)/2) // this is how you calculate if it's the center column
                    {
                        input = "*"; // if it's first or last row and centre column
                        // we output a *
                    }
                    else // if not
                    {
                        input = "."; // it's white space and to note it we use a .
                    }
                }
                if (y != (Size+1)/2 && !(y==1 || y==Size)) // if it is NOT the middle row
                { // AND NOT the first or last
                    if ( y > ((Size+1)/2) ) // is our current row beyond the centre?
                    {
                        Offset = Math.abs( y - Size); // we must reset our offset every iteration
                        // this also helps us keep the offset in the centre if the row is beyond the centre
                    if ( (x==((Size+1)/2)+Offset) || (x==((Size+1)/2)-Offset) )
                    {
                        input = "*";
                    }
                    else
                    {
                        input = ".";
                    }
                }
                else if (y==(Size+1)/2) // Documentation for this code is coming soon!
                {
                    if (x==1 || x==Size)
                    {
                        input = "*";
                    }
                    else
                    {
                        input = ".";
                    }
                }
                if (x!=Size) // if it isnt the last in the row-index (=size means last)
                {
                    System.out.print(input); // no new line
                }
                else
                {
                    System.out.println(input); // if it is last, new line is needed.
                }
            }
            y++;
        }
    }
}