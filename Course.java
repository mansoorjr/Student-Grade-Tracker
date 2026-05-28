import java.util.ArrayList;

/**
 *  * Lead Author(s): Allan Schougaard
 * 
 * @author Mohammad Mansoor Mirzad
 * 
 * Date:5/28 2026
 * 
 * This class stores course and grades.
 */
//HAS-MANY: A Course has many Grade objects.
public class Course {

	private String courseName; // stores course name

	// HAS-MANY: A Course has many Grade objects
	private ArrayList<Grade> grades;

	// constructor
	public Course(String courseName) {

	    this.courseName = courseName; // set course name

	    grades = new ArrayList<>(); // create grade list
	}

	// return course name
	public String getCourseName() {

	    return courseName;
	}

	// add grade
	public void addGrade(Grade grade) {

	    grades.add(grade);
	}

	// calculate average grade
	public double getAverage() {

	    // check if list is empty
	    if (grades.isEmpty()) {

	        return 0;
	    }

	    double total = 0; // total grades

	    // loop through grades
	    for (Grade grade : grades) {

	        total += grade.getValue();
	    }

	    return total / grades.size(); // return average
	}
}
