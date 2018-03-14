/*
 * Though only adds students to 1 module
 * could be extended to add students to other modules
 */
public class Main
{
  public static void main( String args[] )
  {
    Module ci101 = new Module();

    System.out.print("#Enter student name: ");
    String name = BIO.getString();

    while ( ! name.equals( "END" ) )
    {
      System.out.print("#Enter mark  : ");
      int mark = BIO.getInt();

      Student s = new Student( name, mark );

      ci101.add( s ); // Add Student to CI101
      
      System.out.print("#Enter student name: ");
      name = BIO.getString();
    }

    System.out.println("Students passing = " + ci101.pass() );
    System.out.println("Students failing = " + ci101.fail() );
    System.out.println("Top student      = " + ci101.top() );
    System.out.printf( "Average mark     = %5.2f\n", ci101.average() );
  }
}

