/**
 * Lead Author(s): Allan Schougaard
 * 
 * @author Mohammad Mansoor Mirzad
 * 
 * Date:5/22 2026
 * 
 * This class stores one grade.
 */
public class Grade {

	private double value; // stores grade value

	// constructor checks grade
	public Grade(double value)
	        throws InvalidGradeException {

	    // check if invalid
	    if (value < 0 || value > 100) {

	        // throw custom exception
	        throw new InvalidGradeException(
	                "Grade must be between 0 and 100.");
	    }

	    this.value = value; // save valid grade
	}

	// return grade value
	public double getValue() {

	    return value;
	}
}
