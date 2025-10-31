package BYTE_streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_FileInputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try (FileInputStream fis = new FileInputStream("output2.txt")) {
			
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData); // convert byte → char
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
