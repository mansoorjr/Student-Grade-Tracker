/**
 * Lead Author(s): Allan Schougaard
 * 
 * @author Mohammad Mansoor Mirzad
 * 
 * Date:4/30 2026
 * 
 * This class stores one grade.
 */
public class Grade {

    private double value; // stores grade value

    // constructor checks if grade is valid
    public Grade(double value) throws InvalidGradeException {

        // throw exception if grade is invalid
        if (value < 0 || value > 100) {
            throw new InvalidGradeException(
                    "Grade must be between 0 and 100.");
        }

        this.value = value; // save valid grade
    }

    public double getValue() {
        return value; // return grade value
    }
}
