/**
 * Construct a program that reads in a set of student name's and marks
 * And outputs whether the student passed or failed.
 *
 * @author Shane Butt - Student sb1451
 * @version 06/10/2017
 */

class Main
{
    public static void main(String args[])
    {
        String name = BIO.getString();
        while ( !name.equals("END")) // "END" is the terminator, we use ! to represent "not"
        // "name" a string inherits the method .equals(String s) which
        //  checks if the string is the exact same as the string inside
        // the parentheses
        {
            int mark = BIO.getInt(); // read the students mark
            if (mark >= 40) // this is the passing boundary, anything
                // greater than or equal to this value is a pass
            {
                System.out.println(name + " Pass"); // the student passes!
            }
            else
            {
                System.out.println(name + " Fail"); // student fails!
            }
            name = BIO.getString(); // reset the student name
        }
    }
}