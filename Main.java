/**
 * Lead Author(s): Allan Schougaard
 * 
 * @author Mohammad Mansoor Mirzad
 * 
 * Date:4/30 2026
 * 
 * This class is just for testing.
 */
public class Main {

    public static void main(String[] args) {

        GradeTracker tracker = new GradeTracker(); // create tracker

        Student student = new Student("Mohammad"); // create student
        Course course = new Course("Java"); // create course

        // add grades
        course.addGrade(new Grade(90));
        course.addGrade(new Grade(85));

        student.addCourse(course); // add course to student
        tracker.addStudent(student); // add student to tracker

        // search student
        Student found = tracker.findStudent("Mohammad");

        if (found != null) {

            Course c = found.findCourse("Java");

            if (c != null) {
                // print result
                System.out.println("Average: " + c.getAverage());
            }
        }
    }
}