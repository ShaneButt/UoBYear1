public class Student
{
  private String name;
  private int mark;

  /**
   * Construct a student
   * @param aName Name of student
   * @param aMark The students mark
   */
  public Student( String aName, int aMark )
  {
    name = aName; mark = aMark;
  }

  /**
   * Return the students name
   * @return The students name
   */
  public String getName()
  {
     return name;
  }

  /**
   * Return the students mark
   * @return The students mark 0 .. 100
   */
  public int getMark()
  {
    return mark;
  }
}

