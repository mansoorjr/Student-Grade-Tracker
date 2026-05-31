
import java.io.FileWriter; // used to write to file
import java.io.IOException; // used for file errors
import java.io.BufferedReader; // used to read file
import java.io.FileReader; // used to open file

/**
 * Lead Author(s):Mohammad Mansoor Mirzad
 * 
 * Professor:Allan Schougaard
 * 
 * References:
 *         Oracle Java Documentation
 *         https://docs.oracle.com/javase/tutorial/essential/io/
 * 
 * Version/date:5/31/2026
 * 
 * Responsibilities of class:
 *         This class saves and loads
 *         data from a text file.
 */

// HAS-A: FileManager uses a FileWriter object.
// HAS-A: FileManager uses a FileReader object.
public class FileManager {

    // save data into file
    public void saveData(String text) {

        // FileWriter closes automatically
        try (FileWriter writer =
                     new FileWriter("grades.txt")) {

            // write text into file
            writer.write(text);

            // show success message
            System.out.println(
                    "Data saved.");

        } catch (IOException e) {

            // show file error
            System.out.println(
                    "Error saving file.");
        }
    }

    // load data from file
    public String loadData() {

        StringBuilder data =
                new StringBuilder();

        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(
                                     "grades.txt"))) {

            String line;

            // read file line by line
            while ((line = reader.readLine())
                    != null) {

                data.append(line)
                        .append("\n");
            }

        } catch (IOException e) {

            return "Error loading file.";
        }

        return data.toString();
    }
}
