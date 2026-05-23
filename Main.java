/**
 * Lead Author(s): Allan Schougaard
 * 
 * @author Mohammad Mansoor Mirzad
 * 
 * Date:5/22 2026
 * 
 * This class is just for testing.
 */
public class Main {

	// main method
	public static void main(String[] args) {

	    try {

	        GradeTracker tracker =
	                new GradeTracker();

	        Student student =
	                new Student("Mohammad");

	        Course course =
	                new Course("Java");

	        // add grades
	        course.addGrade(new Grade(90));

	        course.addGrade(new Grade(85));

	        // HAS-A: Student has a Course
	        student.addCourse(course);

	        // HAS-A: GradeTracker has a Student
	        tracker.addStudent(student);

	        // search student
	        Student foundStudent =
	                tracker.findStudent("Mohammad");

	        // check if found
	        if (foundStudent != null) {

	            Course foundCourse =
	                    foundStudent.findCourse("Java");

	            // check if found
	            if (foundCourse != null) {

	                // show average
	                System.out.println(
	                        "Average Grade: "
	                                + foundCourse.getAverage());
	            }
	        }

	    } catch (InvalidGradeException e) {

	        // show error
	        System.out.println(
	                e.getMessage());
	    }
	}
}
