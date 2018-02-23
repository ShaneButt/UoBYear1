import java.util.*;
import java.io.*;
import java.nio.file.*;


class Main
{
  /*
   * The approach used for indenting has limitations.
   * For example: 
   *  This comment is multi line.
   *  A switch statement has several components.
   */

  /**
   * @param args Files to be indented
   */
  public static void main( String args[] )
  {
    for ( String fileName: args )
    {
      Program aProgram = new Program();              // New stored program
      Path file = Paths.get( fileName );             // Read from file
      try
      {
        InputStream in = Files.newInputStream(file);
        BufferedReader reader =
           new BufferedReader(new InputStreamReader(in));
        String line = null;
        while ( (line = reader.readLine() ) != null )
        {
          aProgram.addLine( line );                 // Add line
        }
      } catch (IOException e) 
      {
        System.out.printf( "Error with file: %s\n%s: %s\n",
                            fileName, 
                            e.getClass().getSimpleName(),
                            e.getMessage() );
      }
      String res = aProgram.indentProgram();       // Indent program
      System.out.print( res );                     // Print result
    }
  }

}
