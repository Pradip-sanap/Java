package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _03_PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		minHeap.add(50);
		minHeap.add(30);
		minHeap.add(40);			//<----add()
		minHeap.add(90);
		minHeap.add(70);
		minHeap.add(80);
		minHeap.add(10);
		System.out.println(minHeap);
		 
		PriorityQueue<Integer> heap2 = new PriorityQueue<>();
		heap2.add(70);
		heap2.add(50);
		heap2.add(80);
		heap2.add(40);
		heap2.add(90);
		heap2.add(20);
		heap2.add(10);
		heap2.add(95);
//		System.out.println(heap2);
		
//		minHeap.addAll(heap2);      //<-------allAll()
		
		System.out.println(minHeap.element()); 		//<----return Head element
		
		minHeap.offer(75);
		
		minHeap.remove();
		minHeap.poll();
		
		minHeap.element();
		minHeap.peek();
		
		minHeap.size();
		minHeap.clear();
		minHeap.isEmpty();
		
		minHeap.contains(75);
		
		
		
		System.out.println(minHeap);
		
		
		// Max-heap
		PriorityQueue<Integer>  maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
		maxHeap.add(40);
		maxHeap.add(20);
		maxHeap.add(80);
		maxHeap.add(10);
		maxHeap.add(90);
		maxHeap.add(30);
		maxHeap.add(70);
		
		System.out.println("max Heap : "+maxHeap);

	}

}
