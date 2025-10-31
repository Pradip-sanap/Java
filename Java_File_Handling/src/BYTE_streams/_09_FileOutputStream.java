package BYTE_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays; 

public class _09_FileOutputStream {

	public static void main(String[] args) throws IOException, InterruptedException {
		String message = "Hello, Byte Streams!";

//		try (FileOutputStream fos = new FileOutputStream("output2.txt")) {
//			
//			byte[] bytes = message.getBytes();
////			for (byte b : bytes) {
////			    System.out.print(b + " ");
////			}
//			
////			byte[] str = {72, 101, 108, 108, 111, 44, 32, 66, 121, 116, 101, 32};
//			
//			fos.write(bytes);			// convert string → byte[]
//			System.out.println("Message written successfully.");
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		try (FileInputStream fis = new FileInputStream("image.jpg");
//				FileOutputStream fos = new FileOutputStream("image_copy.jpg")) {
//
//			byte[] buffer = new byte[225]; // 1KB buffer
//			int bytesRead;
//			int rowCount = 0;
//			while ((bytesRead = fis.read(buffer)) != -1) {
////				System.out.println(buffer.length);
//				 System.out.println("Row " + (rowCount + 1) + ": " + Arrays.toString(buffer));
////				for(int i=0; i<buffer.length; i++) {
////					if(buffer[i]<0)	 buffer[i] = -1;
////				}
//				fos.write(buffer, 0, bytesRead); // write only valid bytes
////				Thread.sleep(1000);
//				rowCount++;
//			}
//
//			System.out.println("File copied successfully!");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		FileInputStream fis = new FileInputStream("sample.jpg");
//		byte[] bytes = fis.readAllBytes();
//		fis.close();
//		// Now 'bytes' contains the file's raw bytes, which can be printed
//		int count=0;
//		for (byte b : bytes) {
//			if(count==50) {
//				count=0;
//				System.out.println();
//			}
//			count++;
//		    System.out.printf("%02x ", b);
//		}
//		System.out.println();
//		System.out.println(bytes.length);

	}

}
