package Strings;

import java.util.Arrays;

public class _04_Practice_Question_2 {

	public static void main(String[] args) {
//		Convert string to integer (parseInt() vs manual)
//		String str = "8237823";
//		
//		//parseInt()
//		int num = Integer.parseInt(str);
//		System.out.println(num);
//		
//		//manual
//		double result = 0;
//		int i=str.length()-1;
//		int j=0;
//		while(i>=0) {
//			int digit = str.charAt(i) - '0';
//			result += digit * Math.pow(10, j++);
//			i--;
//		}
//		System.out.println(result);
		
		
		
		//Convert integer to string
//		int a = 291231;
//		String str = Integer.toString(a);
//		System.out.println(str);
		 
		//approach-2
//		int a = 291231;
//		StringBuilder result = new StringBuilder();
//		while(a > 0) {
//			int digit = a % 10;
//			result.append((char) ('0' + digit));
//			a /=10;
//		}
//		
//		System.out.println(result.reverse());
		
		
//		Count occurrences of a given character
//		Input: str = "hello world", ch = 'l'
//		Output: 3
//		String str = "hello world";
//		char ch = 'l';
//		int count=0;
//		for(char c : str.toCharArray()) {
//			if(c == ch) {
//				count++;
//			}
//		}
//		
//		System.out.println(count);
		
		
//		Find substring without using substring()
		
		
//		Rotate string by k characters 
//		int k = 2;
//		StringBuilder s = new StringBuilder("lolipop");
//		while(k > 0) {
//			s.insert(0, s.charAt(s.length()-1));
//			s.deleteCharAt(s.length()-1);
//			k--;;
//		}
//		System.out.println(s);
		
		
//		Check if two strings are rotations of each other
//		String s1 = new String("abcd");
//		String s2 = new String("cdab");
//		
//		//s1 + s2
//		String temp = s1 + s2;
//		if(temp.contains(s2)) {
//			System.out.println("yes");
//		}else {
//			System.out.println("No");
//		}
		
		
//		Check if a string contains another string (implement contains() manually)
//		String str = "AxisBankOfIndia";
//		String s = "Bank";
//		
//		int i=0;
//		while(i < str.length()) {
//			char ch = str.charAt(i);
//			if(s.charAt(0) == ch) {
//				int j=0;
//				while(j<s.length()) {
//					if(str.charAt(j+i) != s.charAt(j)) {
//						break;
//					} 
//					j++;
//				}
//				if(j==s.length()) {
//					System.out.println("Str contain that substring");
//				}
//			}
//			i++;
//		}
		
		
		
//		Find the longest word in a string
//		Input: "I love programming very much"
//		Output: "programming"
		
		String str = "I love programming very much";
		
		String[] words = str.split(" ");
		String longestWord = "";
		for(String word : words) {
			if(word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		System.out.println(longestWord);

	}

}
