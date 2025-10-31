package Hands_on;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;

public class FilesClassDemo {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("logs/file1.js");
		
//		if(Files.exists(path)) {
//			System.out.println("File already exists");
//		}else {
//			if(Files.createFile(path) != null) {
//				System.out.println("File create!!!");
//			}else {
//				System.out.println("File already exists");
//			}			
//		}
		
//		Path src = Paths.get("logs/file1.js");
//		Path dest = Paths.get("olderLogs/file1_copy.js");
//		Files.copy(src, dest, StandardCopyOption.COPY_ATTRIBUTES);
		
//		Path src = Paths.get("logs/file1.js");
//		Path dest = Paths.get("olderLogs/file1_move.js");
//		Files.move(src, dest, StandardCopyOption.REPLACE_EXISTING);
		
		
		byte[] allBytes = Files.readAllBytes(path);
		System.out.println(Arrays.toString(allBytes));
		
		List<String> allLines = Files.readAllLines(path);
		System.out.println(allLines);
		
		

	}

}
