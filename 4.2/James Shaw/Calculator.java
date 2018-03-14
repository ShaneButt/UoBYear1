public class Calculator
{
  // Declaration of a long variable to hold the stored result
  private long theResult = 0;
  String result;
  // Evaluate an arithmetic operation on the stored result
  //  E.g evaluate( '+', 9) would add 9 to the stored result
  //      evaluate( '/', 3) would divide the stored result by 3
  //      actions are '+'. '-', '*', '/'
  // Note: if the operation is
  //      evaluate( '/', 0 ) the theResult returned must be 0
  //      (Not mathematically correct)
  //      You will need to do a special check to ensure this
  /**
   * perform the operation 
   *  theResult = theResult 'action' number
   * @param action An arithmetic operation + - * /
   * @param number A whole number
   */
  public void evaluate( char action, long number )
  {
    // Fill in code for the method
    
    theResult = math(theResult, number, action) ;			// Run theResult, number and action through the math function
  }
  
  public long math(long num1, long num2, char symbol)
    {
        if (symbol == '/' && num2 == 0)						// If the symbol is divide and number 2 is 0
        {
            return 0;										// Return 0 as you cannot divide by 0
        }
        else
        {
            switch(symbol)									// I used a switch statement to check the symbol
            {
                case '+':									// If symbol is +
                    return num1 + num2;						// Add the two numbers
                case '-':									// If symbol is -
                    return num1 - num2;						// Take away number 2 from number 1
                case '*':									// If symbol is *
                    return num1 * num2;						// Multiply the numbers
                case '/':									// If symbol is /
                    return num1 / num2;						// Divide number 1 by number 2
                default:									// If symbol is none of these
                    return 0;								// Return 0
            }
        }
    }

  /**
   * Return the long calculated value
   * @return The calculated value
   */
  public long getValue()
  {
    // Fill in code for the method
    return theResult;										// Return the result
  }

  /**
   * Set the stored result to be number
   * @param number to set result to.
   */
  public void setValue( long number )
  {
    // Fill in code for the method
    theResult = number;										// Sets the value of theResult to the number passed through this function
  }

  /**
   * Set the stored result to be 0
   */
  public void reset()
  {
    // Fill in code for the method
    theResult = 0;											// Reset theResult to 0
  }

}
