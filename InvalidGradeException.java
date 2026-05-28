/**
 * Lead Author(s): Allan Schougaard
 * 
 * @author Mohammad Mansoor Mirzad
 * 
 * Date:5/28 2026
 * 
 * Responsibilities of class:This class handles invalid grade exceptions.
 */
// IS-A: InvalidGradeException is an Exception.
public class InvalidGradeException extends Exception {

    public InvalidGradeException(String message) {

        // pass message to parent Exception class
        super(message);
    }
}
