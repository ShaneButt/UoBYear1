import java.util.*;

/**
 * Java indenter of // comments.
 * Indent a Java contained in a file
 */

class Program
{
  /**
   * This approach only works so far, and there will be cases when it
   * will be difficult to correctly indent all Java code constructs.
   * For example, this comment, parts of a switch statement ...
   */
  // The stored Java program
  private ArrayList<JavaLine> stored = new ArrayList<>();

  /**
   * Constructor
   */
  public Program()
  {
    stored.clear();
  }

  /**
   * Add the next line of Java code to the stored program
   * @param line A line of Java code
   */
  public void addLine( String line )
  {
    stored.add( new JavaLine( line) );
  }

  /**
   * Return the Java program as a string
   * with // comments indented vertically
   *      etc.
   * @return The Java program as a string
   */
  public String indentProgram()
  {
    String res = "";
    int ssCommentStart = findMaxJavaLineLength()+1;

    for ( JavaLine line: stored )
    {
      res += line.returnLineWithCommentAt(ssCommentStart) + "\n";
    }
    return res;
    
  }

  /**
   * Find the longest source line (Not including the // comment)
   * of Java code in the data structure stored.
   * @return the length of the longest java code line
   */
  public int findMaxJavaLineLength()
  {
    int max = 0;
    for ( JavaLine line: stored )
    {
      int lineLength = line.getJavaLineLength();
      if ( lineLength > max ) max = lineLength;
    }
    return max;
  }

}
