package _12_Base64;

import java.util.Arrays;
import java.util.Base64;

public class Base64Demo {

	public static void main(String[] args) {
//		Given mesg
		String original = "Hello Java 8 Base64!";
		System.out.println("Given mesg = " + original);
		//convert mesg into bytes
		byte[] bytes = original.getBytes();
		
//		System.out.println("Bytes : " + Arrays.toString(bytes));
		System.out.println(original.length());
		System.out.println(bytes.length);
		
        // Encode
        String encoded = Base64.getEncoder().encodeToString(bytes); 
        System.out.println("Encoded: " + encoded + " , Length = "+ encoded.length());

        // Decode
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decoded = new String(decodedBytes);
        System.out.println("Decoded: " + decoded + " , Length = "+ decoded.length());
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("--------------------------------------------");
        
//        Example 2: URL Safe Base64
        String url = "https://example.com/query?name=Java 8";
        System.out.println("Given url = "+ url);
        System.out.println("Length of url = "+ url.length());
        byte[] urlBytes = url.getBytes();
        
        String encodedUrl = Base64.getUrlEncoder().encodeToString(urlBytes);
        System.out.println("URL Safe Encoded: " + encodedUrl);
        System.out.println("URL Encoded length = "+ encodedUrl.length());

        String decodedUrl = new String(Base64.getUrlDecoder().decode(encodedUrl));
        System.out.println("Decoded URL: " + decodedUrl);
        System.out.println("URL Decoded length = "+ decodedUrl.length());
        
        
//        System.out.println(Base64.getEncoder().encodeToString(bytes));;
         
        

	}

}
