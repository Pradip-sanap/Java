package _05_Java8Features;

import java.util.Arrays;
import java.util.Base64;

public class _08_Base64Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "Hello Java 8 Base64!";
		byte[] bytes = original.getBytes();
		System.out.println("Bytes : " + Arrays.toString(bytes));
		System.out.println(original.length());
		System.out.println(bytes.length);
        // Encode
        String encoded = Base64.getEncoder().encodeToString(bytes);
        System.out.println(encoded.length());
        System.out.println("Encoded: " + encoded);

        // Decode
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decoded = new String(decodedBytes);
        System.out.println("Decoded: " + decoded);
        
        
        
//        Example 2: URL Safe Base64
        String url = "https://example.com/query?name=Java 8";
        String encodedUrl = Base64.getUrlEncoder().encodeToString(url.getBytes());
        System.out.println("URL Safe Encoded: " + encodedUrl);

        String decodedUrl = new String(Base64.getUrlDecoder().decode(encodedUrl));
        System.out.println("Decoded URL: " + decodedUrl);
        
        

	}

}
