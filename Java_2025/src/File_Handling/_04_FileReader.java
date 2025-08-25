package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _04_FileReader {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("demo.txt"); 
//		fr.skip(11);
		
//		if (fr.ready()) {
//            System.out.println("File is ready to read!");
//            System.out.println((char) fr.read());
//        }
		
//		int ch;
//		while((ch=fr.read()) != -1) {
////			System.out.println(c);
//			System.out.print(ch+" ");
//			
//		}
		
//		char[] buffer = new char[10];
//		int charRead;
//		while((charRead = fr.read(buffer)) != -1) {
//			String str = new String(buffer, 0, charRead);
//			System.out.println(str);
//		}
		
		fr.close();
		
//		FileWriter fw = new FileWriter("demo.txt");
		
//		fw.append("Do you coming in ganpati."); 
//		fw.write("where are you ?");
		
//		fw.close();
		
		
//		BufferedReader br = new BufferedReader(fr);
//		String line;
//		while((line = br.readLine()) != null) {
//			System.out.println(line);			
//		}
//		br.close();
		
//		BufferedWriter bw = new BufferedWriter(fw);
//		bw.write("Line 1");
//		bw.newLine();
//		bw.write("Line 2");
//		bw.close();
		
	}

}
