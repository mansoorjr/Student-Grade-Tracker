import java.util.ArrayList;

/**
 * Lead Author(s): Allan Schougaard
 * 
 * @author Mohammad Mansoor Mirzad
 * 
 * Date:5/22 2026
 * 
 * Responsibilities of class:This class stores student name and courses.
 */
public class Student {

	private String name; // stores student name

	// HAS-MANY: A Student has many Course objects
	private ArrayList<Course> courses;

	// constructor
	public Student(String name) {

	    this.name = name; // set student name

	    courses = new ArrayList<>(); // create course list
	}

	// return student name
	public String getName() {

	    return name;
	}

	// add course to student
	public void addCourse(Course course) {

	    courses.add(course);
	}

	// search for course
	public Course findCourse(String courseName) {

	    // loop through courses
	    for (Course course : courses) {

	        // compare course names
	        if (course.getCourseName()
	                .equalsIgnoreCase(courseName)) {

	            return course; // return found course
	        }
	    }

	    return null; // course not found
	}
}
