import java.io.*;
public class ThrowThrows {
    public static void main(String[] args) {
        try {
            readFromFile("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " );
        }
    }
    public static void readFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("File '" + fileName + "' not found.");
        }

        // If the file exists, read from it (this part is omitted for brevity)
        System.out.println("Reading from file: " + fileName);
    }
}
