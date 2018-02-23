import java.lang.Object;

class Main extends BIO
{
    
    public static void main(String[] args)
    {
        System.out.println("#Width: ");
        int width = BIO.getInt();
        System.out.println("#Line: ");
        String line = BIO.getString();
        
        while (!line.equals("END"))
        {
            String processed = reformat(line, width);
            processed = processed.replace(" ", ".");
            System.out.println(processed);
            line = BIO.getString();
        }
    }
       
    public static int spaces(String line)
    {
        return (line.length() - line.replace(" ", "").length());
    }
    
    public static String stringOfSpaces(int num)
    {
        String spaces = "";
        for (int i = 1; i <= num; i++)
        {
            spaces = spaces + " ";
        }
        return spaces;
    }
    
    public static String extraSpace(int extra)
    {
        if (extra > 0) { return " "; } else { return ""; }
    }
    
    public static int[] findSpaces(int numSpaces, String str)
    {
        int[] arr = new int[numSpaces];
        int length = str.length();
        int index = 0;
        for (int i = 0; i < length; i++)
        {
            if (str.charAt(i) == ' ')
            {
                arr[index] = i;
                ++index;
            }
        }
        return arr;
    }
    
    public static String reformat(String originalLine, int width)
    {
       String formatted = originalLine;
       int numGaps = spaces(originalLine);
       int numSpaces = width - originalLine.replace(" ", "").length();
       if (numGaps==0){return originalLine + stringOfSpaces(width-originalLine.length());}
       else
       {
           double dist = (double) numSpaces / numGaps;
           System.out.println("#" + dist);
           int distributed = (int) Math.floor(dist);
           System.out.println("#" + distributed);
           int extraSpaces = numSpaces%numGaps;
           System.out.println("#" + extraSpaces);
           int[] spaceLocations = findSpaces(numGaps, originalLine);
       
           formatted = formatted.replace(" ", stringOfSpaces(distributed));
           
           StringBuffer str = new StringBuffer(formatted);
           
           for(int i = 0; i < spaceLocations.length; i++)
           {
               str.insert(spaceLocations[i] + i, extraSpace(extraSpaces));
               extraSpaces--;
           }
           return str.toString();
       }
    }
       
}