package _01_File_Handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;

public class _02_Files {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path file = Paths.get("demo.txt");
        Path dir = Paths.get("demoDir");
        
        
		
		if(!Files.exists(file)) {
			Files.createFile(file);
			System.out.println("File is created at : "+ file.toAbsolutePath());
		}
		
//		if (!Files.exists(dir)) {
//            Files.createDirectory(dir);
//            System.out.println("Directory created: " + dir.toAbsolutePath());
//        }
		
//		Path nestedDirectories = Paths.get("demo/java/prod");
//		Files.createDirectories(nestedDirectories);
//		System.out.println("Nested directories created.");
		
     // 2. File Writing
//        Files.write(file, Arrays.asList("Hello", "Ashutosh"));
//        System.out.println("Written to file.");
        
     // 3. File Reading
//        System.out.println("readAllLines:");
//        List<String> text = Files.readAllLines(file);
//        System.out.println(text);
        
//        4. copy particular file
        Path copyFile = Paths.get("copy/demo_copy.txt");
//        Files.copy(file, copyFile, StandardCopyOption.REPLACE_EXISTING);
        
//        5.move file
//        Path movedFile = Paths.get("demoDir/moved.txt");
//        Files.move(copyFile, movedFile, StandardCopyOption.REPLACE_EXISTING);
//        System.out.println("File moved to: " + movedFile);
//        
     // 5. File Properties
        System.out.println("File size: " + Files.size(file) + " bytes");
        System.out.println("Is directory? " + Files.isDirectory(file));
        System.out.println("Is regular file? " + Files.isRegularFile(file));
        System.out.println("Is readable? " + Files.isReadable(file));
        System.out.println("Is writable? " + Files.isWritable(file));
        System.out.println("Is hidden? " + Files.isHidden(file));
        
        
        
	}

}
