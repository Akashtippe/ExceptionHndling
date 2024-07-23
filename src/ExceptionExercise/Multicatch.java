package ExceptionExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Multicatch {
    public static void main(String[] args) {
        try {
            processFile("G:\\\\SQL\\\\AKASH.txt.txt");
        } catch (IOException | IllegalArgumentException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }

    public static void processFile(String fileName) throws IOException, IllegalArgumentException {
        if (fileName == null) {
            throw new IllegalArgumentException("File name cannot be null");
        }
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
        } catch (IOException e) {
            throw e;
        }
    }
}
