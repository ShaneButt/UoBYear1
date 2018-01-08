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
        int coursework, examScore;
        double overallMark;
        System.out.println("#Enter coursework mark");
        coursework = BIO.getInt();
        System.out.println("#Enter exam score");
        examScore = BIO.getInt();
        overallMark = (double) (coursework + examScore) / 2;
        System.out.println("ex = " + examScore + " cw = " + coursework + " mark =  " + overallMark);
    }
}