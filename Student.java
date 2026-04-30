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
    private ArrayList<Course> courses; // list of courses

    public Student(String name) {
        this.name = name; // set name
        this.courses = new ArrayList<>(); // create empty list
    }

    public String getName() {
        return name; // return name
    }

    public void addCourse(Course course) {
        courses.add(course); // add course to list
    }

    public ArrayList<Course> getCourses() {
        return courses; // return all courses
    }

    public Course findCourse(String courseName) {
        // loop through courses to find match
        for (Course course : courses) {
            if (course.getCourseName().equalsIgnoreCase(courseName)) {
                return course; // found it
            }
        }
        return null; // not found
    }
}