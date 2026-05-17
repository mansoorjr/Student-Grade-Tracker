import java.util.ArrayList;

/**
 * Lead Author(s): Allan Schougaard
 * 
 * @author Mohammad Mansoor Mirzad
 * 
 * Date:4/30 2026
 * 
 * This class stores course and grades.
 */
public class Course {

    private String courseName; // course name

    // HAS-MANY: A Course has many Grade objects.
    private ArrayList<Grade> grades;

    public Course(String courseName) {
        this.courseName = courseName; // set name
        this.grades = new ArrayList<>(); // create grade list
    }

    public String getCourseName() {
        return courseName; // return course name
    }

    // add grade to list
    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    // calculate average grade
    public double getAverage() {

        // check if no grades
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
