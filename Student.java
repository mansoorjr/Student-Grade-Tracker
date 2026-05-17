import java.util.ArrayList;

/**
 * Lead Author(s): Allan Schougaard
 * 
 * @author Mohammad Mansoor Mirzad
 * 
 * Date:4/30 2026
 * 
 * Responsibilities of class:This class stores student name and courses.
 */
public class Student {

    private String name; // student name

    // HAS-MANY: A Student has many Course objects.
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name; // set name
        this.courses = new ArrayList<>(); // create course list
    }

    public String getName() {
        return name; // return name
    }

    // add course
    public void addCourse(Course course) {
        courses.add(course);
    }

    // find course by name
    public Course findCourse(String courseName) {

        // loop through courses
        for (Course course : courses) {

            // check if names match
            if (course.getCourseName().equalsIgnoreCase(courseName)) {
                return course;
            }
        }

        return null; // not found
    }
}
