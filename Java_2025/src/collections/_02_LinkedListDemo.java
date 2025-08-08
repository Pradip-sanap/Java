package collections;

import java.util.LinkedList;

public class _02_LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		
//------1. List as Queue--------------------------------
		list.offerFirst(55);
		
		list.offer(66);		
		
		list.offerLast(77);
		
//		System.out.println(list.poll());
//		System.out.println(list.pollFirst());
//		System.out.println(list.pollLast());
		
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		
		System.out.println(list.toString());
		
//------2. LinkedList as stack---------------------------
		LinkedList<String> list2 = new LinkedList<>();
		list2.push("Pradip");
		list2.push("Laxman");
		list2.push("Sanap");
		
		list2.push(null);
		list2.push(null);
		list2.push(null);
		
		System.out.println(list2.toString());
		
		System.out.println(list2.pop());
		
		System.out.println(list2.toString());

	}

}
