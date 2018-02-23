<<<<<<< HEAD:2.3/Eli Murrary.java
/**
 * Eli Murray - ejdm11
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static List<String> nameList = new ArrayList<String>();		//Declares 4 Lists for storing values
	public static List<Integer> courseworkList = new ArrayList<Integer>();
	public static List<Integer> examList = new ArrayList<Integer>();
	public static List<Double> scoreList = new ArrayList<Double>();

	public static void main(String[] args) {
		String name = "";						//Variables for current values
		int coursework, exam = 0;
		double score;

		while(true) {
			name = BIO.getString();
			if (name.equals("END")) {
				print();
				System.exit(1);
			}
			coursework = BIO.getInt();
			exam = BIO.getInt();
			score = (((double)coursework + (double)exam)/ 2);
			DecimalFormat df = new DecimalFormat("#.#");		//DecimalFormat is an alternative to using
			df.setRoundingMode(RoundingMode.CEILING);		//the printf() function. setRoundingMode 
			nameList.add(name);					//tells the formatter to round up.
			courseworkList.add(coursework);
			examList.add(exam);
			scoreList.add(score);

		}
	}

	private static void print() {
		for (int i = 0; i < nameList.size(); i++) {
			if (scoreList.get(i) < 40) {
				System.out.println(nameList.get(i)+ " ["+courseworkList.get(i)+","+examList.get(i)+"] "+scoreList.get(i)+" Fail");
			} else if (courseworkList.get(i) < 30 || examList.get(i) < 30) {
				System.out.println(nameList.get(i)+ " ["+courseworkList.get(i)+","+examList.get(i)+"] "+scoreList.get(i)+" Fail [Threshold]");
			} else {
				System.out.println(nameList.get(i)+ " ["+courseworkList.get(i)+","+examList.get(i)+"] "+scoreList.get(i)+" Pass");
			}
		}
		System.exit(1);
	}
}
=======
/**
 * Eli Murray - ejdm11
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static List<String> nameList = new ArrayList<String>();		//Declares 4 Lists for storing values
	public static List<Integer> courseworkList = new ArrayList<Integer>();
	public static List<Integer> examList = new ArrayList<Integer>();
	public static List<Double> scoreList = new ArrayList<Double>();

	public static void main(String[] args) {
		String name = "";						//Variables for current values
		int coursework, exam = 0;
		double score;

		while(true) {
			name = BIO.getString();
			if (name.equals("END")) {
				print();
				System.exit(1);
			}
			coursework = BIO.getInt();
			exam = BIO.getInt();
			score = (((double)coursework + (double)exam)/ 2);
			DecimalFormat df = new DecimalFormat("#.#");		//DecimalFormat is an alternative to using
			df.setRoundingMode(RoundingMode.CEILING);		//the printf() function to show a set
			nameList.add(name);					//number of decimal points. The
			courseworkList.add(coursework);				//RoundingMode.CEILING tells it to round up.
			examList.add(exam);
			scoreList.add(score);

		}
	}

	private static void print() {
		for (int i = 0; i < nameList.size(); i++) {
			if (scoreList.get(i) < 40) {
				System.out.println(nameList.get(i)+ " ["+courseworkList.get(i)+","+examList.get(i)+"] "+scoreList.get(i)+" Fail");
			} else if (courseworkList.get(i) < 30 || examList.get(i) < 30) {
				System.out.println(nameList.get(i)+ " ["+courseworkList.get(i)+","+examList.get(i)+"] "+scoreList.get(i)+" Fail [Threshold]");
			} else {
				System.out.println(nameList.get(i)+ " ["+courseworkList.get(i)+","+examList.get(i)+"] "+scoreList.get(i)+" Pass");
			}
		}
		System.exit(1);
	}
}
>>>>>>> origin/master:Group 2 - Eli/3.java
