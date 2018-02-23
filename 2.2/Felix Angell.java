// Felix Angell - fa302

import java.util.ArrayList;

public class Main {

	public static class StudentResult {
		public String name;
		public int mark;
		
		public StudentResult(String name, int mark) {
			this.name = name;
			this.mark = mark;
		}
	}
	
	public static void main(String[] args) {
		ArrayList<StudentResult> results = new ArrayList<>();
		
		String name = null;
		while (!(name = BIO.getString()).equals("END")) {
			int moduleMark = BIO.getInt();
			results.add(new StudentResult(name, moduleMark));
		}
		
		for (StudentResult r : results) {
			String result = "fails"; // assume failure for now
			if (r.mark >= 70) {
				result = "gains a 1st";
			} else if (r.mark >= 60) {
				result = "gains a 2.1";
			} else if (r.mark >= 50) {
				result = "gains a 2.2";
			} else if (r.mark >= 40) {
				result = "gains a 3rd";
			}
			
			System.out.println(r.name + " [" + r.mark + "] " + result);
		}
	}
	
}


