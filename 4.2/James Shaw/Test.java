public class Test
{
  private static int fail = 0;
  private static String test = "";

  public static void main( String args[] )
  {
    Calculator calc = new Calculator();

    setTest("Created new instance of a Calculator");

    assertTrue( calc.getValue() == 0,
               "getValue() returns " + calc.getValue() );

    setTest("Test setValue() & getValue()");

    long values[] = { 10, 20, 30, 99, -10, -60, 0 };
    for ( long val : values )
    {
      calc.setValue( val );

      assertTrue( calc.getValue() == val,
                  "setValue(" + val + ")  returns " +
                   calc.getValue() );
    }


    long data[][] = {
                     { 1,  '+',  2,  3 },
                     { 9,  '+',  8, 17 },
                     { 2,  '*',  3,  6 },
                     { 9,  '*',  6, 54 },
                     { 5,  '-',  2,  3 },
                     {99,  '-',  7,  92},
                     { 6,  '/',  2,  3 },
                     {-9,  '+',  5, -4 },
                     {-3,  '*',  3, -9 },
                     { 3,  '-',  4, -1 },
                     {-9,  '/',  3, -3 },
                     { 9,  '/', -3, -3 },
                     { 0,  '/',  7,  0 },
                     { 3,  '/',  0,  0 },
                     { 0,  '/',  0,  0 },
                     {9999999999L, '+', 0, 9999999999L }
                   };

    setTest("Test methods: setValue(), evaluate(), getValue()");
    for ( long[] calculation : data )
    {
      long arg1    = calculation[0];
      char op      = (char) calculation[1];
      long arg2    = calculation[2];
      long expect  = calculation[3];

      calc.setValue( arg1 );
      calc.evaluate(  op, arg2 );
      long actual   = calc.getValue();
      assertTrue( actual == expect,
                  String.format("\n         x.setValue(%d);" +
                                " x.evaluate('%c',%d); " +
                                "res = x.getValue();" +
                                "\n         res = %d should be %d",
                  arg1, op, arg2, actual, expect ) );
    }

    result();

  }

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
