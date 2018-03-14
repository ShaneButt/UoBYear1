import java.util.*;

class Module
{
  private ArrayList<Student> people = new ArrayList<>();

  /**
   * Add a student
   * @param student A students details
   */
  public void add( Student student )
  {
    people.add( student );
  }

  /**
   * Return the number of students who pass this module
   * @return Number of students who have passed
   */
  public int pass()
  {
    // Fill in code for the method
    int counter = 0;							// Create counter variable and set it to 0
    for(int i = 0; i < people.size(); i++)		// Loop to check all of the people in the ArrayList
    {
        
        Student student = people.get(i);		// Set student to the student at position i in the ArrayList
        if( student.getMark() >= 40)			// If this student's mark is greater than of equal to 40
        {
            counter++;							// Increase counter by 1
        }
    }
    return counter;								// Return counter
  }

  /**
   * Return the number of students who fail this module
   * @return Number of students who have failed
   */
  public int fail()
  {
    // Fill in code for the method
	int counter = 0;							// Create counter variable and set it to 0
    for(int i = 0; i < people.size(); i++)		// Loop to check all of the people in the ArrayList
    {
        Student student = people.get(i);		// Set student to the student at position i in the ArrayList
        if( student.getMark() < 40)				// If this student's mark is less than 40
        {
            counter++;							// Increase counter by 1
        }
    }
    return counter;								// Return counter
  }

  /**
   * Return the name of the student with the highest mark
   *  There will only be 1 students who has the highest mark
   * @return Name of the student with the highest mark.
   */
  public String top()
  {
    int maxMark = 0;							// Create maxMark variable and set it to 0
    String maxName = "";						// Create maxName variable and set it to an empty string
    for(int i = 0; i < people.size(); i++)		// Loop to check all of the people in the ArrayList
    {
        Student student = people.get(i);		// Set student to the student at position i in the ArrayList
        if( student.getMark() > maxMark)		// If this student's mark is greater than the maxMark variable
        {
            maxMark = student.getMark();		// Set maxMark to this student's mark
            maxName = student.getName();		// Set maxName to this student's name
        }
    }
    return maxName;								// Return maxName
  }

  /**
   * Return the average mark of students on the module
   * @return The average mark
   */
  public double average()
  {
    // Fill in code for the method
	List<Integer> Marks = new ArrayList<Integer>();	// Create a list called Marks
    for (int i = 0; i < people.size(); i++)			// Loop to check all of the people in the ArrayList
    {
        Student student = people.get(i);			// Set student to the student at position i in the ArrayList
        Marks.add(student.getMark());				// Add this students mark to the List of marks
    }
    int sum = 0;									// Create sum variable and set it to 0
    for (int j = 0; j < Marks.size(); j++)			// Loop to check all values of the Marks list
    {
        sum += Marks.get(j);						// Add the value at position i in the list to the sum variable
    }
    double average = (double)sum / Marks.size();	// Create a variable called average and set it to the sum divided by the size of the marks list
    return average;									// Return average
  }
}
