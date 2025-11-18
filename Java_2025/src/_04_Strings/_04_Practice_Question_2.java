package _04_Strings;

import java.math.BigInteger;
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
		
//		String str = "I love programming very much";
//		
//		String[] words = str.split("\\s+");
//		String longestWord = "";
//		for(String word : words) {
//			if(word.length() > longestWord.length()) {
//				longestWord = word;
//			}
//		}
//		System.out.println(longestWord);
		
		// Find all the permutations of string
//		1)backtracking (No duplicates)
//		String str = "ABCD";
//		char[] arr = str.toCharArray();
//        permute(arr, 0);
		
		
		// Generate all substrings of a string
		String str = "ABC";
		for(int i=0; i<str.length(); i++) { 
			for(int j=i+1; j<=str.length(); j++) {
				System.out.println(str.substring(i, j));
				
			}
		}
		
		String n1 = "423423";
		String n2 = "515132";
		int i=n1.length()-1;
		int j=n2.length()-1;
		int carry=0;
		StringBuilder sum = new StringBuilder();
		while(i>=0 || j>=0 || carry!=0) {
			int d1 = n1.charAt(i) - '0';
			int d2 = n2.charAt(j) - '0';
			int total = d1 + d2 + carry;
			carry /= 10;
			sum.append(total%10);
			
			i--;
			j--;
			
		}
		sum.toString();
	}
	
//	 static void permute(char[] arr, int index) {
//        if (index == arr.length) {
//            System.out.println(String.valueOf(arr));
//            return;
//        }
//
//        for (int i = index; i < arr.length; i++) {
//            swap(arr, index, i);        // fix a char
//            permute(arr, index + 1);    // permute the rest
//            swap(arr, index, i);        // backtrack
//        }
//    }
//
//    static void swap(char[] arr, int i, int j) {
//        char temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

}
