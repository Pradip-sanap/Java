package ConcurrentCollections;

import java.util.concurrent.ArrayBlockingQueue;

public class _05_ArrayBlockingQueue {

	public static void main(String[] args) throws InterruptedException {
		// Thread safe
		// Blocking -> Threads are get block when queue get full or empty. 
		// Bounded -> As it internally used array, need to defined its capacity in start only.
		// Mostly used for consumer-producer problems.
		
		ArrayBlockingQueue<Integer> blocking_queue = new ArrayBlockingQueue<Integer>(100);
		
		Runnable producer = () -> {
			try {
                for (int i = 1; i <= 10; i++) {
                	blocking_queue.put(i); // blocks if full
                	Thread.sleep(1000);
                    System.out.println("Produced: " + i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
		};
		
		
		Runnable consumer = () -> {
            try {
                for (int i = 1; i <= 7; i++) {
                    int value = blocking_queue.take(); // blocks if empty
                    System.out.println("Consumed: " + value);
                    Thread.sleep(2000); // simulate processing
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };
        
        System.out.println(blocking_queue);
        
        
        Thread t1 = new Thread(producer);
        t1.start();
        Thread t2 = new Thread(consumer);
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println(blocking_queue);

        
	}

}
