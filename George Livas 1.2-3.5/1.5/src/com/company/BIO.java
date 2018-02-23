package com.company;// File [BIO_java.html] MAS - last created: Fri 28 Apr 2017 21:40:25 BST

import java.io.IOException;

/*
 *  To use in a BlueJ project
 *  Create a class called com.company.BIO
 *   containing the contents of this file
 */
public class BIO
{
    private static final int EOF  = -1;            // EOF
    private static final int NONE = -2;            // No Next Char read
    private static int  haveNextChar  = NONE;      // Initial state
    private static boolean eofDetected = false;    // Not seen EOF yet

    private static int getCharX()
    {
        try                                          // Deal with failure
        {
            int c = System.in.read();                  // Read next char
            if ( c == '\r' )                           // Remove '\r'
                return getCharX();
            return c;                                  // Return
        }
        catch( IOException exp )                     // Problem
        {
            System.out.println();                      // So say what is
            System.out.println("**** Error ****\n" +
                    exp.getMessage() + "\n" +
                    "Detected on input -- EXIT ****" );
            System.exit(-1);                           // Exit **
        }
        return EOF;                                  // Compiler requires
    }

    private static int getChar()
    {
        int ch;                                      // char
        if ( eofDetected )                           // Check
        {                                            // Reading past EOF
            System.out.println();                      // So error message
            System.out.println("**** END OF FILE " +
                    "detected on input -- EXIT ****" );
            System.exit(-1);                           // and exit
        }
        if ( haveNextChar == NONE )                  // No peek char
        {
            ch = getCharX();                           // So read next char
        } else {
            ch = haveNextChar;                         // Have peek char
            haveNextChar = NONE;                       // So return this char
        }
        if ( ch == EOF )
            eofDetected = true;                         // User read EOF
        return ch;                                   // Return next char
    }

    /**
     * Return true if have reached EOF
     * @return true if End Of File/Input
     */
    public static boolean eof()                    // Is EOF
    {
        if ( haveNextChar == NONE )                  // No peek char
        {
            haveNextChar = getCharX();                 // get next char
        }
        return haveNextChar == EOF;                  // Is EOF
    }

    private static String getLineBASE()
    {
        String line = "";                            // Line read
        int ch = getChar();                          // Read ch

        while( ch != '\n' )                          // Read loop
        {
            if ( ch == EOF )
            {
                return line;                             //  exit
            }
            line = line + (char) ch;                 //  form line
            ch = getChar();                            //  next ch
        }
        return line;                                 // return line
    }

    private static String getLine()
    {
        String line = getLineBASE();                 // Read line
        //System.out.println( line );
        return line;
    }

    /**
     * Return the next input line as a String
     * @return the next line of input
     */
    public static String getString()
    {
        String line = getLine();                     // Read line
        return line;
    }

    /**
     * return as a double the number on the next input line.
     * If malformed return 0.0
     * @return the next number read as a double
     */
    public static double getDouble()
    {
        String res = getLine();                      // Read line
        double value = 0.0;                          //
        try
        {
            value = Double.parseDouble( res.trim() );  // Convert
        }
        catch ( NumberFormatException ex )           // Problem
        {                                            //  ignore
        }
        return value;                                // return
    }

    /**
     * return as an int the number on the next input line.
     * If malformed return 0
     * @return the next number read as an int
     */
    public static int getInt()
    {
        String res = getLine();                      // Read line
        int value = 0;                               //
        try
        {
            value = Integer.parseInt( res.trim() );    // Convert
        }
        catch ( NumberFormatException ex )           // Problem
        {                                            //  ignore
        }
        return value;                                // return
    }

}