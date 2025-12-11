package _02_CHARACTER_streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class _07_OutputStreamWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (OutputStreamWriter writer = new OutputStreamWriter(
                								new FileOutputStream("output1.txt"), 
                								StandardCharsets.UTF_16
                								)) 
		{
            
            writer.write("Hello, World!\n");
            writer.write("नमस्ते दुनिया 🌍\n");  // Unicode safe
            writer.flush(); // ensure data is written
            
            System.out.println("Data written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
