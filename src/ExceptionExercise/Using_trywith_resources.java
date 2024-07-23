package ExceptionExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Using_trywith_resources {
    public static void main(String[] args) {
        String filePath = "G:\\\\SQL\\\\AKASH.txt.txt";

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}