/**
 * Lead Author(s): Allan Schougaard
 * 
 * @author Mohammad Mansoor Mirzad
 * 
 * Date:5/22 2026
 * 
 * Responsibilities of class:This class handles invalid grade exceptions.
 */
public class InvalidGradeException extends Exception {

    public InvalidGradeException(String message) {

        // pass message to parent Exception class
        super(message);
    }
}
