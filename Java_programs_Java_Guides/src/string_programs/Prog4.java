package string_programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is a test. This test is easy.";
		
		String[] words = str.toLowerCase().split("\\W+");
		
//		System.out.println(Arrays.toString(words)); 
//		for (String string : words) {
//			System.out.print(string.length()+" ");
//		}
		
		HashMap<String, Integer> wordmap = new HashMap<>();
		for (String word : words) {
			wordmap.put(word, wordmap.getOrDefault(word, 0) + 1);
        }
		
		System.out.println(wordmap);
		for (Map.Entry<String, Integer> entry : wordmap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " "); 
            }
        }
		
		

	}

}
