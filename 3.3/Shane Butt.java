class Main extends BIO
{
    public static String checkAscending(String line)
    {
        String str = "not in ascending order";
        for(int index = 0; index < line.length()-1; index++)
        {
            if(line.charAt(index) > line.charAt(index+1))
            {
                str = "not in ascending order";
                break;
            }   
            else
            {
                str = "in ascending order";
            }
        }
        return str;
    }
    
    public static void main(String[] args)
    {
        String line = BIO.getString();
        line = line.trim();
        while (!line.equals("END"))
        {
           System.out.printf("%s\tletters %s", line, checkAscending(line.toLowerCase()));
           line = BIO.getString();
        }
    }
}