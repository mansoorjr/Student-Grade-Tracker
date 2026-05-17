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

        try {

            GradeTracker tracker = new GradeTracker();

            Student student = new Student("Mohammad");

            Course course = new Course("Java");

            // add valid grades
            course.addGrade(new Grade(90));
            course.addGrade(new Grade(85));

            // HAS-A: Student has a Course
            student.addCourse(course);

            // HAS-A: GradeTracker has a Student
            tracker.addStudent(student);

            Student foundStudent =
                    tracker.findStudent("Mohammad");

            if (foundStudent != null) {

                Course foundCourse =
                        foundStudent.findCourse("Java");

                if (foundCourse != null) {

                    System.out.println(
                            "Average Grade: "
                                    + foundCourse.getAverage());
                }
            }

        } catch (InvalidGradeException e) {

            System.out.println(e.getMessage());
        }
    }
}
