/**
 * Construct a program that reads in a set of student name's and marks
 * And outputs whether the student passed or failed and if they gained
 * a 1st a 2.1, 2.2, a 3rd or if they failed.
 *
 * @author Shane Butt - Student sb1451
 * @version 06/10/2017
 */

class Main
{
    public static void main(String args[])
    {
        String name = BIO.getString();
        while ( !name.equals("END")) // Terminator value.
        {
            int mark = BIO.getInt(); // read in the students mark
            if (mark >= 70 && mark <= 100) // is it in the range 70-100?
            {
                System.out.println(name + " [" + mark + "]" + " gains a 1st"); // award them a first boys
            }
            else if (mark >= 60 && mark < 70) // in the range 60-69? (< 70)
            {
                System.out.println(name + " [" + mark + "]" + " gains a 2.1"); // award them 2.1
            }
	    else if (mark >= 50 && mark < 60) // between 50-59?
            {
                System.out.println(name + " [" + mark + "]" + " gains a 2.2"); // award them 2.2
            }
	     else if (mark >= 40 && mark < 50) // between 40-49?
            {
                System.out.println(name + " [" + mark + "]" + " gains a 3rd"); // award them a 3rd
            }
            else // < 40
            {
                System.out.println(name + " [" + mark + "]" + " fails"); // unfortunately, they failed/
            }
            name = BIO.getString(); // reset the name to a different one,
            // This is done in the while loop so that it eventually terminates,
            // if this were outside the loop the loop would keep repeating,
            // this code and would NEVER end.
            // Your program would compile and liekly crash.
        }
    }
}