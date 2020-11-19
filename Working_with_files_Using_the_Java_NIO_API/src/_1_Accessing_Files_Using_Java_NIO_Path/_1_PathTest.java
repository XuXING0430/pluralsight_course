package _1_Accessing_Files_Using_Java_NIO_Path;

import java.net.URI;

import java.nio.file.Path;
import java.nio.file.Paths;

public class _1_PathTest {
    public static void main(String[] args) {
        Path path1 = Paths.get("c:/tmp/debug.log");
        Path path2 = Paths.get("c:","tmp","debug.log");
        
        URI uri = URI.create("file://c:/tmp/debug.log");
        Path path3 = Paths.get(uri);
        
        //Path path3 = Path.of("");
        System.out.println();

    }
}
