/**
 * Eli Murray - ejdm11
 * Cheekily stolen from James Shaw
 */

public class Main
{
    public static void main( String args[] )
    {
        System.out.print("#Width: ");
        int width = BIO.getInt();
        System.out.print("#Line: ");
        String line = BIO.getString().trim();
        while (!line.equals("END"))
        {
            String processed = reformat(line,width);
            processed = processed.replace(' ','.');
            System.out.println(processed);
            
            System.out.print("#Enter line of text: ");
            line = BIO.getString().trim();
        }
    }
    public static int countSpaces(String str)
    {
        int spaces = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ')
            {
                spaces++;
            }
        }
        return spaces;
    }
    public static String stringOfSpaces (int num)
    {
        String spaces = "";
        for (int k = 0; k < num; k++)
        {
            spaces = spaces + " ";
        }
        return spaces;
    }
    public static String anExtraSpace(int extra)
    {
        if(extra > 0)
        {
            return(" ");
        }
        else
        {
            return("");
        }
    }
    public static String reformat (String Line, int width)
    {
        String spacesStr;
        int spaces = 0;
        int numSpaces = 0;
        int extra = 0;
        spaces = countSpaces (Line);
        if (spaces == 0)
        {
            numSpaces = width - Line.length();
            spacesStr = stringOfSpaces(numSpaces);
            Line = Line + spacesStr;
        }
        else
        {
            numSpaces = (width - Line.length())/spaces + 1;
            spacesStr = stringOfSpaces(numSpaces);
            Line = Line.replace(" ",spacesStr);
            extra = width - Line.length();
            for (int i = 0; i < Line.length(); i++)
            {
                if (Line.charAt(i) == ' ' && Line.charAt(i-1) != ' ')
                {
                    Line= Line.substring(0,i) + anExtraSpace(extra) + Line.substring(i);
                    extra--;
                }
            }
        }
        
        
        return Line;
    }
}
