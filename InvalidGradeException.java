/**
 * Lead Author(s):Mohammad Mansoor Mirzad
 * 
 * Professor:Allan Schougaard
 * 
 * Version/date:5/31/2026
 * 
 * Responsibilities of class:
 *         This class creates a custom
 *         exception for invalid grades.
 */

// IS-A: InvalidGradeException is an Exception.
public class InvalidGradeException extends Exception {

    // constructor
    public InvalidGradeException(String message) {

        // send message to Exception class
        super(message);
    }
}
