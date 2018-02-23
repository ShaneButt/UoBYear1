/**
 * Read in a line length, and then reformat the lines so that the output lines of text have straight left and right margins.
 *
 * @author James Shaw - Student jps60
 * @version 23/10/2017
 */
 
class Main
{
    public static void main( String args[] )
    {
        System.out.print("#Enter width: ");
        int width = BIO.getInt();				//get width as input
        System.out.print("#Enter line of text: ");
        String line = BIO.getString().trim();			//get the line from the user and take off any whitespace at the beginning and end
	    
        while (!line.equals("END"))				//while line does not equal "END"
        {
            String processed = reformat(line,width);		//run the function called reformat which is defined bellow, and put that in the variable processed
            processed = processed.replace(' ','.');		//replace all spaces with dots
            System.out.println(processed);			//print out the result
            
            System.out.print("#Enter line of text: ");		//user prompt
            line = BIO.getString().trim();			//get the line from the user and take off any whitespace at the beginning and end
        }
    }
	
    public static int countSpaces(String str)			//defining the function countSpaces which has a string as an input
    {
        int spaces = 0;						//set spaces to 0
        for (int i = 0; i < str.length(); i++)			//for all values between 0 and the string length -1
        {
            if (str.charAt(i) == ' ')				//if the character at position i is a space
            {
                spaces++;					//increment spaces by 1
            }
        }
        return spaces;						//return spaces as the result of this function
    }
	
    public static String stringOfSpaces (int num)		//defining the function stringOfSpaces which has an integer as an input
    {
        String spaces = "";					//set spaces to blank
        for (int k = 0; k < num; k++)				//for all values from 0 to num -1
        {
            spaces += " ";					//add a space to the end of the string of spaces
        }
        return spaces;						//return the string of spaces as the result of this function
    }
	
    public static String anExtraSpace(int extra)		//defining the function anExtraSpace which has an integer as an input
    {
        if(extra > 0)						//if extra is greater than 0
        {
            return(" ");					//return a single space as the result of this function
        }
        else							//if extra is not greater than 0
        {
            return("");						//return nothing as the result of this function
        }
    }
	
    public static String reformat (String Line, int width)	//defining the function reformat which has a string and an integer as an input
    {
        String lineTemp;
        String finalLine = "";
        String spacesStr;
        int spaces = 0;
        int numSpaces = 0;
        int lineStart = 0;
        int extra = 0;						//set up variables
        spaces = countSpaces (Line);				//use the countSpaces to find how many spaces are within the given line
	    
        if (spaces == 0)					//if there are no spaces
        {
            numSpaces = width - Line.length();			//set numspaces to the rest of the space on the line
            spacesStr = stringOfSpaces(numSpaces);		//get the string of spaces using the number just calculated
            Line = Line + spacesStr;				//put the extra spaces at the end of the line
        }
        else							//if there are 1 or more spaces
        {
            numSpaces = (width - Line.length())/spaces + 1;	//do some maths --> the width you want your line to be minus the length of the line, then divided by the number of spaces + 1.
								//This tells you how much space there should be between each word
            spacesStr = stringOfSpaces(numSpaces);		//get a string with the correct amount of spaces to go between each word
            Line = Line.replace(" ",spacesStr);			//replace the spaces with the string 
            extra = width - Line.length();			//calculate if you need any more spaces
            for (int i = 0; i < Line.length(); i++)		//for all values from 0 to line length -1
            {
                if (Line.charAt(i) == ' ' && Line.charAt(i-1) != ' ')	//if you have a space at position i and the character before it is not a space
                {
                    Line= Line.substring(0,i) + anExtraSpace(extra) + Line.substring(i);	//put an extra space in if needed -> remember is extra is less than 1, then anExtraSpace(extra) will return nothing
                    extra--;					//decrement extra by 1
                }
            }
        }
        return Line;						//return line as the result of this function
    }
}
