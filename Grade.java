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

    private double value; // grade value

    public Grade(double value) {
        this.value = value; // set value
    }

    public double getValue() {
        return value; // return value
    }

    public boolean isValidGrade() {
        // check if grade is between 0 and 100
        return value >= 0 && value <= 100;
    }
}