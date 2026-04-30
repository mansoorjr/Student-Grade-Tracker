import java.util.ArrayList;

/**
 *  * Lead Author(s): Allan Schougaard
 * 
 * @author Mohammad Mansoor Mirzad
 * 
 * Date:4/30 2026
 * 
 * This class stores course and grades.
 */
public class Course {

    private String courseName; // course name
    private ArrayList<Grade> grades; // list of grades

    public Course(String courseName) {
        this.courseName = courseName; // set name
        this.grades = new ArrayList<>(); // create list
    }

    public String getCourseName() {
        return courseName; // return name
    }

    public void addGrade(Grade grade) {
        // only add if grade is valid
        if (grade.isValidGrade()) {
            grades.add(grade);
        }
    }

    public double getAverage() {

        if (grades.isEmpty()) {
            return 0; // no grades
        }

        double total = 0;

        // add all grades
        for (Grade g : grades) {
            total += g.getValue();
        }

        return total / grades.size(); // average
    }
}