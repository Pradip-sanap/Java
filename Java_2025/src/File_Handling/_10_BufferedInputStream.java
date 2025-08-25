package File_Handling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _10_BufferedInputStream {

	public static void main(String[] args) throws IOException {
		try (
				BufferedInputStream in = new BufferedInputStream(new FileInputStream("large.mp4"));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("copy.mp4"))
			) {
			byte[] buffer = new byte[4096];
			int bytesRead;
			while ((bytesRead = in.read(buffer)) != -1) {
				out.write(buffer, 0, bytesRead);
			}
			System.out.println("Buffered copy done.");
		}

	}

}
