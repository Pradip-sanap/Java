package delete;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class code4 {

	public static void main(String[] args) {
		// Q. Given a list of integers, partition them
		// into even and odd numbers using partitioningBy()
		List<Integer> nums = List.of(8, 2, 5, 1, 5, 9, 11, 15, 19, 14);
		Map<Boolean, List<Integer>> ans = nums.stream().collect(Collectors.partitioningBy((e) -> e%2 == 0 ? true: false));
		
		System.out.println(ans);
		ans.forEach((k , v) -> { 
			if(k) {
				System.out.println(v);
				return;
			}
			System.out.println(v);
			
		});

	}

}
