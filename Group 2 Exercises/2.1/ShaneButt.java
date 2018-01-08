class Main
{
    public static void main(String args[])
    {
        String name = BIO.getString();
        while ( !name.equals("END"))
        {
            int mark = BIO.getInt();
            if (mark >= 40)
            {
                System.out.println(name + " Pass");
            }
            else
            {
                System.out.println(name + " Fail");
            }
            name = BIO.getString();
        }
    }
}