package _01_File_Handling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class _01_File {

	public static void main(String[] args) throws IOException {
		File file = new File("logs/inputsData.txt");
		if (file.createNewFile()) {								//create a file
		    System.out.println("File created successfully.");
		} else {
		    System.out.println("File already exists.");
		}
		
		System.out.println(Arrays.toString("Hello".getBytes()));
		
		
		if(file.exists()) {										// check already present or not
			System.out.println("File exists");
		}
//		
		if(file.isFile()) {										// check file or not
			System.out.println("Yes, its file");
		}else {
			System.out.println("No its not file");
		}
//		
		if(file.isDirectory()) {								// check for folder
			System.out.println("Yes, its Directory");
		}
//		
		System.out.println(file.length());						// characters in files
//		
		System.out.println(file.getPath());						// get path of file
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());			// mostly it prefered
		
//		if(file.delete()) {										// delete file
//			System.out.println("File deleted");
//		}else {
//			System.out.println("Not file found to delete");
//		}
		
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getFreeSpace());
		System.out.println(file.getTotalSpace());
		System.out.println(file.getUsableSpace());
		
		System.out.println(file.isHidden());
		System.out.println(file.lastModified());
		
//		file.setReadOnly();
//		file.setReadable(true);
//		file.setWritable(true);
//		file.setExecutable(false);
		
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
//		System.out.println(file.canExecute());
		
		/* Listing files and folders */
		
		File f = new File("logs");
		String[] logFiles = f.list();			// return all files + folder names.
		System.out.println(Arrays.toString(logFiles));
		
		File[] listFiles = f.listFiles();
		for(File e : listFiles) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		/* Directory */
//		File dir = new File("logs/metrics");
//		dir.mkdirs();
		
		
		

	}

}
