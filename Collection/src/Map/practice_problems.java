package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class practice_problems {

	public static void main(String[] args) {
//		1. **Count Frequency of Elements**
//	    - Input: `[1,2,2,3,1,4,2]`
//	    - Output: `{1=2, 2=3, 3=1, 4=1}`
		
		int[] arr = {1, 2, 2, 3, 1, 4, 2};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int e: arr) {
			map.put(e, map.getOrDefault(e, 0) + 1);
		}
		System.out.println(map);
		
 
		
		
//		2. **Check if Two Strings are Anagrams**
//	    - Input: `"listen", "silent"`
//	    - Output: `true`
		String s1 = "listen";
		String s2 = "selent";
		
		if(s1.length() != s2.length()) {
			System.out.println("Not Anagram");
		}else {
			
			HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
			for(int i=0; i<s1.length(); i++) {
				map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0)+1);
			}
			
			boolean flag = true;
			for(int j=0; j<s2.length(); j++) {
				char ch = s2.charAt(j);
				Integer mapValue = map1.get(ch);
				if(mapValue != null && mapValue > 0) {
					map1.replace(ch, mapValue - 1);
				}else { 
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not anagram");
			}
			
		}
		
		// Find first non-repeating character in string
		String str3 = "swiss";
		LinkedHashMap<Character, Integer> map3 = new LinkedHashMap<Character, Integer>();
		
		for(char ch : str3.toCharArray()) {
			map3.put(ch, map3.getOrDefault(ch, 0) + 1);
		}
		
		for(var keypair: map3.entrySet()) {
			if(keypair.getValue()==1) {
				System.out.println(keypair.getKey());
				break;
			}
		}
		
		
		
		// find array contain duplicate
		int[] arr4 = {1,2,3,4, 1};
		
		HashMap<Integer, Boolean> map4 = new HashMap<Integer, Boolean>();
		boolean flag=false;
		for(int e : arr4) {
			if(map4.containsKey(e)) {
				flag=true;
				break;
			}
			map4.put(e, true);
		}
		if(flag) {
			System.out.println("Contains duplicate");
		}else {
			System.out.println("No duplicates");
		}
		
		
		
		// Store names as keys and marks as values, then fetch highest scoring student
		HashMap<String, Integer> map5 = new HashMap<String, Integer>();
		
		map5.put("Doremon", 88);
		map5.put("Nobita", 65);
		map5.put("Sizuka", 75);
		map5.put("Sunio", 72);
		map5.put("Giyaan", 60);
		map5.put("Dekisugi", 90);
		
		int highestScore = Integer.MIN_VALUE;
		String highestScoringStudent = "";
		
		for(var key_pair: map5.entrySet()) {
			if(key_pair.getValue() > highestScore) {
				highestScoringStudent = key_pair.getKey();
				highestScore = key_pair.getValue();
			}
		}
		
		System.out.println("Highest scoring student: " + highestScoringStudent);
		
		
		
		
//		1. **Find Subarray with Given Sum (Positive Numbers)**
//	    - Input: `[1, 4, 20, 3, 10, 5], sum=33`
//	    - Output: Subarray `[20, 3, 10]`
		
		int[] arr6 = {1, 4, 20, 3, 10, 5};
		
		HashMap<Integer, Integer> map6 = new HashMap<Integer, Integer>();
		
		 
		
		int givenSum = 33;
		
		int prefixSum = 0;
		
		int countOfSubarray = 0;
		
		for(int i=0; i<arr6.length; i++) {
			prefixSum += arr6[i];
			
			if(prefixSum == givenSum) {
				for(int k=0; k<i; k++) {
					System.out.print(arr6[k]+" ");
				}
				break;
			}
			
			if(map6.containsKey(prefixSum - givenSum)) {
				int startIdx = map6.get(prefixSum - givenSum)+1;
				
				for(int j = startIdx; j <= i; j++) {
					System.out.print(arr6[j] + " ");
				}
				break;
			}
			
			map6.put(prefixSum, map6.getOrDefault(prefixSum, 0) + 1);
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
