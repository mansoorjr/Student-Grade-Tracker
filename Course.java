import java.util.ArrayList;

/**
 * Lead Author(s):Mohammad Mansoor Mirzad
 * 
 * Professor:Allan Schougaard
 * 
 * 
 * Version/date 5/31/2026
 * 
 * Responsibilities of class:This class stores course information and manages grades for a course.
 */

// HAS-MANY: A Course has many Grade objects.
public class Course {

    // stores course name
    private String courseName;

    // HAS-MANY: A Course has many Grade objects
    private ArrayList<Grade> grades;

    // constructor
    public Course(String courseName) {

        // save course name
        this.courseName = courseName;

        // create grade list
        grades = new ArrayList<>();
    }

    // return course name
    public String getCourseName() {

        return courseName;
    }

    // add grade to course
    public void addGrade(Grade grade) {

        grades.add(grade);
    }

    // calculate average grade
    public double getAverage() {

        // check if no grades exist
        if (grades.isEmpty()) {

            return 0;
        }

        // store total grades
        double total = 0;

        // loop through grades
        for (Grade grade : grades) {

            total += grade.getValue();
        }

        // return average
        return total / grades.size();
    }
}
