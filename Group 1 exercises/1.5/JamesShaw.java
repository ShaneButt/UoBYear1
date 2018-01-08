/**
 * Draw a 'square' whose outline is all *'s and whose interior is filled with the character . (dot).
 *
 * @author James Shaw - Student jps60
 * @version 04/10/2017
 */
 
 class Main
{
     public static void main( String args[] )
     {
        int size = BIO.getInt();		//get size as input
        for (int i = 0; i < size; i++)		//first for loop used write each row
        {
            if (i == 0 || i == (size - 1))	//if the program is writing the first or last row 
		    				//size-1 because the loop says while i<size so max value is size-1
            {
                for (int j = 0; j < size; j++)	//loop used for the columns of the first and last rows
                {
                    System.out.print("*");	//write *s
                }
            }
            else				//if not the first or last row
            {
                System.out.print("*");		//print 1 *
                for(int k = 2; k < size; k++)	//loop used to fill in the gap between the first and last column
						//note that the range of values in the for loop starts at 2 instead of 0, but still finishes at size-1. This will run the loop 2 less times
                {
                    System.out.print(".");	//write .s
                }
                System.out.print("*");		//print the end *
            }
            System.out.println("");		//new line
        }
     }
}
