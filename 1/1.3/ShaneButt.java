
/**
 * Write a description of class Main here.
 *
 * @author Shane Butt - Student sb1451
 * @version 03/10/2017
 */
public class Main
{
    public static void main(String[] args)
    {
        int Sn = BIO.getInt();
        while (Sn != 0)
        {
            int Cw = BIO.getInt();
            int Ex = BIO.getInt();
            double mark = (double) (Cw + Ex)/2;
            System.out.println("sn = " + Sn + " ex= " + Ex + " cw= " + Cw + " mark=" + mark);
            Sn = BIO.getInt();
        }
    }
}