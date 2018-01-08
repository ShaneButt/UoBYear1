/**
 * Write an a Java application which prints a diamond in a square grid of dots whose side length is input to the application.
 *
 * @author James Shaw - Student jps60
 * @version 04/10/2017
 */
 
class Main
{
	public static void main( String args[] )
	{
		int size = BIO.getInt();
		if (!(size % 2 == 0) && size >= 5 && size <= 41)
		{
			for (int i = 0; i < size; i++)
			{
				if (i == 0 || i == (size-1))
				{
					for (int j = 0; j < size; j++)
					{
						if (j == (size/2))
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(".");
						}
					}
				}
				else
				{
					for (int k = 0; k < Math.abs((size/2)-(i)); k++)
					{
						System.out.print(".");
					}
					System.out.print("*");
					for (int k = 0; k < (2*(size/2-(Math.abs((size/2)-(i))+1))+1); k++)
					{
						System.out.print(".");
					}
					System.out.print("*");
					for (int k = 0; k < Math.abs((size/2)-(i)); k++)
					{
						System.out.print(".");
					}
				}
				System.out.println("");
			}
		}
		else if (size < 5 || size > 41)
		{
			System.out.print("Side of diamond ("+size+") must be between 5 & 41");
		}
		else 
		{
			System.out.print("Side of diamond ("+size+") must be odd");
		}
	}	
}
