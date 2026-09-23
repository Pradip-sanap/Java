package ConcurrentCollections;

import java.util.concurrent.SynchronousQueue;

public class _07_SynchronousQueue {

	public static void main(String[] args) {
		SynchronousQueue<String> sync_queue = new SynchronousQueue< >();


		// Producer
        new Thread(() -> {
            try {
                for(int i=0; i < 10; i++) {
                	sync_queue.put("Hello from Producer "+ i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();

        // Consumer
        new Thread(() -> {
            try {
            	for(int i=0; i < 10; i++) {
            		Thread.sleep(2000); // simulate delay
                    String msg = sync_queue.take();
                    System.out.println("Consumer received: " + msg);
                }
                
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();

		
		

	}

}
