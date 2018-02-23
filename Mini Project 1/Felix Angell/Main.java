import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

    /*
        this is something we have to handle
        to i wonder what happens with these!
     */

    /**
     * just indent them normally?
     * foo bar baz
     * blah!
     *      hello
     */

    // reads the given file into a Program structure
    private static Program readProgram(Path path) {
        Program prog = new Program();                       // testing comment
        try {
            InputStream is = Files.newInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            for (String line = br.readLine(); line != null; line = br.readLine()) { // and another
                prog.addLine(new Line(line));
            }
            br.close();
            is.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return prog;
    }

    public static void main(String[] args) {
        final Main m = new Main();

        final String usless = "this is just // for testing // purposes"; // and has no purpose

        // phase 1:
        // first we load all of the files that we're
        // given as "programs"
        ArrayList<Program> programs = new ArrayList<>();
        for (String s : args) {
            Path p = Paths.get(s);
            programs.add(readProgram(p));
        }

        // phase 2:
        // we process all of the programs one by one
        for (Program p : programs) {
            System.out.println(p.format());
        }
    }

}
