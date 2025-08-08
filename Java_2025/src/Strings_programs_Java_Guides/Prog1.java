package Strings_programs_Java_Guides;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Prog1 {

	public static char findFirstNonRepeatingChar(String str) {
		Map<Character, Integer> charCount = new LinkedHashMap<>();
		System.out.println(str.toCharArray());
		for (char ch : str.toCharArray()) {
			charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
		}
		
		System.out.println(charCount);
		
		for(Map.Entry<Character, Integer> e: charCount.entrySet()) {
			if(e.getValue() == 1) {
				return e.getKey();
			}
		}
		
		return '\0';

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find first non-repeating character from string.

		String str = "pasdkfpedkslaja";
		
		char firstNonRepeatingChar = findFirstNonRepeatingChar(str); 
		
//		firstNonRepeatingChar ?  :
		if(firstNonRepeatingChar != '\0') {
			System.out.println("First Non Repeating char : "+ firstNonRepeatingChar);
		}else {
			 System.out.println("No repeating char");;
		}

	}

}
