package _01_File_Handling;

import java.nio.file.Path;
import java.nio.file.Paths;

public class _03_Path {

	public static void main(String[] args) {

		Path path = Paths.get("C:\\Users\\pradips\\Pictures\\Screenshots\\Screenshot (6).png");
		System.out.println("File Name: " + path.getFileName());
		System.out.println("Parent Directory: " + path.getParent());
		System.out.println("Root: " + path.getRoot());
		System.out.println("Is Absolute? " + path.isAbsolute());
		System.out.println(path.getFileSystem());

		
	}

}
