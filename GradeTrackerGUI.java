import java.util.ArrayList;

/**
 * Lead Author(s): Allan Schougaard
 * 
 * @author Mohammad Mansoor Mirzad
 * 
 * Date:5/28 2026
 * 
 * This class manages all students.
 */
//HAS-MANY: GradeTracker has many Student objects.
public class GradeTracker {

	// HAS-MANY: GradeTracker has many Student objects
	private ArrayList<Student> students;

	// constructor
	public GradeTracker() {

	    students = new ArrayList<>(); // create student list
	}

	// add student
	public void addStudent(Student student) {

	    students.add(student);
	}

	// search student
	public Student findStudent(String name) {

	    // loop through students
	    for (Student student : students) {

	        // compare student names
	        if (student.getName()
	                .equalsIgnoreCase(name)) {

	            return student; // found student
	        }
	    }

	    return null; // student not found
	}
}
