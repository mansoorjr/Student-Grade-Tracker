
import javax.swing.*; // used for GUI parts
import java.awt.*; // used for layout

/**
 * Lead Author(s):Allan Schougaard
 * 
 * @author Mohammad Mansoor Mirzad
 * 
 * References:Oracle Java Documentation (Swing GUI):https://docs.oracle.com/javase/tutorial/uiswing/
 * 
 * Coding with John (YouTube):https://www.youtube.com/watch?v=aqcJsKdjjvU
 *         
 * Version/date:5/28/2026
 * 
 * Responsibilities of class:This class creates the GUI window for the Student Grade Tracker App.
 */

// IS-A: GradeTrackerGUI is a JFrame.
public class GradeTrackerGUI extends JFrame {

    private JTextField studentField; // student input

    private JTextField courseField; // course input

    private JTextField gradeField; // grade input

    private JTextArea outputArea; // output area

    // HAS-A: GUI has a GradeTracker object
    private GradeTracker tracker;

    public GradeTrackerGUI() {

        // create tracker object
        tracker = new GradeTracker();

        // window title
        setTitle("Student Grade Tracker App");

        // window size
        setSize(500, 350);

        // close program
        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        // main layout
        setLayout(new BorderLayout());

        // panel for inputs
        JPanel inputPanel =
                new JPanel(new GridLayout(3, 2));

        // student label
        inputPanel.add(
                new JLabel("Student Name:"));

        // student text field
        studentField = new JTextField();

        inputPanel.add(studentField);

        // course label
        inputPanel.add(
                new JLabel("Course Name:"));

        // course text field
        courseField = new JTextField();

        inputPanel.add(courseField);

        // grade label
        inputPanel.add(
                new JLabel("Grade:"));

        // grade text field
        gradeField = new JTextField();

        inputPanel.add(gradeField);

        // panel for buttons
        JPanel buttonPanel = new JPanel();

        // button for adding student info
        JButton addButton =
                new JButton("Add Student Info");

        buttonPanel.add(addButton);

        // button for searching student
        JButton searchButton =
                new JButton("Search");

        buttonPanel.add(searchButton);

        // output text area
        outputArea = new JTextArea();

        // user cannot type here
        outputArea.setEditable(false);

        // add input panel
        add(inputPanel, BorderLayout.NORTH);

        // add button panel
        add(buttonPanel, BorderLayout.CENTER);

        // add output area
        add(new JScrollPane(outputArea),
                BorderLayout.SOUTH);

        // event handling for add button
        addButton.addActionListener(e -> {

            try {

                // get student name
                String studentName =
                        studentField.getText();

                // get course name
                String courseName =
                        courseField.getText();

                // testing empty field validation
                if (studentName.isEmpty()
                        || courseName.isEmpty()
                        || gradeField.getText().isEmpty()) {

                    // show empty field message
                    JOptionPane.showMessageDialog(
                            null,
                            "Please fill all fields.");

                    return;
                }

                // convert grade text to number
                double gradeValue =
                        Double.parseDouble(
                                gradeField.getText());

                // create student object
                Student student =
                        new Student(studentName);

                // create course object
                Course course =
                        new Course(courseName);

                // testing invalid grade values
                course.addGrade(
                        new Grade(gradeValue));

                // HAS-A: Student has a Course
                student.addCourse(course);

                // HAS-A: GradeTracker has a Student
                tracker.addStudent(student);

                // show successful add message
                outputArea.append(
                        "Added: "
                                + studentName
                                + " | "
                                + courseName
                                + " | "
                                + gradeValue
                                + "\n");

                // clear text fields
                studentField.setText("");

                courseField.setText("");

                gradeField.setText("");

            } catch (InvalidGradeException ex) {

                // show invalid grade message
                JOptionPane.showMessageDialog(
                        null,
                        ex.getMessage());

            } catch (NumberFormatException ex) {

                // show number error
                JOptionPane.showMessageDialog(
                        null,
                        "Please enter a valid number.");

            } catch (Exception ex) {

                // show general error
                JOptionPane.showMessageDialog(
                        null,
                        "Something went wrong.");
            }
        });

        // event handling for search button
        searchButton.addActionListener(e -> {

            try {

                // get student name
                String studentName =
                        studentField.getText();

                // search for student
                Student foundStudent =
                        tracker.findStudent(studentName);

                // check if student exists
                if (foundStudent != null) {

                    // show found student
                    outputArea.append(
                            "Student found: "
                                    + foundStudent.getName()
                                    + "\n");

                } else {

                    // show not found message
                    outputArea.append(
                            "Student not found.\n");
                }

            } catch (Exception ex) {

                // show search error
                JOptionPane.showMessageDialog(
                        null,
                        "Error searching student.");
            }
        });
    }

    // main method
    public static void main(String[] args) {

        // create GUI object
        GradeTrackerGUI gui =
                new GradeTrackerGUI();

        // show GUI
        gui.setVisible(true);
    }
}

