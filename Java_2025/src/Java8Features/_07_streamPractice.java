package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _07_streamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(8, 4, 2, 9, 1, 7,5);
		List<Integer> evenNum = list.stream()
									.filter(e -> e%2 == 0)
									.collect(Collectors.toList());
		
		System.out.println(evenNum);
		
		System.out.println(list.stream().reduce(0, (a, b)-> a+b));
		System.out.println(list.stream().count());
		
		
		List<Integer> mulitplyBy10 = list.stream().map(e -> e*10).collect(Collectors.toList());
		System.out.println(mulitplyBy10);
		
		List<Integer> numbers = List.of(33, 55, 11, 88, 33, 11, 55);
		List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		List<List<String>> nestedList = List.of(
			    List.of("A", "B"),
			    List.of("C", "D"));
		System.out.println(nestedList.stream().flatMap(List::stream).collect(Collectors.toList()));;

	}

}
