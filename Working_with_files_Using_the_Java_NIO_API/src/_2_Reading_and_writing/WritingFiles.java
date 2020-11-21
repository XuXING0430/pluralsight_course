package _2_Reading_and_writing;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WritingFiles {
    public static void main(String[] args) {
        Path path = Paths.get("Working_with_files_Using_the_Java_NIO_API/files/debug.log");

        try (BufferedWriter writer1 = Files.newBufferedWriter(path);
             BufferedWriter writer2 = new BufferedWriter(writer1);
             PrintWriter pw = new PrintWriter(writer2)) {

            writer1.write("Hello world!");

            pw.printf("\ni = %d\n",1111);

        }catch (IOException ioe){
            ioe.printStackTrace();
        }

        System.out.println("Done!");
    }}
