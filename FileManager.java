import java.io.FileWriter; // used to write to a file
import java.io.IOException; // used for file errors

/**
 * Lead Author(s):Allan Schougaard
 * 
 * @author Mohammad Mansoor Mirzad
 * 
 * Version/date: 9 May 2026
 * 
 * Responsibilities of class:This class saves data to a text file.
 */
public class FileManager {

    // method to save text into file
    public void saveData(String text) {
        try {
            FileWriter writer = new FileWriter("grades.txt"); // create file writer
            writer.write(text); // write text
            writer.close(); // close file
            System.out.println("Data saved."); // show message
        } catch (IOException e) {
            System.out.println("Error saving file."); // show error
        }
    }
}