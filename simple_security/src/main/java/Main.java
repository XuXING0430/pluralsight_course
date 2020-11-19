import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        String version = System.getProperty("java.version");
        System.out.println(version);

        try(FileWriter writer = new FileWriter("c:/tmp/out.txt")){
            writer.write("Hello world");
        }
    //    Map test
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("SEO", "Search engine optimization");
        dictionary.put("SaaS", "Software as a service");
        dictionary.put("UX", "User experience");
        System.out.println(dictionary.values().contains("User experience"));

    }
}
