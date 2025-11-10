package CHARACTER_streams;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
//			String line = "";
//			while((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
			
			char[] buffer = new char[20];
			int charsRead = 0;
			while((charsRead = br.read(buffer, 0, buffer.length)) != -1) {
				System.out.println("Characters read: " + charsRead);
				System.out.println(new String(buffer, 0, charsRead));				
			}
//			int charsRead = br.read(buffer, 0, buffer.length);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
