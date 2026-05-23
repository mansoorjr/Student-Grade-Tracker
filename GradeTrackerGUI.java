import javax.swing.*; // used for GUI parts
import java.awt.*; // used for layout

/**
 * Lead Author(s):Mohammad Mansoor Mirzad
 * 
 * @author Allan Schougaard 
 * 
 * Other contributors:None                                    
 * 
 * References:Oracle Java Documentation (Swing GUI):
 *         https://docs.oracle.com/javase/tutorial/uiswing/
 * 
 * Coding with John (YouTube):
 *         https://www.youtube.com/watch?v=aqcJsKdjjvU
 *         
 * Version/date: 5/22 2026
 * 
 * Responsibilities of class:This class creates the GUI window for the Student Grade Tracker App.
 */

//IS-A: GradeTrackerGUI is a JFrame.
public class GradeTrackerGUI extends JFrame {// IS-A: GradeTrackerGUI is a JFrame

private JTextField studentField; // student input

private JTextField courseField; // course input

private JTextField gradeField; // grade input

private JTextArea outputArea; // output area

// HAS-A: GUI has a GradeTracker object
private GradeTracker tracker;

 public GradeTrackerGUI() {

     tracker = new GradeTracker();

     setTitle("Student Grade Tracker App");

     setSize(500, 350);

     setDefaultCloseOperation(
             JFrame.EXIT_ON_CLOSE);

     setLayout(new BorderLayout());

     JPanel inputPanel =
             new JPanel(new GridLayout(3, 2));

     inputPanel.add(
             new JLabel("Student Name:"));

     studentField = new JTextField();

     inputPanel.add(studentField);

     inputPanel.add(
             new JLabel("Course Name:"));

     courseField = new JTextField();

     inputPanel.add(courseField);

     inputPanel.add(
             new JLabel("Grade:"));

     gradeField = new JTextField();

     inputPanel.add(gradeField);

     JPanel buttonPanel = new JPanel();

     JButton addButton =
             new JButton("Add Student Info");

     buttonPanel.add(addButton);

     outputArea = new JTextArea();

     outputArea.setEditable(false);

     add(inputPanel, BorderLayout.NORTH);

     add(buttonPanel, BorderLayout.CENTER);

     add(new JScrollPane(outputArea),
             BorderLayout.SOUTH);

     addButton.addActionListener(e -> {

         try {

             String studentName =
                     studentField.getText();

             String courseName =
                     courseField.getText();

             double gradeValue =
                     Double.parseDouble(
                             gradeField.getText());

             Student student =
                     new Student(studentName);

             Course course =
                     new Course(courseName);

             course.addGrade(
                     new Grade(gradeValue));

             // HAS-A: Student has a Course
             student.addCourse(course);

             // HAS-A: GradeTracker has a Student
             tracker.addStudent(student);

             outputArea.append(
                     "Added: "
                             + studentName
                             + " | "
                             + courseName
                             + " | "
                             + gradeValue
                             + "\n");

         } catch (InvalidGradeException ex) {

             outputArea.append(
                     ex.getMessage() + "\n");

         } catch (NumberFormatException ex) {

             outputArea.append(
                     "Please enter a valid number.\n");

         } catch (Exception ex) {

             outputArea.append(
                     "Something went wrong.\n");
         }
     });
 }

 public static void main(String[] args) {

     GradeTrackerGUI gui =
             new GradeTrackerGUI();

     gui.setVisible(true);
 }
}
