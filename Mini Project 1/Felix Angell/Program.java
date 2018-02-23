import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Program {

    private ArrayList<Line> lines = new ArrayList<>();

    int[] indentationTable;

    int longestLineIndex = 0;

    // tab size in spaces.
    private int tabSize = 2;

    // the ascii value for a single quote
    // this is a hack-y way to fix self indentation of this program
    // this is because if i were to do '\'' i would have to handle
    // escape sequences properly!
    private static final int SINGLE_QUOTE_ASCII = 39;

    private static boolean debug = false;

    public Program() {}

    // adds a line to the program
    // an important note here is that we work out
    // which is the longest line as we go rather
    // than going over line by line again which might
    // be a bit slower.
    public void addLine(Line line) {
        lines.add(line);
    }

    private String newEmptyString(int len) {
        if (len <= 0) {
            return "";
        }
        return new String(new char[len]).replace('\0', ' ');
    }

    private void calculateIndentation() {
        int indentation = 0;

        // faster to use a fixed size array
        indentationTable = new int[lines.size()];

        for (int i = 0; i < lines.size(); i++) {
            Line line = lines.get(i);

            // create a char parser for the code
            // sample only.
            CharacterParser codeParser = new CharacterParser(line.code);

            // this is for keeping track of quotes
            // and characters so that we dont mistake
            // "{" or '{' for indentation
            ArrayDeque<Character> strings = new ArrayDeque<>();
            ArrayDeque<Character> chars = new ArrayDeque<>();

            boolean insideCase = false;

            int switchIndentLevel = 0;
            boolean insideSwitch = false;

            indentationTable[i] = indentation;

            while (codeParser.hasNext()) {
                char curr = codeParser.consume();
                switch (curr) {
                    case '"': {
                        // this is because if we have
                        // a quote inside of a character it
                        // will never close... bit hacky in a way!
                        if (!chars.isEmpty()) {
                            break;
                        }

                        // strings dont nest easily so if the stack isnt
                        // empty then
                        if (!strings.isEmpty()) {
                            strings.pop();
                        } else {
                            strings.push(curr);
                        }
                        break;
                    }
                    case SINGLE_QUOTE_ASCII: {
                        if (!chars.isEmpty()) {
                            chars.pop();
                        } else {
                            chars.push(curr);
                        }
                        break;
                    }
                    case '{': {
                        // we aren't in a string or character
                        if (chars.isEmpty() && strings.isEmpty()) {
                            indentationTable[i + 1] = ++indentation;
                        }
                        break;
                    }
                    case '}': {
                        // we aren't in a string or character
                        if (chars.isEmpty() && strings.isEmpty()) {
                            indentation--;
                            indentationTable[i] = indentation;
                        }
                        break;
                    }
                }
            }

            // we could do this in another pass but that
            // means going over the items again so instead
            // we are going to do it here as we go!
            // calculate if this line is the longest
            final int currentLineLen = line.codeLength() + indentationTable[i];
            {
                final Line currLongestLine = lines.get(longestLineIndex);
                final int longestLen = currLongestLine.codeLength() + indentationTable[longestLineIndex];
                if (currentLineLen >= longestLen) {
                    longestLineIndex = i;
                }
            }
        }
    }

    public String format() {
        ArrayList<String> str = new ArrayList<>();

        // Pass 1:
        // the first pass does two things:
        // - it will pass over and calculate the indentation level for the
        //   line, which is stored in a table that can be indexed later
        // - it will work out what the longest line is
        calculateIndentation();

        // this is the position in which comments should start at
        // its the longest line length + a few tabs.
        final int marginPosition = lines.get(longestLineIndex).codeLength()
                + (indentationTable[longestLineIndex] * tabSize)
                + (tabSize * 4); // extra space for nice-ness

        // Pass 2:
        // now we know how much indentation we need, as well as the longest
        // line. it's as simple as adding everything together and slapping the
        // comments on the end.
        for (int i = 0; i < lines.size(); i++) {
            Line line = lines.get(i);

            final int indentationSize = indentationTable[i] * tabSize;

            StringBuilder builder = new StringBuilder();

            // the indentation first!
            builder.append(newEmptyString(indentationSize));

            // add the code + the right padding and comment
            // or just a comment if there is no code.
            if (line.codeLength() > 0) {
                builder.append(line.code);

                final int codeRightPadLen = (marginPosition - indentationSize) - line.codeLength();
                builder.append(newEmptyString(codeRightPadLen));
            }

            builder.append(line.comment);

            str.add(builder.toString());
        }

        // for loops are no fun
        return str.stream().map(String::toString).collect(Collectors.joining("\n"));
    }
}
