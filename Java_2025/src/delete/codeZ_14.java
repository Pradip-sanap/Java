package delete;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class codeZ_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
		
		
		//Partition numbers into even and odd
		Map<Boolean, List<Integer>> ans = numbers.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
		System.out.println(ans);
		
		
		//Partition numbers into even and odd , also count how many elements are generated
		Map<Boolean, Long> ans2 = numbers.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0, Collectors.counting()));
		System.out.println(ans2);
		
		
		List<String> names = List.of("Pradip", "Laxman", "Rohini", "Tai", "Aviraj", "Ashutosh");
		// find string who's first character is vowel
		Map<Boolean, List<String>> ans3 = names.stream().collect(Collectors.partitioningBy(name -> {
			char ch = Character.toLowerCase(((String)name).charAt(0));
			return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
		}));
		
		System.out.println(ans3);

	}

}
