package collections;

import java.util.TreeSet;

public class _07_TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tset = new TreeSet<>();
		
		tset.add(40);
		tset.add(20);
		tset.add(80);
		tset.add(50);
		tset.add(60);
		
		TreeSet<Integer> tset2 = new TreeSet<>();
		tset2.add(22);
		tset2.add(33);
		tset.addAll(tset2);
		
		System.out.println(tset);
		
//		System.out.println(tset.first());
//		System.out.println(tset.last());
//		
//		System.out.println(tset.getFirst());
//		System.out.println(tset.getLast());
		
		System.out.println(tset.higher(22));		// element >= e
		System.out.println(tset.lower(22));			// element <= e
		
//		System.out.println(tset.floor(32));			// element < e
//		System.out.println(tset.ceiling(25));		// element > e
		
//		System.out.println(tset.headSet(40));
//		System.out.println(tset.tailSet(40));
		
//		System.out.println(tset.subSet(22, 60));
		
//		System.out.println(tset.descendingSet());
		
//		System.out.println(tset);
//		tset.pollFirst();
//		tset.pollLast();
		
		
		
		System.out.println(tset);

	}

}
