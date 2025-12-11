package _05_Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class _06_StreamsExcersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(11, 44, 6, 17, 48);
		
		//find min elemet
		Optional<Integer> minNum = nums.stream()
											.min(Integer::min);
		System.out.println(minNum);


		//filter out even elements
		List<Integer> newStream =  nums.stream()
										.filter((e) -> e %2==0)
										.collect(Collectors.toList());
		System.out.println(newStream);
		
		// multiply every element with 5
		List<Integer> newStream2 = nums.stream()
										.map(e -> e * 5)
										.collect(Collectors.toList());
		System.out.println(newStream2);
		
		
		//find sum of all elements
		int sum  = nums.stream()
						.reduce(0,(a,b) -> a+b);
			
		System.out.println(sum);
		
		//convert sstring to upperCase
		List<String> names = List.of("Rohit", "Messi", "Ronaldo","Sachin");
		List<String> upperCaseName = names.stream()
											.map(name -> name.toUpperCase())
											.collect(Collectors.toList());
		System.out.println(upperCaseName);
	
		//find string which contain substring given.
		List<String> find_hit = names.stream()
									.filter(name -> name.contains("hit"))
									.collect(Collectors.toList());
		System.out.println(find_hit);
		
		
		Long greaterThan10 =  nums.stream()
									.filter(e -> e>10)
									.count();
						//			.collect(Collectors.toList());
		System.out.println(greaterThan10);
		
//		Sort a list of integers in ascending and descending order using Streams.
		List<Integer> sortedNums =  nums.stream()
										.sorted((a, b)-> a.compareTo(b))
//									 	.sorted(Comparator.reverseOrder())
										.collect(Collectors.toList());
		System.out.println(sortedNums);
		
//		Given a list of integers, find the sum of all odd numbers using Streams.
		int sumOfOddNums = nums.stream()
								.filter(e -> e%2!=0)
								.reduce(0, (a, b) -> a+b );
		System.out.println(sumOfOddNums);
	
		List<String> words = Arrays.asList("apple", "bat", "car", "door", "elephant", "frog", "ant");

//		Create a program to group a list of strings by their lengths using Collectors.groupingBy()
        Map<Integer, List<String>> groupedByLength = words.stream()
        												.collect(Collectors.groupingBy(String::length));
        
        System.out.println(groupedByLength);
         

        Map<Integer, Long> countByLength = words.stream()
            .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        System.out.println(countByLength);
	}

}
