package delete;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(
			    5, 5, 10, 15, 10, 20, 25, 15, 30, 5, 35
			);
		
		List<Integer> ans = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(ans);
		
		Set<Integer> ans2 = numbers.stream().collect(Collectors.toSet());
		System.out.println(ans2);

	}

}
