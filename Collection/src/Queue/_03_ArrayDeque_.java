package Queue;

import java.util.ArrayDeque;

public class _03_ArrayDeque_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		
		queue.push(10);;
		queue.push(20);
		queue.push(30);
		queue.push(40);

		System.out.println(queue);
	}

}
