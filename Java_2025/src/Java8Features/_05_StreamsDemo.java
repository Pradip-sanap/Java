package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class _05_StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> marks = List.of(2,4,7,9,5,1,10,14,17,19);
		
		List<Integer> evenNum = marks.stream()
								.filter((e)-> e%2==0)					//filter()
								.sorted()								//sorted
								.collect(Collectors.toList());			//collect()
		System.out.println(evenNum);
		
		
		
		Set<Integer> sqaures =  marks.stream()
									.map((e)-> e*e)						//map()
									.collect(Collectors.toSet());
		System.out.println(sqaures);
		
		
		List<Integer> numbers = List.of(33, 55, 11, 88, 33, 11, 55);
		List<Integer> unique = numbers.stream()
									.distinct()							//distinct()
									.collect(Collectors.toList());
		System.out.println(unique);
		
		
		List<List<String>> nestedList = List.of(
						    List.of("A", "B"),
						    List.of("C", "D"));
		
		List<String> flatList = nestedList.stream()
			                               .flatMap(List::stream)		//flatMap()
			                               .collect(Collectors.toList());
		System.out.println(flatList);
		
		List<String> names = List.of("Alice", "Bob", "Charlie");
		names.stream()
		     .peek(name -> System.out.println("Processing: " + name))
		     .map(String::toUpperCase)
		     .forEach(System.out::println);
		
		List<Integer> numbers2 = List.of(1, 2, 3, 4, 5);
		List<Integer> limitedNumbers = numbers2.stream()
		                                       .limit(3)				//limit()
		                                       .collect(Collectors.toList());
		System.out.println(limitedNumbers);
		
		List<Integer> skippedNumbers = numbers2.stream()
		                					.skip(2)					//skip()
		                					.collect(Collectors.toList());
		System.out.println(skippedNumbers);
		
		
		//------------------------------------------------
		//numbers=[33, 55, 11, 88, 33, 11, 55]
		names.stream()
				.forEach(System.out::println);
		
		
		int sum  = numbers.stream()
						.reduce(0, (a,b)->a+b);
		System.out.println("Sum : "+ sum);
		
		long totalLeng = numbers.stream()
							.count();
		System.out.println(totalLeng);
		
		Optional<String> firstName = names.stream().findFirst();
		firstName.ifPresent(System.out::println);  // Output: Alice
		
		Optional<Integer> anyName = numbers.stream().findAny();
		anyName.ifPresent(System.out::println); // Output: Alice (or any element)
		
		boolean allPositive = numbers.stream().allMatch(e-> e>=0);;
		System.out.println("Is all number positive: " + allPositive);
		
		boolean is88Present =  numbers.stream().anyMatch(e -> e==88);
		System.out.println("Is any 88 number present? : " + is88Present);
		
		boolean isNegativeNum = numbers.stream().noneMatch(e -> e<0);
		System.out.println("Is any negative number not present? : "+ isNegativeNum);
		
		Optional<Integer> max =  numbers.stream().max(Integer::compareTo);
		System.out.println("max element: "+ max);

		Optional<Integer> min =  numbers.stream().min(Integer::compareTo);
		System.out.println("minelement: "+ min);
		
		
	
	}

}
