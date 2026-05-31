import java.util.ArrayList;

/**
 * Lead Author(s): Allan Schougaard
 * 
 * @author Mohammad Mansoor Mirzad
 * 
 * Date:5/31 2026
 *
 * Responsibilities of class:This class stores and manages all Student objects.
 */

// HAS-MANY: GradeTracker has many Student objects.
public class GradeTracker {

    // HAS-MANY: GradeTracker has many Student objects
    private ArrayList<Student> students;

    // constructor
    public GradeTracker() {

        // create student list
        students = new ArrayList<>();
    }

    // add student to tracker
    public void addStudent(Student student) {

        students.add(student);
    }

    // search for student
    public Student findStudent(String name) {

        // loop through students
        for (Student student : students) {

            // compare student names
            if (student.getName()
                    .equalsIgnoreCase(name)) {

                // return found student
                return student;
            }
        }

        // student not found
        return null;
    }
}

