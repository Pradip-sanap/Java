package _12_Base64;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Base64;

public class project1 {

	public static void main(String[] args) throws IOException {
		// . Sending Images in REST APIs (Very Common)
		byte[] imageBytes = Files.readAllBytes(Path.of("C:\\Users\\pradips\\Desktop\\My Files\\My Code\\Java Repo\\Java_2025\\src\\_12_Base64\\dogImage.jpg"));
//		System.out.println(Arrays.toString(imageBytes));
		System.out.println(imageBytes.length);
		String base64Image = Base64.getEncoder().encodeToString(imageBytes);
		System.out.println("Encoded :"+base64Image);
		System.out.println("Length :"+ base64Image.length());
		
		//----------------------------------------------
		 // Decode Base64 back to bytes
        byte[] decodedBytes = Base64.getDecoder().decode(base64Image);

        // Save bytes as a new JPG file
        Path outputPath = Path.of("C:\\\\Users\\\\pradips\\\\Desktop\\\\My Files\\\\My Code\\\\Java Repo\\\\Java_2025\\\\src\\\\_12_Base64\\\\decoded_dog.jpg");
        Files.write(outputPath, decodedBytes);

        System.out.println("Image decoded and saved successfully!");
        System.out.println("Decoded byte size: " + decodedBytes.length);

	}

}
