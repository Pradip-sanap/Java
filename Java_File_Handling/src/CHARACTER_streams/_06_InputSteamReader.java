package CHARACTER_streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class _06_InputSteamReader {

	public static void main(String[] args) {

		try {
//			InputStreamReader reader = new InputStreamReader(
//											new FileInputStream("input1.txt"),
//											"UTF-8"
//										);
			FileReader reader = new FileReader("input1.txt");
			int ch;
			while((ch=reader.read()) != -1) {
				System.out.print((char)ch);
			}
			
			reader.close();
			
		}  catch (IOException e) {
            e.printStackTrace();
        }

	}

}
