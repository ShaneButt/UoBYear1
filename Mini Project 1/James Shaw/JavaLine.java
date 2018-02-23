/**
 * Stores a line of a Java program for later analysis
 */
class JavaLine
{
  private String java    = ""; 						// Java code on line
  private String comment = ""; 						// The single line comment
  private int lenJava = 0;     						// The line length of just the java code
  private int quotes = 0;							// The number of quotation marks on a line
  public static int level;							/* The level of the code
													 eg code level 1
													 {
														level 2
														{
															level 3
														}
													 }
													*/
  public String tab = "";							// The number of spaces in the tabbing

  /**
   * Constructor
   * @param line of a java program
   */
  public JavaLine( String line )
  {
    line = line.trim();								// Gets rid of any WhiteSpace at the beginning or end of the line
    
    for (int i = 0; i < line.length(); i++)			// Loops through every character on the line
    {
        if (line.charAt(i) == '"')					// If the character being checked is "
        {
            quotes++;								// Increase quotes by 1
        }
        
		else if (line.charAt(i) == '}' && i == 0)	// If the character being checked is } and it is the first character of the line
        {
            level--;								// Decrease level by 1
        }
        else if (line.charAt(i) == '/' && line.charAt(i+1) == '/' && quotes % 2 == 0)	// If the character being checked is / and the next character is / and there are an even number of quote marks
        {
            java = line.substring(0,i);				// Set the variable Java to everything on the line before the character being checked
            comment = line.substring(i);			// Set the variable Comment to everything on the line from the character being checked onwards
        }
    }
    if(java.equals("") && comment.equals(""))		// If Java and Comment have not been set e.g a line with no comment
    {
        java = line;								// Set Java to whatever is on the line
    }
    for (int i = 0; i < level; i++)					// For each level
    {
        tab += "  ";								// Increase the size of the tab by 2 spaces
    }
    for (int i = 0; i < line.length(); i++)			// Loops through every character on the line
    {
        if (line.charAt(i) == '{')					// If character is {
        {
            level++;								/* Increase level by 1
													Changing level here stops the program from tabbing too early
													eg.
													function ()
													{
														
													}
													instead of 
													function()
														{
														
													}
													*/
        }
        else if (line.charAt(i) == '}' && i != 0)	// If chatacter is } and its not at the beginning of the line
        {
            level--;								/* Decrease level by 1
													ensures that the level will not be decreased if the function is on a single line
													eg.
													function () { }
													*/
        }
    }
    java = tab + java;								// Puts the tabbing onto the beginning of the java string
    lenJava = java.length();						// Calculates the length of the Java string
  }


  /**
   * Return the length of the Java part of the stored line.<PRE>
   * JavaLine j = new JavaLine("int a; // Declaration");
   * int jp = j.getJavaLineLength();
   * Would set jp the be 6</PRE>
   * @return The length of the Java code in the line
   */
  public int getJavaLineLength()
  {
      return lenJava;								// Returns the length of the Java string
  }

  /**
   * Return as an 'indented' line with the // comment
   * starting at column pos<PRE>
   * JavaLine j = new JavaLine("int a; // Declaration");
   * String res = j.returnLineWithCommentAt(10);
   * Would set res to be the following string:
   * int a;   // Declaration</PRE>
   * @param pos Start // comment at pos
   * @return A new version of the line with any // comment
   * starting at column pos.
   */
  public String returnLineWithCommentAt(int pos)
  {
      String spaces = spaces (pos - java.length());	// Calculates how many spaces are needed by taking away the length of the Java string from the position the comment needs to start
      java = java + spaces  + comment;				// Adds the spaces and the comment to the end of the Java variable
      return java;									// Returns the Java variable, complete with spaces and comment.
  }

  /**
   * Return a string of 'number' spaces.
   * @param number of spaces required
   * @return A string of 'number' spaces
   */
  public static String spaces( int number )
  {
      String spaces = "";      						// Initialize an empty string called spaces
      for (int i = 0; i < number; i++)				// Loops through number amount of times
      {
          spaces += " ";							// Add a space to the end of the spaces variable
      }
      return spaces;								// Return the spaces variable
  }
}
