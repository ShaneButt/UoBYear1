// Felix Angell - fa302

import java.util.ArrayList;

public class Main {

	// a student structure to
	// encapsulate all of the data we need
	private static class Student {
		public int id;
		public int cw, ex;
		
		public Student(int id, int cw, int ex) {
			this.id = id;
			this.cw = cw;
			this.ex = ex;
		}
	}
	
	// 1.3
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		
		// keep adding student data till we get
		// a zero (end of data)
		for (;;) {
			int studentNum = BIO.getInt();
			if (studentNum == 0) {
				break;
			}
			int cwMark = BIO.getInt();
			int exMark = BIO.getInt();
			students.add(new Student(studentNum, cwMark, exMark));
		}
		
		// go thru all the data and work
		// out the results and print it
		for (Student s : students) {
			double result = (double) (s.ex + s.cw) / 2;
			System.out.printf("sn=%d ex= %d cw= %d mark= %.1f\n", s.id, s.ex, s.cw, result);
		}
	}
	
}


