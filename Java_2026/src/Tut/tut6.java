package Tut;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class tut6 {

	public static void main(String[] args) {
		PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
		queue.addAll(List.of(1, 6, 3, 9, 2));
		System.out.println(queue);
		
		while(!queue.isEmpty()) {
			
			Integer top = queue.remove();
			System.out.println(top);
		}
		System.out.println(queue);
		
		

	}

}
