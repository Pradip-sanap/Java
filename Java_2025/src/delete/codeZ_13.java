package delete;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class codeZ_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = List.of("apple", "bat", "car", "door", "elephant", "frog", "ant");
		
		//group string by their length
		Map<Integer, List<String>> ans = words.stream().collect(Collectors.groupingBy(str -> str.length()));
		System.out.println(ans);
		
		//group string by their length and count how many elements in that group
		Map<Integer, Long> ans2 = words.stream().collect(Collectors.groupingBy(str -> str.length(), Collectors.counting()));
		System.out.println(ans2);
		
		//group string by their length and collect only first letter
		Map<Integer, List<Character>> ans3 = words.stream().collect(Collectors.groupingBy(str -> str.length(),
														Collectors.mapping(str -> str.charAt(0), Collectors.toList())
														));
		System.out.println(ans3);
		
		//Two-level Grouping: Group by Length, Then by First Letter
		Map<Integer, Map<Character, List<String>>> ans4 = words.stream().collect(Collectors.groupingBy(String::length, Collectors.groupingBy(str->str.charAt(0))));
		System.out.println(ans4);
		
		//Group Strings by Length and Find the Longest String in Each Group
		Map<Integer, Optional<String>> longestByLength = words.stream()
			    .collect(Collectors.groupingBy(
			        str -> str.length(),
			        Collectors.maxBy(Comparator.naturalOrder())
			    ));
		System.out.println(longestByLength);
		

	}

}
