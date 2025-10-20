package Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class _04_ArrayBlockingQueue {

	public static void main(String[] args) {
//		BlockingQueue<Integer> pipe = new ArrayBlockingQueue<Integer>(10);
//		pipe.add(20);
//		pipe.add(10);
//		pipe.add(90);
//		pipe.add(110);
//		pipe.add(220);
//		pipe.add(420);
//		pipe.add(1);
//		pipe.add(77);
//		pipe.add(92);
//		pipe.add(38);
//
//		System.out.println(pipe);

		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

		Runnable producer = () -> {
			try {
				for (int i = 1; i <= 10; i++) {
					queue.put(i); // blocks if full
					System.out.println("Produced: " + i);
					Thread.sleep(200);
				}
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		};

		Runnable consumer = () -> {
			try {
				for (int i = 1; i <= 10; i++) {
					int value = queue.take(); // blocks if empty
					System.out.println("Consumed: " + value);
					Thread.sleep(200); // simulate processing
				}
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		};

		new Thread(producer).start();
		new Thread(consumer).start();
	}

}
