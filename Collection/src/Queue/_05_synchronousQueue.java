package Queue;

import java.util.concurrent.SynchronousQueue;

 
public class _05_synchronousQueue {
    public static void main(String[] args) throws InterruptedException {
//        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
//        queue.add(11);
//        
//        System.out.println(queue);

        // Producer
//        new Thread(() -> {
//            try {
//                System.out.println("Producer waiting to hand off...");
//                queue.put("Hello from Producer");
//                System.out.println("Producer handed off message!");
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
//        }).start();
//
//        // Consumer
//        new Thread(() -> {
//            try {
//                Thread.sleep(2000); // simulate delay
//                String msg = queue.take();
//                System.out.println("Consumer received: " + msg);
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
//        }).start();
        
        
     // Producer threads
//        for (int i = 1; i <= 3; i++) {
//            int value = i;
//            new Thread(() -> {
//                try {
//                    System.out.println("Producer " + value + " trying to put " + value);
//                    queue.put(value);
//                    System.out.println("Producer " + value + " successfully handed off " + value);
//                } catch (InterruptedException e) {
//                    Thread.currentThread().interrupt();
//                }
//            }).start();
//        }
//
//        // Consumer threads
//        for (int i = 1; i <= 3; i++) {
//            new Thread(() -> {
//                try {
//                    int val = queue.take();
//                    System.out.println("Consumer got: " + val);
//                } catch (InterruptedException e) {
//                    Thread.currentThread().interrupt();
//                }
//            }).start();
//        }
    	
    	SynchronousQueue<Integer> queue = new SynchronousQueue<Integer>();
    	queue.put(10);
    
//    	queue.add(20);
//    	Thread.sleep(1000);
    	
    	Integer take = queue.take();
    	
//    	System.out.println(queue);
    	System.out.println(take);
    	
    	
    }
}
