import java.util.ArrayList;

/**
 * Lead Author(s): Allan Schougaard
 * 
 * @author Mohammad Mansoor Mirzad
 * 
 * Date:5/31 2026
 * 
 * Responsibilities of class:This class stores student information and manages courses for a student.
 */

// HAS-MANY: A Student has many Course objects.
public class Student {

    // stores student name
    private String name;

    // HAS-MANY: A Student has many Course objects
    private ArrayList<Course> courses;

    // constructor
    public Student(String name) {

        // save student name
        this.name = name;

        // create course list
        courses = new ArrayList<>();
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

                // return found course
                return course;
            }
        }

        // course not found
        return null;
    }
}
