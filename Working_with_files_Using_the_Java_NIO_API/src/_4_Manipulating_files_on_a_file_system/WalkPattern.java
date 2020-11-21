package _4_Manipulating_files_on_a_file_system;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class WalkPattern {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("Working_with_files_Using_the_Java_NIO_API/files/media");
        boolean directory = Files.isDirectory(path);
        System.out.println("Directory = " + directory);

        Stream<Path> stream = Files.walk(path);

        long count = stream.count();
        long countDir = Files.walk(path)
                .filter(Files::isDirectory)
                .count();
        long countFiles = Files.walk(path)
                .filter(Files::isRegularFile)
                .count();

        System.out.println("Count = " + count);
        System.out.println("Count Dirs = " + countDir);
        System.out.println("Count Files = " + countFiles);
    }
}
