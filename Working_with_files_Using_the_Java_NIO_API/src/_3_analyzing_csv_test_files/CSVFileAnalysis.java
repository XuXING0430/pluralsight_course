package _3_analyzing_csv_test_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CSVFileAnalysis {

	public static void main(String[] args) {
		Path path = Paths.get("Working_with_files_Using_the_Java_NIO_API/files/data.csv");
	
		try (Stream<String> lines = Files.lines(path);) {
			lines.filter(line -> !line.startsWith("#"))
					.flatMap(CSVFileAnalysis::lineToPerson)
					.forEach(System.out::println);

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

	public static Stream<Person> lineToPerson(String line) {
		try {
			String[] elements = line.split(";");
			String name = elements[0];
			int age = Integer.parseInt(elements[1]);
			String city = elements[2];

			Person p = new Person(name,age,city);
			return Stream.of(p);
		} catch (Exception e) {

		}
		return Stream.empty();
	}
}






