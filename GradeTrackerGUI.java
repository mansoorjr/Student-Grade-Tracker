
import javax.swing.*;
import java.awt.*;

/**
 * Lead Author(s):Mohammad Mansoor Mirzad
 * 
 * Professor:Allan Schougaard
 * 
 * References:
 *         Oracle Java Documentation (Swing GUI)
 *         https://docs.oracle.com/javase/tutorial/uiswing/
 * 
 *         Coding with John (YouTube)
 *         https://www.youtube.com/watch?v=aqcJsKdjjvU
 * 
 * Version/date:5/31/2026
 * 
 * Responsibilities of class:
 *         This class creates the GUI window
 *         for the Student Grade Tracker App.
 */

// IS-A: GradeTrackerGUI is a JFrame.
public class GradeTrackerGUI extends JFrame {

    // student input field
    private JTextField studentField;

    // course input field
    private JTextField courseField;

    // grade input field
    private JTextField gradeField;

    // output area
    private JTextArea outputArea;

    // HAS-A: GUI has a GradeTracker object
    private GradeTracker tracker;

    public GradeTrackerGUI() {

        // create tracker
        tracker = new GradeTracker();

        setTitle("Student Grade Tracker App");

        setSize(600, 400);

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

        JButton searchButton =
                new JButton("Search");

        JButton averageButton =
                new JButton("Show Average");

        JButton saveButton =
                new JButton("Save Data");

        JButton loadButton =
                new JButton("Load Data");

        buttonPanel.add(addButton);

        buttonPanel.add(searchButton);

        buttonPanel.add(averageButton);

        buttonPanel.add(saveButton);

        buttonPanel.add(loadButton);

        outputArea = new JTextArea();

        outputArea.setEditable(false);

        add(inputPanel,
                BorderLayout.NORTH);

        add(buttonPanel,
                BorderLayout.CENTER);

        add(new JScrollPane(outputArea),
                BorderLayout.SOUTH);

        // add student information
        addButton.addActionListener(e -> {

            try {

                String studentName =
                        studentField.getText();

                String courseName =
                        courseField.getText();

                if (studentName.isEmpty()
                        || courseName.isEmpty()
                        || gradeField.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Please fill all fields.");

                    return;
                }

                double gradeValue =
                        Double.parseDouble(
                                gradeField.getText());

                // search existing student
                Student student =
                        tracker.findStudent(studentName);

                // create student if needed
                if (student == null) {

                    student =
                            new Student(studentName);

                    // HAS-A: GradeTracker has a Student
                    tracker.addStudent(student);
                }

                // create course
                Course course =
                        new Course(courseName);

                // HAS-A: Course has a Grade
                course.addGrade(
                        new Grade(gradeValue));

                // HAS-A: Student has a Course
                student.addCourse(course);

                outputArea.append(
                        "Added: "
                                + studentName
                                + " | "
                                + courseName
                                + " | "
                                + gradeValue
                                + "\n");

                studentField.setText("");

                courseField.setText("");

                gradeField.setText("");

            } catch (InvalidGradeException ex) {

                JOptionPane.showMessageDialog(
                        null,
                        ex.getMessage());

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                        null,
                        "Please enter a valid number.");

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        null,
                        "Something went wrong.\n"
                                + ex.getMessage());
            }
        });

        // search student
        searchButton.addActionListener(e -> {

            try {

                String studentName =
                        studentField.getText();

                Student foundStudent =
                        tracker.findStudent(studentName);

                if (foundStudent != null) {

                    outputArea.append(
                            "Student found: "
                                    + foundStudent.getName()
                                    + "\n");

                } else {

                    JOptionPane.showMessageDialog(
                            null,
                            "Student not found.");
                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        null,
                        "Error searching student.");
            }
        });

        // show average
        averageButton.addActionListener(e -> {

            try {

                String studentName =
                        studentField.getText();

                String courseName =
                        courseField.getText();

                Student foundStudent =
                        tracker.findStudent(studentName);

                if (foundStudent != null) {

                    Course foundCourse =
                            foundStudent.findCourse(
                                    courseName);

                    if (foundCourse != null) {

                        outputArea.append(
                                "Average Grade: "
                                        + foundCourse.getAverage()
                                        + "\n");

                    } else {

                        JOptionPane.showMessageDialog(
                                null,
                                "Course not found.");
                    }

                } else {

                    JOptionPane.showMessageDialog(
                            null,
                            "Student not found.");
                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        null,
                        "Error calculating average.");
            }
        });

        // save data
        saveButton.addActionListener(e -> {

            try {

                FileManager fileManager =
                        new FileManager();

                fileManager.saveData(
                        outputArea.getText());

                JOptionPane.showMessageDialog(
                        null,
                        "Data saved successfully.");

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        null,
                        "Error saving data.");
            }
        });

        // load data
        loadButton.addActionListener(e -> {

            try {

                FileManager fileManager =
                        new FileManager();

                outputArea.setText(
                        fileManager.loadData());

                JOptionPane.showMessageDialog(
                        null,
                        "Data loaded successfully.");

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        null,
                        "Error loading data.");
            }
        });
    }

    public static void main(String[] args) {

        GradeTrackerGUI gui =
                new GradeTrackerGUI();

        gui.setVisible(true);
    }
}
