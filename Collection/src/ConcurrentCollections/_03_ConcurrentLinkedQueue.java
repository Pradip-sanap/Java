package ConcurrentCollections;

import java.util.concurrent.ConcurrentLinkedQueue;

public class _03_ConcurrentLinkedQueue {

	public static void main(String[] args) {
		// Thread safe, used for multi-threaded environment
		// Does not used Synchronization or Locking technique. It used Campare and Swap technique for concurrency.
		// Non-blocking -> Threads does not wait if its full / Empty, return null immediately.
		// Unbounded -> Grow and shrink dynamically at runtime.
		
		ConcurrentLinkedQueue<Integer> concurrent_que = new ConcurrentLinkedQueue<Integer>();
		concurrent_que.add(500);
		concurrent_que.add(79); 
		concurrent_que.add(105);
		concurrent_que.add(180);
		concurrent_que.add(250);

		System.out.println(concurrent_que);
		System.out.println(concurrent_que.size());
		
		System.out.println(concurrent_que.remove());
		System.out.println(concurrent_que);
		
		System.out.println(concurrent_que.remove(105));
		System.out.println(concurrent_que);


	}

}
