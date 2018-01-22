// Felix Angell - fa302

import java.util.ArrayList;

public class Main {

	public static class StudentResult {
		public String name;
		public boolean passed;
		
		public StudentResult(String name, boolean passed) {
			this.name = name;
			this.passed = passed;
		}
	}
	
	public static void main(String[] args) {
		ArrayList<StudentResult> results = new ArrayList<>();
		
		String name = null;
		while (!(name = BIO.getString()).equals("END")) {
			int moduleMark = BIO.getInt();
			results.add(new StudentResult(name, moduleMark >= 40));
		}
		
		for (StudentResult r : results) {
			System.out.println(r.name + " " + (r.passed ? "Pass" : "Fail"));
		}
	}
	
}
