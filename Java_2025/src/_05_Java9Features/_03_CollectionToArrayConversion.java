package _05_Java9Features;

import java.util.Arrays;
import java.util.List;

public class _03_CollectionToArrayConversion {

	public static void main(String[] args) {

		List<Integer> list = List.of(11, 43, 27, 6,4, 77, 45, 76);
		
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));

	}

}
