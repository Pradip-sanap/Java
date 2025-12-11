package ConcurrentCollections;

import java.util.concurrent.CopyOnWriteArraySet;

public class _02_CopyOnListArraySetDemo {

	public static void main(String[] args) {
		CopyOnWriteArraySet<Integer> c_set = new CopyOnWriteArraySet<Integer>();
		c_set.add(20);
		c_set.add(40);
		c_set.add(90);
		c_set.add(10);
		c_set.add(80);
		c_set.add(20);
		c_set.add(420);
		c_set.add(940);
		c_set.add(6);
		c_set.add(870);
		c_set.add(60);
		c_set.add(60);	//duplicate
		c_set.add(20);	//duplicate
		
		System.out.println(c_set);

	}

}
