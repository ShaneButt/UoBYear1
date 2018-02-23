import java.util.ArrayDeque;

public class Line {

    // <tab><tab><tab>int foo = 3; // comment this is a comment!
    // _______________                                              (ignored)
    //                _____________                                 (code}
    //                             _____________________________    (comment)
    // <-----------------------contents------------------------->
    private String contents;

    // the line without any of the indentation
    // at the start (see contents comment for visual guide)
    public String code;

    // the comment part of the line (if any);
    //  (see contents comment for visual guide)
    public String comment = "";

    private final CharacterParser lineParser;

    public Line(String contents) {
        this.contents = contents;
        this.lineParser = new CharacterParser(contents);
        processLine();
    }

    public int codeLength() {
        return code.length();
    }

    // looks for where the comment is in the line
    // if there is no comment then we return -1
    private int findCommentPosition() {
        // store the position we had so we can go
        // back after we've found a potential comment
        int lastPosition = lineParser.pos;

        // for keeping track of strings so that we
        // dont confuse a comment for two slashes in a quote, e.g.
        // "hello // world", "foo // bar"); // the comment here.
        ArrayDeque<Integer> quotesEncountered = new ArrayDeque<>();

        while (lineParser.hasNext()) {
            char curr = lineParser.consume();
            if (curr == '"') {
                if (!quotesEncountered.isEmpty()) {
                    // we're closing the quote!
                    quotesEncountered.pop();
                }
                else {
                    quotesEncountered.push(lineParser.pos);
                }
            }

            // we aren't INSIDE a quote because the stack
            // is empty, theres a double slash! it's a comment
            // weve found the position, so lets return
            if (quotesEncountered.isEmpty() && (curr == '/' && (lineParser.hasNext() && lineParser.peek() == '/'))) {
                // note we take off -1 here because the single line
                // comment is two symbols
                int commentStartPos = lineParser.pos- 1;

                lineParser.jumpTo(lastPosition);

                // make sure we reset the position
                return commentStartPos;
            }
        }

        // we didn't find the comment, we still
        // need to reset the position however
        lineParser.pos = lastPosition;
        return -1;
    }

    private String processLine() {
        // skip the stuff below ' '
        // (or ascii code 32) this is all
        // useless spaces, tabs, etc.
        while (lineParser.hasNext() && lineParser.peek() <= ' ') {
            lineParser.consume();
        }

        int codeEnd = findCommentPosition();
        code = contents.substring(lineParser.pos, codeEnd == -1 ? contents.length() : codeEnd);

        // shorten the code sample removing the useless spaces
        // between the comment and the code.
        code = code.trim();

        // we have no comment!
        // lets leave early.
        if (codeEnd == -1) {
            return code;
        }

        // if this runs we have a comment, so we're going to chop out the comment
        comment = contents.substring(codeEnd, contents.length());

        return code;
    }

    public String toString() {
        return code + ", " + comment;
    }

}
