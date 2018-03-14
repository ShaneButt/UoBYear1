public class Counter
{
  // Declaration of a long instance variable to hold
  //  the value of the counter
  long value = 0;
  // You need to declare this instance variable here.
  //  What should it initial value be.

  /**
   * Return the current value of the counter
   * @return The value of the counter
   */
  public long getValue()
  {
    // Fill in code for the method
    return value;						// Returns the contents of value
  }

  /**
   * Reset the counter to zero
   */
  public void reset()
  {
    // Fill in code for the method
    value = 0;							// Resets the variable value to 0
  }

  /**
   * Add 1 to the counter
   */
  public void inc()
  {
    // Fill in code for the method
    value++;							// Increases the value of value by 1
  }

  /**
   * Subtract 1 from the counter
   */
  public void dec()
  {
    // Fill in code for the method
    value--;							// Decreases the value of value by 1
  }

  /**
   * Add 5 to the counter
   */
  public void add5()
  {
    // Fill in code for the method
    value += 5;							// Adds 5 to value
  }

  /**
   * Add 10 to the counter
   */
  public void add10()
  {
    // Fill in code for the method
    value += 10;						// Adds 10 to value
  }

}
