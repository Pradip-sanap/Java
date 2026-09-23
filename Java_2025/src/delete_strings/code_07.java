package delete_strings;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class code_07 {

	public static void main(String[] args) {
		// Count and remove consecutive duplicate characters (e.g. “aabbcc” → “abc”)
		String str = "aabbcccddeee";
		
		char prev = '\0';
		StringBuilder sb = new StringBuilder();
		for(char ch : str.toCharArray()) { 
			if(prev != ch) {
				prev = ch;
				sb.append(ch);
			}
		}
		
		System.out.println(sb);
		
		
		//OR
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(char ch : str.toCharArray()) {
			set.add(ch);
		}
		System.out.println(set.toString());
		
		
		
		
		// count character occurence 
		String str1 = "aaabbc";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(char ch : str1.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		StringBuilder ans = new StringBuilder();
		map.forEach((k, v) -> {
			ans.append(k);
			ans.append(Integer.toString(v));
		});
		System.out.println(ans);
	}

}
