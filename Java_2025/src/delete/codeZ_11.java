package delete;

import java.util.List;
import java.util.stream.Collectors;

public class codeZ_11 {

	public static void main(String[] args) {
		// 3 level nested flatmap problem
		List<List<List<Integer>>> numbers = List.of(
			    List.of(
			        List.of(1, 2),
			        List.of(3, 4)
			    ),
			    List.of(
			        List.of(5, 6),
			        List.of(7, 8)
			    )
			);
		
		//flat into single list
		List<Integer> singleList = numbers.stream().flatMap(secondList -> secondList.stream()).flatMap(thirdList->thirdList.stream()).collect(Collectors.toList());
		System.out.println(singleList);
		
		
	}

}
