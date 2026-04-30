import java.util.ArrayList;

/**
 * Lead Author(s): Allan Schougaard
 * 
 * @author Mohammad Mansoor Mirzad
 * 
 * Date:4/30 2026
 * 
 * This class manages all students.
 */
public class GradeTracker {

    private ArrayList<Student> students; // list of students

    public GradeTracker() {
        this.students = new ArrayList<>(); // create list
    }

    public void addStudent(Student student) {
        students.add(student); // add student
    }

    public Student findStudent(String name) {

        // loop through students
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s; // found
            }
        }

        return null; // not found
    }
}