package _04_Strings;

import java.util.Arrays;
import java.util.stream.Stream;

public class temp {

	public static void main(String[] args) {
//		String str = "Hello world";
		
//		int var = str.indexOf("l");
//		Stream<String> lines = str.lines();
//		lines.forEach(line ->{
//			System.out.println(line);
//		});
		
//		String replace = str.replace("ello", "*");
//		System.out.println(replace);
		
//		String s = "  Hello   World  ";
//		String s1 = s.replace(" ", "");
//		System.out.println(s1);
//		System.out.println(s.trim());
//		String[] words = s.trim().split("\\s+");
//		System.out.println(Arrays.toString(words));
//		
//		String s = "ABCD";
//		String[] ch = s.split("");
//		
//		System.out.println(Arrays.toString(ch));
//		int num = 42342;
//		String str = "";
//		while(num>0) {
//			int i = num % 10; 
//			char ch = (char) ('0' + i); 
//			str = ch + str;  
//			num /=10; 
//		}
//		
//		System.out.println(str);
		
		String str = "abcdef";
		int k = 2;
		int len = str.length();
////		System.out.println(len);
		k = len < k ? len%k : k;
//		
		
		//Approach - 1: using substring() method
//		String part1 = str.substring(0, len-k);
////		System.out.println(part1);
//		String part2 = str.substring(len-k);
////		System.out.println(part2);
//		String result = part2 + part1;
//		System.out.println(result);
		
		//Approach-2: Manual way
//		StringBuilder sb = new StringBuilder();
//		int i=len-k;
//		while(i< len) {
//			sb.append(str.charAt(i));
//			i++;
//		}
//		i=0;
//		while(i<len-k) {
//			sb.append(str.charAt(i));
//			i++;
//		}
//		System.out.println(sb);
		
//		String s1 = "ABCD";
//		String s2 = "CDAB";
//		
//		s1 = s1+s1;
//		if(s1.contains(s2)) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
		
//			Input:
//			text = "hello world"
//			pattern = "lo w"
//
//			Output:
//			true
	 

	}

}
