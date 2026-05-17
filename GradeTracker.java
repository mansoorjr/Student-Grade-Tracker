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

    // HAS-MANY: GradeTracker has many Student objects.
    private ArrayList<Student> students;

    public GradeTracker() {
        students = new ArrayList<>(); // create student list
    }

    // add student
    public void addStudent(Student student) {
        students.add(student);
    }

    // search student
    public Student findStudent(String name) {

        // loop through students
        for (Student student : students) {

            // compare names
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }

        return null; // not found
    }
}
