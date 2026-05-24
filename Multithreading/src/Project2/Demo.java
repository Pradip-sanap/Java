package Project2;

import java.util.LinkedList;
import java.util.Queue;

class Buffer {
	private Queue<Integer> buffer;
	private int capacity;
	
	public Buffer(int c) {
		this.capacity = c;
		this.buffer = new LinkedList<Integer>();
	}
	
	public synchronized void produce(int item) throws InterruptedException {
		while(buffer.size() == capacity) {
			System.out.println(Thread.currentThread().getName() + " Producer waiting (Buffer Full)");
			wait();
		}
		buffer.add(item);
		System.out.println("Produced: "+ item);
		notifyAll();
		
	}
	
	public synchronized void consume() throws InterruptedException {
		while(buffer.isEmpty()) {
			System.out.println(Thread.currentThread().getName() + " Producer waiting (Buffer Full)");
			wait();
		}
		Integer itemconsumed = buffer.remove();
		System.out.println("Consumed: "+ itemconsumed);
		notifyAll(); 
	}
	
}

class Producer implements Runnable{
	private Buffer buffer;
	Producer(Buffer buffer){
		this.buffer = buffer;
	}
	public void run() {
		try {
            for (int i = 1; i <= 10; i++) {
                buffer.produce(i);  		// Produce items 1 to 10
                Thread.sleep(1000);  		// Simulate time taken to produce an item
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
class Consumer implements Runnable {
    private Buffer buffer; 
    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }
 
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.consume();  			// Consume items
                Thread.sleep(5000);  		// Simulate time taken to consume an item
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		Buffer buffer = new Buffer(5);  // Create buffer with capacity 5

        Thread producerThread = new Thread(new Producer(buffer), "Producer");
        Thread consumerThread = new Thread(new Consumer(buffer), "Consumer"); 
        // Start the threads
        producerThread.start();
        consumerThread.start();

	}

}
