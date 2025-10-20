package Queue;

import java.util.ArrayDeque;
import java.util.Arrays;

public class _02_ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		deque.add(5);
		deque.addFirst(10);
		deque.addLast(20);
		
		deque.offer(105);
		deque.offerFirst(110);
		deque.offerLast(130);
		
		//----------------------
//		deque.remove(); 
//		deque.removeFirst();
//		deque.removeLast();
//		
//		deque.poll();
//		deque.pollFirst();
//		deque.pollLast();
		
		//------------------
//		deque.element();
//		deque.getFirst();
//		deque.getLast();
//		
//		deque.peek();
//		deque.peekFirst();
//		deque.peekLast();
		//-------------------
//		deque.clear();
//		System.out.println(deque.contains(105));
		
//		ArrayDeque<Integer> deque2 = new ArrayDeque<>();
//		deque2.add(10);
//		deque2.add(110);
//		System.out.println(deque.containsAll(deque2));  
		
//		deque.size();
//		Object[] arr=  deque.toArray();
//		System.out.println(Arrays.toString(arr));
//		
//		System.out.println(deque.isEmpty());;
		System.out.println(deque);
		

	}

}
