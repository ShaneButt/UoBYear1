/**
 * Construct a program that reads in a set of student name's, their coursework
 * and exam marks, calculate their overall mark (the average)
 * And outputs whether the student passed, hit the threshold but failed, or failed.
 *
 * @author Shane Butt - Student sb1451
 * @version 06/10/2017
 */

class Main
{
    public static void main(String args[])
    {
        String name = BIO.getString(); // read in the name
        while ( !name.equals("END") ) // Terminator value.
        {
            int Cw = BIO.getInt(); // read in coursework mark
            int Ex = BIO.getInt(); // read in exam mark
            double Mark = (double) (Cw + Ex)/2; // calculate overall mark
            
            if (Mark < 40.0) // < 40 means a failure
            {
                System.out.println(name + "["+Cw+","+Ex+"] " + Mark + " Fail"); // fail
            }
            else if (Mark >= 40.0 && !(Cw<30||Ex<30)) // if >= 40 overall, AND
                // if the neither the coursework OR exam marks are less than 30
            {
                System.out.println(name + "["+Cw+","+Ex+"] " + Mark + " Pass"); // pass
            }
            else // > 40 but either the coursework or exam mark were below 30 (so Ex=29 and Cw = 89, they attain this)
            {
                System.out.println(name + "["+Cw+","+Ex+"] " + Mark + " Fail [Threshold]"); // threshold fail
            }
	    name = BIO.getString(); // reset
        }
    }
}