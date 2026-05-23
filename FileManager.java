import java.io.FileWriter; // used to write to a file
import java.io.IOException; // used for file errors

/**
 * Lead Author(s):Mohammad Mansoor Mirzad
 * 
 * @author Allan Schougaard 
 * 
 * Other contributors:None                                    
 * 
 * References:Oracle Java Documentation (Swing GUI):
 *         https://docs.oracle.com/javase/tutorial/uiswing/
 * 
 * Coding with John (YouTube):
 *         https://www.youtube.com/watch?v=aqcJsKdjjvU
 *         
 * Version/date: 5/22 2026
 * 
 * Responsibilities of class:This class saves data to a text file.
 */
public class FileManager {

	// save data into file
	public void saveData(String text) {

	    // FileWriter closes automatically
	    try (FileWriter writer =
	                 new FileWriter("grades.txt")) {

	        writer.write(text); // write text

	        System.out.println("Data saved.");

	    } catch (IOException e) {

	        // show file error
	        System.out.println(
	                "Error saving file.");
	    }
	}
}
