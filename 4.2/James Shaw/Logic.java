public class Logic
{
  private enum  State { FIRST_NUMBER, SUBSEQUENT_NUMBER };
  private State state = State.FIRST_NUMBER;
  private long  number = 0;
  private char  opLast = ' ';
  private Calculator calc = null;
 
  
  public Logic( Calculator calculator )
  {
    calc = calculator;
  }
 
  public String process( String button )
  {
    String info = null;
    switch ( button )
    {
      case "1" : case "2" : case "3" : case "4" : case "5" :
      case "6" : case "7" : case "8" : case "9" : case "0" :
        // Maps 1st char '0' -> 0 '1' -> 1 etc.
        int digit = button.charAt(0)-'0';
        number = number * 10 + digit;       // Build number
        break;
      case "C" :
        number = 0;
        break;
      case "=" :
      case "+" : case "-" : case "*" : case "/" :
        char op = button.charAt(0);
        switch ( state )
        {
          case FIRST_NUMBER:
            calc.setValue( number );
            state = State.SUBSEQUENT_NUMBER;
            break;
          case SUBSEQUENT_NUMBER:
            if ( opLast != '=' )
              calc.evaluate( opLast, number );
            break;
        }
        opLast = op;  number = 0;
        break;
      case "CR" :
        calc.reset(); number = 0; 
        state = State.FIRST_NUMBER;
        break;
    }
    return info;
  }

  public long getResult()
  {
    return calc.getValue();
  }
 
  public long getNumber()
  {
    return number;
  }
}
