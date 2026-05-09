import javax.swing.*; // used for GUI parts
import java.awt.*; // used for layout

/**
 * Lead Author(s):Allan Schougaard
 * 
 * @author Mohammad Mansoor Mirzad
 * 
 * Version/date: 9 May 2026
 * 
 * Responsibilities of class:This class creates the GUI window for the Student Grade Tracker App.
 */

// IS-A: GradeTrackerGUI is a JFrame.
public class GradeTrackerGUI extends JFrame {

    public GradeTrackerGUI() {
        setTitle("Student Grade Tracker App"); // window title
        setSize(500, 350); // window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close program
        setLayout(new BorderLayout()); // main layout

        JPanel inputPanel = new JPanel(new GridLayout(3, 2)); // input area

        inputPanel.add(new JLabel("Student Name:")); // label
        inputPanel.add(new JTextField()); // text box

        inputPanel.add(new JLabel("Course Name:")); // label
        inputPanel.add(new JTextField()); // text box

        inputPanel.add(new JLabel("Grade:")); // label
        inputPanel.add(new JTextField()); // text box

        JPanel buttonPanel = new JPanel(); // button area

        buttonPanel.add(new JButton("Add Student")); // button
        buttonPanel.add(new JButton("Add Grade")); // button
        buttonPanel.add(new JButton("Show Average")); // button
        buttonPanel.add(new JButton("Search")); // button
        buttonPanel.add(new JButton("Save")); // button
        buttonPanel.add(new JButton("Load")); // button

        JTextArea outputArea = new JTextArea(); // output area
        outputArea.setEditable(false); // user cannot type here

        add(inputPanel, BorderLayout.NORTH); // add input area
        add(buttonPanel, BorderLayout.CENTER); // add buttons
        add(new JScrollPane(outputArea), BorderLayout.SOUTH); // add output
    }

    public static void main(String[] args) {
        GradeTrackerGUI gui = new GradeTrackerGUI(); // create GUI
        gui.setVisible(true); // show GUI
    }
}