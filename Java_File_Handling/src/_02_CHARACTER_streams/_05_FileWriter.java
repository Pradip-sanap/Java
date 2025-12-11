package _02_CHARACTER_streams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class _05_FileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file2.txt", /*append to end*/ true);
		
//		fw.write("hello world\n"); 
//		fw.append("java developer\n");
		
		char[] str = {'j','a','v','a','\n'};
		
//		fw.write(str);
		fw.write(str, 0, 2);
		
		
		
		fw.close();
		

	}

}
