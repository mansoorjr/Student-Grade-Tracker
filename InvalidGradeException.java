/**
 * Lead Author(s): Allan Schougaard
 * 
 * @author Mohammad Mansoor Mirzad
 * 
 * Date:5/16 2026
 * 
 * Responsibilities of class:This class handles invalid grade exceptions.
 */
public class InvalidGradeException extends Exception {

    public InvalidGradeException(String message) {
        super(message); // send error message
    }
}