package ConcurrentCollections;

import java.util.concurrent.ConcurrentLinkedQueue;

public class _03_ConcurrentLinkedQueue {

	public static void main(String[] args) {
		ConcurrentLinkedQueue<Integer> c_que = new ConcurrentLinkedQueue<Integer>();
		
		c_que.add(20);
		c_que.add(50);
		c_que.add(30);
		c_que.add(90);
		c_que.add(120);
		
		System.out.println(c_que);

	}

}
