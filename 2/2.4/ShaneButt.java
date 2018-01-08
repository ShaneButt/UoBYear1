
/**
 * Write a description of class Main here.
 *
 * @author Shane Butt sb1451
 * @version 06/10/2017
 */
public class Main
{
    public static void main(String[] args)
    {
        int Size = BIO.getInt();
        int Offset = 1;
        int y = 1;
        if (Size%2==0)
        {
            System.out.println("Side of diamond ("+Size+") must be odd");
            return;
        }
        if (Size < 5 || Size > 41)
        {
            System.out.println("Side of diamond ("+Size+") must be between 5 & 41");
            return;
        }
        while (y <= Size)
        {
            for (int x = 1; x <= Size; x++)
            {
                String input = "";
                if (y==1 || y==Size)
                {
                    if (x==(Size+1)/2)
                    {
                        input = "*";
                    }
                    else
                    {
                        input = ".";
                    }
                }
                if (y != (Size+1)/2 && !(y==1 || y==Size))
                {
                    if ( y > ((Size+1)/2) )
                    {
                        Offset = Math.abs( y - Size);
                    }
		   else
		   {
			Offset = y-1;
		   }
                    if ( (x==((Size+1)/2)+Offset) || (x==((Size+1)/2)-Offset) )
                    {
                        input = "*";
                    }
                    else
                    {
                        input = ".";
                    }
                }
                else if (y==(Size+1)/2)
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
                if (x!=Size)
                {
                    System.out.print(input);
                }
                else
                {
                    System.out.println(input);
                }
            }
            y++;
        }
    }
}