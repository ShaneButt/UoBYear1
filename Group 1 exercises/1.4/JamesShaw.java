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
        int size = BIO.getInt();            //get size as input
        for (int i = 0; i < size; i++)      //first loop used for the 'rows' - each iteration of the loop is a different row
        {
            for (int j = 0; j < size; j++)  //second loop used for the 'columns' - each iteration of the loop is a different column
            {
                System.out.print("*");      //prints a * once for each 'column' within each 'row'
            }
            System.out.println("");         //puts a new line at the end of each column - equivalent of pressing enter
        }
    }
}
