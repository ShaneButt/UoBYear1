/**
 * Write an application to read a series of data items representing students performance in a module. The output is the individual students result in the module.
 *
 * @author James Shaw - Student jps60
 * @version 04/10/2017
 */
 
 class Main
{
    public static void main( String args[] )
    {
        String name = BIO.getString();
        int mark = 0;
        String result = "";
        while (!"END".equals(name))
        {
            mark = BIO.getInt();
            if (mark >= 40)
            {
                result = " Pass";
            }
            else
            {
                result = " Fail";
            }
            System.out.print(name + result);
            name = BIO.getString();
        }
    }
}