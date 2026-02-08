package Tut;

import java.util.ArrayList;
import java.util.List;

public class tut4 {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(80);
		marks.add(90);
		marks.add(84);
		marks.add(70);
		marks.add(81);
		marks.add(60);
		marks.add(98);
		
		marks.add(1, 88);
		System.out.println(marks);
//		marks.remove(2);
//		marks.removeAll(List.of(82, 98));
//		marks.removeIf(e -> e%2!=0);
//		marks.retainAll(List.of(90, 70, 98));
		
		System.out.println(marks);
		List<Integer> subList = marks.subList(2, 5);
		System.out.println(subList);
		
//		marks.forEach(e -> System.out.println(e * 99));
		Object[] array = marks.toArray();
	}

}
