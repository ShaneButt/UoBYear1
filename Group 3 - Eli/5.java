import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main( String args[] ) {
        System.out.print("#Enter width" );
        int width = BIO.getInt();
        System.out.print("#Enter line of text : " );
        String line = BIO.getString().trim();

        while (! line.equals( "END" )) {
            System.out.println(reformat( line, width ).replace( ' ', '.' ));
            System.out.print("#Enter line of text : " );
            line = BIO.getString().trim();
        }
    }

    public static String stringOfSpaces( int num ) {
        String spaces = "";
        for (int i = 0; i < num; i++) {
            spaces = spaces + " ";
        }
        return spaces;
    }

    public static String reformat(String oLine, int width ) {
        if (oLine.length() == width) {
            return oLine;
        }
        if (oLine.length() > width) {
            return "#grater than width";
        }

        String reformattedLine = "";
        Scanner scanLine = new Scanner(oLine);
        List<String> dividedLine = new ArrayList<>();
        int numOfCharacters = 0;

        while(scanLine.hasNext()) {
            String word = scanLine.next();
            numOfCharacters += word.length();
            dividedLine.add(word);
        }
        if (dividedLine.size() == 1) {
            reformattedLine += dividedLine.get(0) + stringOfSpaces(width-dividedLine.get(0).length());
            return reformattedLine;
        }
        int spaces = width - numOfCharacters;
        int words = dividedLine.size()-1;
        int spacesOfWord = spaces/words;
        int extraSpace = spaces%words;

        for (int i = 0; i < words; i++) {
            int gaps = i < extraSpace ? spacesOfWord+1 : spacesOfWord;
            reformattedLine += dividedLine.get(i) + stringOfSpaces(gaps);
        }

        return reformattedLine + dividedLine.get(dividedLine.size()-1);
    }
}
