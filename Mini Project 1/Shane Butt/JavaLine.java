import java.util.regex.Matcher;
import java.util.regex.Pattern;

class JavaLine {
	private String java = "";           // Java code on line
	private String comment = "";        // The single line comment
	private String stringsRemoved = ""; // Line without strings
	private int lenJava = 0;            // The line length of just the java code
	private int block = 0;              // The block the line occurs in
	private int blockSpacing = 2;       // the amount to tab out by

	/**
	 * Constructor
	 *
	 * @param line of a java program
	 */
	public JavaLine(String line) {

		/*      Original test files
		 *      { "W:\\ProgrammingAssignments-master\\Group 1 Exercises\\1.3\\ShaneButt.java", "W:\\ProgrammingAssignments-master\\Group 2 Exercises\\2.5\\ShaneButt.java" }
		 *      { "C:\\Users\\Shane\\Documents\\aCourseworkFile\\ProgrammingAssignments-master\\Group 1 Exercises\\1.3\\ShaneButt.java", "C:\\Users\\Shane\\Documents\\aCourseworkFile\\ProgrammingAssignments-master\\Group 2 Exercises\\2.5\\ShaneButt.java" }
		 */

		line = line.trim();
		String commentsREGEX = "//(?:.*)";

		/*
			*   //          capture a set of '//'
			*   (           starts the group
			*   ?:.*        non capturing group (meaning it doesnt store the captured .*
			*   )           close the group
			*
			*   What it does in engish: Captures a single line comment (in or out of a string) and all text following it
			*/

		String stringsREGEX = "(\".*?(?<!//)\")"; // for some reason this just finds anything in a string, but it works

		/*
		   *    (           starts the group
		   *    \"          escapes the single quote - making it a literal in the pattern
		   *    .*?         captures any character zero or more times - reluctantly
		   *    (           starts the next group
		   *    ?<!//     captures "//" with a zero width negative lookbehind - this means that it:
		   *                                asserts that what immediately comes before the current position in the string
		   *                                is not "//"
		   *    )           closes the group
		   *    \"          escapes the closing quotation turning into a literal
		   *    )           closes the encasing group
		   *
		   *    In english: Captures a string that contains // (in theory) | (in reality) it captures strings
		   */

		Pattern stringsPattern = Pattern.compile(stringsREGEX);
		Matcher stringsMatcher = stringsPattern.matcher(line);

		String noStrings = line;

		if (stringsMatcher.find()) {
			int num = 0;
			do {
				if (num > stringsMatcher.groupCount()) {
					break;
				}
				noStrings = noStrings.replace(
					    stringsMatcher.group(num),
					    this.spaces( stringsMatcher.group(num).length() )
				);
				++num;
			} while (stringsMatcher.find());
		}

		Pattern commentPattern = Pattern.compile(commentsREGEX);
		Matcher commentsMatcher = commentPattern.matcher(noStrings);

		if (commentsMatcher.find()) {
			this.java = line.substring(0, commentsMatcher.start()).trim();
			this.comment = line.substring(commentsMatcher.start(), commentsMatcher.end());
		}

		if (!(commentsMatcher.find()) && !(stringsMatcher.find())) {
			java = line.trim();
		}
		this.java = this.java.replace(comment, "");
		this.stringsRemoved = noStrings;
		this.lenJava = java.length();
		commentsMatcher.reset();
		stringsMatcher.reset();
	}

	public static String spaces(int number) {
		String spaces = "";
		for (int i = 0; i < number; i++) {
			spaces += " ";
		}
		return spaces;
	}

	public int getBlockIndent() {
		return this.block;
	}

	public void setBlockIndent(int num) {
		this.block = num;
	}

	public String getJavaLine() {
		return this.java;
	}

	public int getJavaLineLength() {
		return this.lenJava;
	}

	public String returnLineWithCommentAt(int pos) {

		String formattedJava = this.returnFormattedJava(this.java); // format the java code to be tabbed to the blockWidth;
		String javaLine = this.java;
		int blockWidth = this.block;

		int numSpaces = (pos - javaLine.length());
		if (numSpaces <= 0) {
			numSpaces = 1;
		}
		String stringOfSpaces = this.spaces(numSpaces);

		String formatted = formattedJava + stringOfSpaces;
		formatted = formatted + comment;

		return formatted;
	}

	public String returnFormattedJava(String javaLine) {
		int blockWidth = this.block;
		int numSpaces = blockWidth * this.blockSpacing;
		String spaces = spaces(numSpaces);
		javaLine = spaces + javaLine;
		this.java = javaLine;
		return javaLine;
	}
}
