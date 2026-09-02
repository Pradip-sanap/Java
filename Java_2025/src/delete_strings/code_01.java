package delete_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class code_01 {

	public static void main(String[] args) {
		String input = "Hello Java";
		StringBuilder result = new StringBuilder();
		int i = input.length() - 1;
		int j=0;
		while(i >= 0) {
			result.append(input.charAt(i));
			i--;
		}
			
		System.out.println(result);
		
		//check palindrom. remove punctuations, special characters.
		String str = "A man, a plan, a canal: Panama";
		boolean flag = true;
		str = str.toLowerCase();
		int l=0;
		int r=str.length() - 1;
		
		while(l < r) {
			
			while(!Character.isLetterOrDigit(str.charAt(l))) {
				l++;
			}
			while(!Character.isLetterOrDigit(str.charAt(r))) {
				r--;
			}
			
			if(str.charAt(l) != str.charAt(r)) {
				flag=false;
				break;
			}
			
			l++;
			r--; 
		}
		
		if(flag) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		
		
		// Input:  "Hello World"
//		Output: Vowels = 3, Consonants = 7
		
		String str2 = "Hello world";
		str2 = str2.toLowerCase();
		StringBuilder vowels = new StringBuilder();
		StringBuilder alphabets = new StringBuilder();
		for(char ch : str2.toCharArray() ) {
			if(Character.isAlphabetic(ch)) { 
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					vowels.append(ch);
					continue;
				}
				alphabets.append(ch);
			}
		}
		System.out.println(vowels);
		System.out.println(alphabets);
		
		
		//count words in string
//		String str3 = "Java is awesome";
//		String str3 = "  ";
		String str3 = " pradip   laxman      sanap      ";
		
		
		str3 = str3.trim();
		if(str3.isEmpty()) {
			System.out.println("Str is empty. No words in it.");
		}
		String[] wordsArray = str3.split("\\s+");
		System.out.println(Arrays.toString(wordsArray));
		
		
		//check 2 strings are equal without in built method;
		String s1 = "Hello";
		String s2 = "Hello";
		if(s1.isEmpty() || s2.isEmpty()) {
			System.out.println("Not equal");
		}
		if(s1.length() != s2.length()) {
			System.out.println("Not equal");
		}
		int k=0;
		boolean flag2 = true;
		while(k < s1.length()) {
			if(s1.charAt(k) != s2.charAt(k)) {
				flag2 = false;
				break;
			}
			k++;
		}
		
		if(flag) {
			System.out.println("Equal");
		}else {
			System.out.println("Not equal");
		}
		 
		
		
		//check anagrams
		String ss1 = "listen";
		String ss2 = "silent";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch : ss1.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		boolean flag3 = true;
		for(char ch : ss2.toCharArray()) {
			if(map.containsKey(ch)) {
				Integer mapValue = map.get(ch);
				if(mapValue == 1) {
					map.remove(ch);
					continue;
				}
				map.put(ch, mapValue - 1);
			}
			flag3 = false;
			break;
		}
		System.out.println(map);
		if(flag3) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not anagram");
		}
		
		
		
		
		// remove duplicate from string
		String st1 = "programming";
		st1 = st1.toLowerCase();
		
		StringBuilder stt = new StringBuilder();
		boolean[] charCheck = new boolean[26];
		for(char ch : st1.toCharArray()) {
			int idx = ch - 'a';
			if(!charCheck[idx]) {
				charCheck[idx] = true;
				stt.append(ch);				
			}			
		} 
		System.out.println(stt);
		
		//OR
		
		LinkedHashSet<Character> resultt = new LinkedHashSet<Character>();
		for(char ch : st1.toCharArray()) {
			resultt.add(ch);
		}
		System.out.println(resultt.toString()); 
		
		
		
		int mynum = 12345;
		
		String numInString = Integer.toString(mynum);
		System.out.println(numInString);
		
		
		// find substring without subString() method
		String sstt = "hello world";
		int start = 2;
		int end = 7;
		StringBuilder sb = new StringBuilder();
		for(int p = start; p < end ; p++) {
			sb.append(sstt.charAt(p));
		}
		
		System.out.println(sb);
		
		
		// rotate string by k times
		String mystring = "abcdef";
		ArrayList<Character> list = new ArrayList<Character>();
		for (char c : mystring.toCharArray()) {
		    list.add(c);
		}

		System.out.println(list);
		int rr = 2;
		
		StringBuilder ssb = new StringBuilder();
		int z = 0;
		int _left = z;
		int _right = rr-1;
		while(_left < _right) {
			char temp = list.get(_left);
			list.set(_left, list.get(_right));
			list.set(_right, temp);
			
			_left++;
			_right--;
		}
		
		 z = rr;
		 _left = z;
		 _right = mystring.length()-1;
		 while(_left < _right) {
				char temp = list.get(_left);
				list.set(_left, list.get(_right));
				list.set(_right, temp);
				
				_left++;
				_right--;
			}
		 System.out.println(list);
		List<Character> resultttt = list.reversed();
		System.out.println(resultttt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
