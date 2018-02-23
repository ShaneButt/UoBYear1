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
		int size = BIO.getInt();									//get size as input
		if (!(size % 2 == 0) && size >= 5 && size <= 41)						//if size is an odd number, is greater than or equal to 5 AND is less than or equal to 41
		{
			for (int i = 0; i < size; i++)								//used to write each row - for all values between and including 0 and size-1
			{
				if (i == 0 || i == (size-1))							//if on the first or last line
				{
					for (int j = 0; j < size; j++)						//used to print the collumns
					{
						if (j == (size/2))						//if we are in the middle
						{
							System.out.print("*");					//print a *
						}
						else								//if we are not in the middle
						{
							System.out.print(".");					//print a .
						}
					}
				}
				else										//if not on the first or last line
				{
					for (int k = 0; k < Math.abs((size/2)-(i)); k++)			//for all values from 0 to half of the size minus whatever number line we are on
														//Math.abs() changes negative numbers to positive numbers so that when you get past the middle,the numbers start going up again    
					{
						System.out.print(".");						//print a . (outside the diamond)
					}
					System.out.print("*");							//print a * (The side of the diamond)
					for (int k = 0; k < (2*(size/2-(Math.abs((size/2)-(i))+1))+1); k++)	/*for all values between the stars. Prepare for some maths. going from the middle brackets outwards:
														 *size/2 - i + 1 --> takes off all the dots youve just printed, plus the first *
														 *size/2 - the bit above --> we are working in halfs at the moment, so you want half of the diamond minus the first bit
														 *multiply the whole lot by 2 so that you are basically taking both sides away
														 *add one at the end to account for the central column (because we are using odd numbers)
														 *This gives you the number of columns inside of the diamond for each row.
														 */
					{
						System.out.print(".");						//print a . (inside the diamond)
					}
					System.out.print("*");							//print a * (the other side of the diamond)
					for (int k = 0; k < Math.abs((size/2)-(i)); k++)			//same for loop as before, to work out the padding on the other side of the diamons
					{
						System.out.print(".");						//print a . (outside of the diamond)
					}
				}
				System.out.println("");								//new line
			}
		}
		else if (size < 5 || size > 41)									//if the input is less than 5 OR greater than 41
		{
			System.out.print("Side of diamond ("+size+") must be between 5 & 41");			//give a warning that says that the size must be between 5 & 41
		}
		else 												//if size is within the min and max values but is an even number
		{
			System.out.print("Side of diamond ("+size+") must be odd");				//give a warning that says that the size must be an odd number
		}
	}	
}
