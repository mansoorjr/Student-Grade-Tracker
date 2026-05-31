/**
 * Lead Author(s):Mohammad Mansoor Mirzad
 * 
 * Professor:Allan Schougaard
 * 
 * Date:5/31 2026
 * 
 * Responsibilities of class:This class stores one grade value.It makes sure grades stay between 0 and 100.
 */

// HAS-A: A Grade has a grade value.
public class Grade {

    // stores grade value
    private double value;

    // constructor checks grade
    public Grade(double value)
            throws InvalidGradeException {

        // check if grade is invalid
        if (value < 0 || value > 100) {

            // throw custom exception
            throw new InvalidGradeException(
                    "Grade must be between 0 and 100.");
        }

        // save valid grade
        this.value = value;
    }

    // return grade value
    public double getValue() {

        return value;
    }
}
