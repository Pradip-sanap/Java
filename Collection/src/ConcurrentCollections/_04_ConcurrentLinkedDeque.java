package ConcurrentCollections;

import java.util.concurrent.ConcurrentLinkedDeque;

public class _04_ConcurrentLinkedDeque {

	public static void main(String[] args) {
		// same as ConcurrentLinkedQueue. Only diff is that it can add and remove elements from both ends.
		ConcurrentLinkedDeque<Integer> conc_deque = new ConcurrentLinkedDeque<Integer>();
		
		conc_deque.addFirst(100);
		conc_deque.addLast(200);
		
		conc_deque.getFirst();
		conc_deque.getLast();

		conc_deque.removeFirst();
		conc_deque.removeLast();
	}

}
