package delete_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class code_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[10];
		
		ArrayList<Integer> list = new ArrayList<Integer>(List.of(4, 2, 8, 5, 1, 9));
		
		List<Integer> even = Stream.iterate(2, n -> n <=10, n -> n+2).collect(Collectors.toList());
		
		System.out.println(even);
		
		int age =25;
		String a = String.valueOf(age);
		Integer valueOf = Integer.valueOf(a);
		
		List<String> names = List.of("PRadip", "Swapnil", "Harshal", "Shubham");
		StringBuilder sb = new StringBuilder();
		String stringName = names.stream().collect(Collectors.joining(""));
		System.out.println(stringName);
		
		

	}

}
