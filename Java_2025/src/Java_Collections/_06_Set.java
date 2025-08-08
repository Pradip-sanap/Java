package Java_Collections;

import java.util.*;

public class _06_Set {
	public static void main(String[] args) {
		
		HashSet<Integer> num = new HashSet<>();
		
		num.add(10);
		num.add(50);
		num.add(30);
		num.add(80);
		num.add(20);
		
		System.out.println(num);
		
		num.add(70);
		
		System.out.println(num);
		
		
		boolean var = num.contains(34);
		System.out.println(var);
		
		HashSet<Integer> num1 = new HashSet<>();
		num1 = (HashSet)num.clone();
		
		
		System.out.println(num1);
		
		System.out.println(num.equals(num1));;
		
//		LinkedHashSet<Integer> set  = new LinkedHashSet<>();
		
		
//		TreeSet<Integer> tree =  new TreeSet<>();
//		tree.add(10);
//		tree.add(70);
//		tree.add(20);
//		tree.add(10);
//		tree.add(80);
//		tree.add(90);
//		tree.add(60);
//		tree.add(50);
//		
//		System.out.println(tree);
//		
//		System.out.println(tree.ceiling(54));;
//		
//		System.out.println(tree.floor(54));;
//		
//		System.out.println(tree.descendingSet());;
//		System.out.println(tree);
//		
//		System.out.println(tree.first());
//		
//		System.out.println(tree.last());
//		
//		System.out.println(tree.higher(61));
//		
//		tree.remove(55);
//		System.out.println(tree);
		
		
		
	}
}
