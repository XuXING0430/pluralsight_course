package _2_Reading_and_writing;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingFiles {
    public static void main(String[] args) {
        Path path = Paths.get("Working_with_files_Using_the_Java_NIO_API/files/sonnet-ISO.txt");
        boolean exists = Files.exists(path);
        System.out.println("Exists = " + exists);

        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1)) {
            String line = reader.readLine();
            while (line != null){
                System.out.println("Line = " + line);
                line = reader.readLine();
            }

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
