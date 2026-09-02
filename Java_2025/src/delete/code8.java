package delete;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class code8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> numbers = IntStream.rangeClosed(1, 1_000_000)
	                .boxed()
	                .toList();
		 
		 System.out.println(numbers.size());
		 
		 int sum = numbers.stream().mapToInt(i -> i).sum();
		 System.out.println(sum);
		 
		 OptionalDouble average = numbers.parallelStream().mapToInt(i -> i).average();		 
		 System.out.println(average.getAsDouble());
	}

}
