package Strings_programs_Java_Guides;

import java.util.LinkedHashMap;
import java.util.Map;

// Find all duplicate in string
public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		str.append("programming");
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for(int i=0; i<str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer> ele : map.entrySet()) {
			if(ele.getValue() >1) {
				System.out.print(ele.getKey());
			}
		}

	}

}
