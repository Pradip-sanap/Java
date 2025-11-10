package CHARACTER_streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;

public class _04_FileReader {

	public static void main(String[] args) throws IOException {
//		FileReader fr = new FileReader("sample.txt"); 
//		fr.skip(11);

//		if (fr.ready()) {
//            System.out.println("File is ready to read!");
//            System.out.println((char) fr.read());
//        }

//		int ch;
//		while((ch= fr.read()) != -1) { 
//			System.out.print((char) ch); 
//		}

//		fr.close();

//		FileWriter fw = new FileWriter("sample.txt"); 
//		fw.append("Do you coming in ganpati."); 
//		fw.write("where are you ?");
//		
//		fw.close();

//		BufferedReader br = new BufferedReader(fr);
//		String line;
//		
//		while((line = br.readLine()) != null) {
//			System.out.println(line);			
//		}
//		br.close();
//		
//		BufferedWriter bw = new BufferedWriter(fw);
//		bw.write("Line 1");
//		bw.newLine();
//		bw.write("Line 2");
//		bw.close();

//		try(FileReader reader  = new FileReader("data.txt")){
//			int ch=0;
//			while((ch=reader.read()) != -1) {
//				System.out.print((char) ch);
//			}
//			
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}

//		try(FileWriter writer = new FileWriter("data.txt", true)){
//			writer.append("777777777777");
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}

//		Copying Text from One File to Another
//		try (FileReader reader = new FileReader("data.txt"); 
//				FileWriter writer = new FileWriter("copied.txt")) {
//
//			int ch;
//			while ((ch = reader.read()) != -1) {
//				writer.write(ch);
//			}
//
//			System.out.println("File copied successfully.");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		Real-World Use Case — Logging to File
		log("Application started.");
		log("Performing some operations...");
		log("Application stopped.");

	}

	public static String LOG_FILE = "app.log";

	public static void log(String message) {
		try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
			writer.write(LocalDateTime.now() + " - " + message + "\n");
		} catch (IOException e) {
			System.err.println("Error writing to log file: " + e.getMessage());
		}
	}

}
