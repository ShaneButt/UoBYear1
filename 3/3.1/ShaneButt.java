class Main
{
    private static int readSpacesInLine(String line)
    {
        return line.length() - line.replaceAll(" ", "").length();
    }
    
    public static void main(String[] args)
    {
        String line = BIO.getString();
        while (!line.contains("END"))
        {
            int numSpaces = readSpacesInLine(line);
            System.out.printf("[%-1d] spaces in \"%s\"\n", numSpaces, line);
            line = BIO.getString();
        }
    }
}