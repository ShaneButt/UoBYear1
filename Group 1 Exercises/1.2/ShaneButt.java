/**
 * Write a program that calculates an average mark from a given exam
 * and coursework mark, and then output them all.
 *
 * @author Shane Butt - Student sb1451
 * @version 03/10/2017
 */
public class Main
{
    public static void main(String[] args)
    {
        int coursework, examScore; // Here we intialise two variables
        // 'coursework' and 'examScore' they are both integers
        // equivalent (equiv.) code:
        // int coursework;
        // int examScore;
        double overallMark; // here we intiailise a 'double' variable called overallMark
        System.out.println("#Enter coursework mark"); // Here we ask for input regarding the coursework mark
        // In Charon, printed lines starting with a '#' are not considered
        // When marking
        coursework = BIO.getInt(); // Here we use the BIO class to read/get a value
        // more specifically an integer.
        System.out.println("#Enter exam score"); // Ask for exam score input
        examScore = BIO.getInt(); // same as before
        overallMark = (double) (coursework + examScore) / 2; // Here we take our two integers
        // And add them together and divide them by two; this is to create an average
        // Notice the use of parantheses, this is order of operations
        // It is imperative you understand these before continuing
        // Notice '(double)' we use this to cast the value following it as a certain
        // data type, if we did not do this, we would encounter an error.
        System.out.println("ex = " + examScore + " cw = " + coursework + " mark =  " + overallMark);
        // Finally we output what is required from us.
        //Equivalent code:
        // System.out.printf(ex = %d cw = %d mark = %d", examScore, coursework, overallMark);
    }
}