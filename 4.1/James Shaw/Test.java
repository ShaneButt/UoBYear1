public class Test
{
  private static int fail = 0;
  private static String test = "";

  private static final int MAX = 5;

  public static void main( String args[] )
  {
    Counter count = new Counter();

    setTest("Created new instance of a Counter");

    assertTrue( count.getValue() == 0,
                "getValue() returns " + count.getValue() );

    setTest("Test inc()");

    for ( int i=1; i<=MAX; i++)
    {
      count.inc();
      assertTrue( count.getValue() == i,
                  "Should be " + i + " is " + count.getValue() );
    }

    setTest("Test dec()");
    for( int i=MAX; i>=1; i-- )
    {
      assertTrue( count.getValue() == i,
                  "Should be " + i + " is " + count.getValue() );
      count.dec();
    }

    setTest("Test inc()");
    count.inc();
    assertTrue( count.getValue() == 1,
               "Should be 1 is " + count.getValue() );

    setTest("Test reset()");
    count.reset();
    assertTrue( count.getValue() == 0,
               "Should be 0 is " + count.getValue() );

    count.reset();

    setTest("Test add5()");

    for ( int i=1; i<=MAX; i++)
    {
      count.add5();
      assertTrue( count.getValue() == i*5,
                  "Should be " + i*5 + " is " + count.getValue() );
    }

    count.reset();

    setTest("Test add10()");

    for ( int i=1; i<=MAX; i++)
    {
      count.add10();
      assertTrue( count.getValue() == i*10,
                  "Should be " + i*10 + " is " + count.getValue() );
    }


    result();

  }

  /*
   * Used to help in reporting errors
   */

  public static void setTest( String message )
  {
   test = message;
  }

  public static void assertTrue( boolean cond, String message )
  {
    if ( ! cond )
    {
       System.out.println("FAILURE: "  + test + " - " +  message );
       fail++;
    }
  }

  public static void result()
  {
    if ( fail == 0 )
    {
      System.out.println("Success");
    } else {
      System.out.printf("Failure - %d tests failed\n", fail );
    }
  }

}
