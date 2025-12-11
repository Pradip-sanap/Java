package PRACTICE;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class _1_File_IO_Package {

	public static void main(String[] args) {
		File file = new File("demo/tut1.txt");
		
		boolean exists = file.exists();
		System.out.println(exists); 
		try {
			if(!file.exists()) {
				boolean newFile = file.createNewFile();
				if(newFile) {
					boolean exists2 = file.exists();
					System.out.println(exists2);
				} 				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		File f2 = new File("./");
		String[] allFileandFolders = f2.list();
		System.out.println(allFileandFolders.length);
		System.out.println(Arrays.toString(allFileandFolders));

	}

}
