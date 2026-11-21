package ArrayList;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Practice5 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		set.add(15);
		set.add(15);
		set.add(20);
		set.add(50);
		set.add(5);
		set.add(8);
		set.add(94);
		set.add(82);
		
//		System.out.println(set);
		
		Integer[] array = (Integer[]) set.toArray();
		System.out.println(Arrays.toString(array));

	}

}
