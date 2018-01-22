// Felix Angell - fa302

import java.util.ArrayList;

public class Main {

    public static class StudentResult {
        public String name;
        public int cw, ex;
        
        public StudentResult(String name, int cw, int ex) {
            this.name = name;
            this.cw = cw;
            this.ex = ex;
        }
    }

    public static void main(String[] args) {
        ArrayList<StudentResult> results = new ArrayList<>();

        String name = null;
        while (!(name = BIO.getString()).equals("END")) {
            int cwMark = BIO.getInt();
            int exMark = BIO.getInt();
            results.add(new StudentResult(name, cwMark, exMark));
        }

        for (StudentResult r : results) {
            String result = "Fail"; // assume failure for now
            double avg = (double) (r.cw + r.ex) / 2;
            
            // what
            if (avg < 40) {
                result = "Fail";
            } else if ((r.cw < 30 || r.ex < 30) && (avg > 40)) {
                result = "Fail [Threshold]";
            } else {
                result = "Pass"; 
            }

            System.out.println(r.name + " [" + r.cw + "," + r.ex + "] " + avg + " " + result);
        }
    }

}



