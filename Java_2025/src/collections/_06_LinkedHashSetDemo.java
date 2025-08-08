package collections;

import java.util.LinkedHashSet;

public class _06_LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer> lset = new LinkedHashSet<>();
		lset.add(10);
		lset.add(20);
		lset.add(30);
		lset.add(40);
		
		LinkedHashSet<Integer> lset2 = new LinkedHashSet<>();
		lset2.add(50);
		lset2.add(40);		// duplicates not allowed
		lset.addAll(lset2);
		
		lset.addFirst(111);
		lset.addLast(222);
		
		System.out.println(lset.getFirst());;
		System.out.println(lset.getLast());;
		
//		lset.clear();
		
		lset.contains(30);
		lset.containsAll(lset2);
		
		lset.forEach(null);
		
		
		
		System.out.println(lset);

	}

}
