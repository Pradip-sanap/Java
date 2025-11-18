package _05_Java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class _07_streamExcersize2 {

	public static void main(String[] args) {
		// Given a list of integers, calculate the sum using streams.
		List<Integer> nums = List.of(5, 3, 9, 12, 18, 20, 5);

		int sum = nums.stream().reduce(0, Integer::sum);
		System.out.println(sum);

//		Calculate the average of integers in a list using streams.
		double avg = nums.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(avg);

//		From a list of strings, filter and return only those starting with a specific letter.
		List<String> names = Arrays.asList("Alice", "Bob", "Ankit", "Charlie", "Aman", "David");

		Set<String> namesWithA = names.stream()
											.filter(item -> item.startsWith("A"))
											.collect(Collectors.toSet());
		System.out.println(namesWithA);
		
//		Remove all duplicate elements from a list of integers.
		List<Integer> arr = List.of(20, 100, 40, 20, 50, 10, 30, 50, 30);
		List<Integer> uniqueElements = arr.stream()
											.distinct()
											.collect(Collectors.toList());
		System.out.println(uniqueElements);
		
//		Convert a list of strings to uppercase using streams.
		List<String> upperCaseName = names.stream()
											.map(item -> item.toUpperCase())
											.collect(Collectors.toList());
		System.out.println(upperCaseName);
		
//		Find the maximum and minimum values in a list of integers.
		Optional<Integer> min = arr.stream().min(Integer::compare);
		System.out.println(min);
		Optional<Integer> max = arr.stream().max(Integer::compare);
		System.out.println(max);
		
//		Count how many strings in a list have length greater than 3.
		long string_count = names.stream()
									.filter(str -> str.length() > 3)
									.count();
		System.out.println(string_count);
		

//		Sort a list of strings in ascending and descending order using streams.
		List<String> sortedNames = names.stream()
											.sorted()
											.collect(Collectors.toList());
		System.out.println(sortedNames);
		
		
//		Find the second smallest and second largest element in a list of integers.
//		List<Integer> arr = List.of(20, 100, 40, 20, 50, 10, 30, 50, 30);
		long secondSmallest = arr.stream()
										.sorted()
										.distinct()
										.skip(1)
										.findFirst()
										.orElse(null);
		System.out.println(secondSmallest);
		
//		Use reduce to concatenate a list of strings into a single sentence.
//		List<String> names = Arrays.asList("Alice", "Bob", "Ankit", "Charlie", "Aman", "David");
		String concateNames = names.stream().reduce("", (a, b)-> a+" "+b);
		System.out.println(concateNames);
	}

}
