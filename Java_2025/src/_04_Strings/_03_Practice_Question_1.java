package _04_Strings;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class _03_Practice_Question_1 {

	public static void main(String[] args) {
		// Reverse a String (without using built-in methods)
//		StringBuilder str = new StringBuilder("east or west india is best");
		
		//Approach-1
//		int i=0;
//		int j=str.length()-1;
//		while(i<j) {
//			char temp = str.charAt(i);
//			str.setCharAt(i, str.charAt(j));
//			str.setCharAt(j, temp);
//			
//			i++;
//			j--;
//		}
//		System.out.println(str);
		
		//Approach-2
//		str.reverse();
//		System.out.println(str);
		
		//Approach-3
//		StringBuilder result = new StringBuilder();
//		for(int k=str.length()-1; k>=0; k--) {
//			result.append(str.charAt(k));
//		}
//		System.out.println(result);
		
		//Approach-4: using stack
//		ArrayDeque<Character> stack = new ArrayDeque<Character>();
//		int i=0;
//		while(i<str.length()) {
//			stack.push(str.charAt(i));
//			i++;
//		}
//		StringBuilder result = new StringBuilder();
//		while(!stack.isEmpty()) {
//			result.append(stack.pop());
//		}
//		
//		System.out.println(result);
		
		
		//------------Check if a String is palindrome---------------
//		StringBuilder str = new StringBuilder("reviver");
		//approach-1 : two pointer methode
//		int i=0;
//		int j=str.length()-1;
//		boolean flag = true;
//		while(i<j) {
//			if(str.charAt(i) != str.charAt(j)) {
//				flag=false;
//				break;
//			}
//			i++;
//			j--;
//		}
//		if(flag) {
//			System.out.println("Yes, palindrome");
//		}else {
//			System.out.println("No, Palindrome");
//		}
		
		//Approach-2
//		StringBuilder reverse = str.reverse();
//		if(reverse.equals(str)) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("Not palindrome");
//		}
		
		
		
		// Count vowels and consonants in a string
//		Input:  "Hello World"
//		Output: Vowels = 3, Consonants = 7
//		StringBuilder str = new StringBuilder("Hello World");
//		HashSet<Character> set = new HashSet<Character>();
//		set.addAll(Set.of('A', 'E', 'I','O','U','a', 'e','i','o','u'));
//
//		int vowels = 0;
//		int consonants = 0;
//		int i=0;
//		while(i<str.length()) {
//			char ch = str.charAt(i);
//			if(set.contains(ch)) {
//				vowels++;
//			}else if((ch>=65 && ch<=90 ) ||  (ch>=97 && ch<=122)){
//				consonants++;
//			}
//			i++;
//		}
//		
//		System.out.println("Vowels : "+ vowels);
//		System.out.println("Consonants : "+ consonants);
		
		
		//Count number of letter in a string
//		StringBuilder str = new StringBuilder("India jj");
		
//		int i=0;
//		int length = 0;
//		while(i<str.length()) {
//			if(Character.isLetter(str.charAt(i))) {
//				length++;
//			}
//			i++;
//		}
//		System.out.println("Total length : "+length);
		
		//Change case of each character (upper ↔ lower)
//		int i=0;
//		while(i<str.length()) {
//			char ch = str.charAt(i);
//			if(Character.isAlphabetic(ch)) {
//				if(ch>=65 && ch<=90) {
//					str.setCharAt(i, (char) (ch+32));
//				}else if(ch>=97 && ch<=122) {
//					str.setCharAt(i, (char) (ch-32));
//				}
//			}
//			i++;
//		}
//		
//		System.out.println(str);
		
		
		//Compare two strings without using equals()
//		StringBuilder st1 = new StringBuilder("Java");
//		StringBuilder st2 = new StringBuilder("Java");
//		
//		int len1 = st1.length();
//		int len2 = st2.length();
//		if(len1!=len2) {
//			System.out.println("Not equal");
//		}
//		int i=0;
//		boolean flag=true;
//		while(i < len1) {
//			if(st1.charAt(i) != st2.charAt(i)) {
//				flag=false;
//				break;
//			}
//			i++;
//		}
//		if(flag) {
//			System.out.println("Equal");
//		}else {
//			System.out.println("Not equal");
//		}
		
		
		// Check if two strings are anagrams
//		String s1 = new String("listen");
//		String s2 = new String("silent");
//		
//		int len1 = s1.length();
//		int len2 = s2.length();
//		if(len1 != len2) {
//			System.out.println("Not Anagram");
//		}
//		
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		int i=0;
//		while(i<len1) {
//			char ch = s1.charAt(i);
//			map.put(ch, map.getOrDefault(ch, 0) + 1);
//			i++;
//		}
//		i=0;
//		while(i<len2) {
//			char ch = s2.charAt(i);
//			map.put(ch, map.get(ch)-1);
//			if(map.get(ch)==0) {
//				map.remove(ch);
//			}
//			i++;
//		}
//		
//		if(map.isEmpty()) {
//			System.out.println("Yes, both strings are anagram!!!");
//		}else {
//			System.out.println("Not Anagram!!!");
//		}
		
		
		// Find frequency of each character
//		String str = "abdabdabusaiuiiaisiaisisainnbbbsabai";
//		HashMap<Character, Integer> map  = new HashMap<Character, Integer>();
//		int i=0;
//		while(i<str.length()) {
//			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
//			i++;
//		}
//		
//		map.forEach((key, value)->{
//			System.out.println(key +" : " +value);
//		});
		
		
		//Remove duplicate characters from a string
//		Input:  "programming"
//		Output: "progamin"
//		Set<Character> set = new LinkedHashSet<Character>();
//		String input = "programming";
//		int i=0;
//		while(i<input.length()) {
//			set.add(input.charAt(i));
//			i++;
//		}
//		
//		System.out.println(set);
		
		
		
		//Find first non-repeating character
//		String str = "swiss";
//		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
//		int i=0;
//		while(i<str.length()) {
//			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
//			i++;
//		} 
//		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == 1) {
//            	 System.out.println(entry.getKey());
//            	 break;
//            } 
//        } 
		
		
		//Find first repeating character
//		Input:  "geeksforgeeks"
//		Output: "g" 
		
//		String str = "geeksforgeeks";
//		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
//		int i=0;
//		while(i<str.length()) {
//			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
//			i++;
//		} 
//		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (entry.getValue() > 1) {
//            	 System.out.println(entry.getKey());
//            	 break;
//            } 
//        } 
		
		
		
		// Replace all occurrences of a character with another
//		String originalString = "hello world";
//        char oldChar = 'o';
//        char newChar = '*';
//        
//        String result = originalString.replace(oldChar, newChar);
//        System.out.println(result);
		
		
		//Check if string contains only digits
//		String str = "429181";
//		int i=0;
//		int j=str.length()-1;
//		boolean flag=true;
//		while(i<j) {
//			char ch = str.charAt(i);
//			if(!Character.isDigit(ch)) {
//				flag = false;
//				break;
//			}
//			i++; j--;
//		}
//		if(flag) {
//			System.out.println("All are digits only");
//		}else {
//			System.out.println("String contains characters also.");
//		}
		
	}
	 
} 