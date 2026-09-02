package delete;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class code1 {

	public static void main(String[] args) {
		List<Integer> nums = List.of(1 );
		
		Integer ans = nums.stream().reduce(0, (a, b)-> a+b);
		System.out.println(ans);
		
		Integer ans2 = nums.stream().collect(Collectors.summingInt(i-> i));
		IntSummaryStatistics collect = nums.stream().collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(ans2);
		System.out.println(collect);
		
		OptionalDouble average = nums.stream().mapToInt(i -> i).average();
		System.out.println(average.getAsDouble());
		
		//find min and max
		OptionalInt max = nums.stream().mapToInt(i->i).max();
		System.out.println(max.getAsInt());
		
		//find second smallest and largest number in list
		  List<Integer> ans3 = nums.stream().sorted().skip(1).limit(1).collect(Collectors.toList());
		  Optional<Integer> ans33 = nums.stream().sorted().skip(1).findFirst();
		 System.out.println(ans3);
		 System.out.println(ans33.get());
		 
		 List<Integer> ans4 = nums.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).collect(Collectors.toList());
		 System.out.println(ans4);
	}

}
