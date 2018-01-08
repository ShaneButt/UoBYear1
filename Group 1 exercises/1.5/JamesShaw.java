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
        int size = BIO.getInt();
        for (int i = 0; i < size; i++)
        {
            if (i == 0 || i == (size - 1))
            {
                for (int j = 0; j < size; j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("*");
                for(int k = 2; k < size; k++)
                {
                    System.out.print(".");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
     }
}