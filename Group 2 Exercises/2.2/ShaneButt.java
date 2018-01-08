class Main
{
    public static void main(String args[])
    {
        String name = BIO.getString();
        while ( !name.equals("END"))
        {
            int mark = BIO.getInt();
            if (mark >= 70 && mark <= 100)
            {
                System.out.println(name + " [" + mark + "]" + " gains a 1st");
            }
            else if (mark >= 60 && mark < 70)
            {
                System.out.println(name + " [" + mark + "]" + " gains a 2.1");
            }
	    else if (mark >= 50 && mark < 60)
            {
                System.out.println(name + " [" + mark + "]" + " gains a 2.2");
            }
	     else if (mark >= 40 && mark < 50)
            {
                System.out.println(name + " [" + mark + "]" + " gains a 3rd");
            }
            else
            {
                System.out.println(name + " [" + mark + "]" + " fails");
            }
            name = BIO.getString();
        }
    }
}