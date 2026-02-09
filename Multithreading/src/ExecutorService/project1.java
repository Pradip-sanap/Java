package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class project1 {

	public static void main(String[] args) {
		 // 1. Create a fixed thread pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
     // 2. Create and submit 5 tasks
        for (int i = 1; i <= 5; i++) {
            int taskNumber = i;

            executor.submit(() -> {
                System.out.println("Task " + taskNumber +
                        " executed by " +
                        Thread.currentThread().getName());

                try {
                    // Simulate work
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // 3. Shutdown the executor
        executor.shutdown();

	}

}
