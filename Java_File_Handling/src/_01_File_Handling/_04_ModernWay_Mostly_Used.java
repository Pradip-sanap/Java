package _01_File_Handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class _04_ModernWay_Mostly_Used {

	public static void main(String[] args) {
		Path path = Paths.get("data.txt");
		
//		try(Stream<String> lines = Files.lines(path)) {
//			lines.forEach((line)->{
//				System.out.println(line);
//			});
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		2. Filtering Lines
//		try(Stream<String> lines = Files.lines(path)) {
//			lines.filter(line -> line.contains("!"))
//					.map(String::toUpperCase)
//					.forEach(System.out::println);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
//		Reading All Lines at Once
//		try {
//			List<String> allLines = Files.readAllLines(path);
//			allLines.forEach(System.out::println);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
//		Writing a File Using Files.write(...)
//		Path path2 = Paths.get("output.txt");
//		List<String> lines = List.of("Hello Java", "Modern File IO with Streams");
//		try {
//			Files.write(path2, lines, StandardOpenOption.APPEND);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
//		Reading Files from a Directory as a Stream
//		Path dir = Paths.get("logs");
//
//        try (Stream<Path> files = Files.list(dir)) {
//            files.filter(Files::isRegularFile)
//                 .filter(f -> f.toString().endsWith(".txt"))
//                 .forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
		
		
		Path root = Paths.get("logs");

        try (Stream<Path> stream = Files.walk(root)) {
            stream.filter(Files::isRegularFile)
                  .filter(p -> p.toString().endsWith(".java"))
                  .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
