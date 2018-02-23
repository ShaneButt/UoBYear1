
/**
 * Construct a program to read in sets of data and output them accordingly
 *
 * @author Shane Butt - Student sb1451
 * @version 05/10/2017
 */
public class Main
{
    public static void main(String[] args)
    {
        int Sn = BIO.getInt(); // Ask for input regarding the StudentNumber (Sn);
        while (Sn != 0) // Intialise a while loop to run until Sn is NOT equal to 0, Charon uses 0 as a terminator value.
        {
            int Cw = BIO.getInt(); // Ask for coursework mark
            int Ex = BIO.getInt(); // Ask for exam mark
            double mark = (double) (Cw + Ex)/2; // Cast the average of the previous two variables as a double
            System.out.println("sn = " + Sn + " ex= " + Ex + " cw= " + Cw + " mark=" + mark); // Output the code
            Sn = BIO.getInt(); // Reset the value of Sn so that we can process multiple StudentNumbers; runs until = 0.
        }
    }
}