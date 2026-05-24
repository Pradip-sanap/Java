package ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class project4 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// 1. Create ExecutorService with fixed thread pool
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
     // 2. Input numbers
        List<Integer> numbers = List.of(2, 4, 6, 8, 10);
        
        List<Future<Integer>> futures = new ArrayList<>();
        
        for(int num : numbers) {
        	System.out.println(num);
        	futures.add(
        			executor.submit(() -> {
		                System.out.println(
		                        "Calculating square of " + num +
		                        " by " + Thread.currentThread().getName()
		                );
		                Thread.sleep(500);
		                return num * num;
		            })
        	);
        }
        
        // 5. Collect results
        System.out.println("\nResults:");
        for (Future<Integer> future : futures) {
            System.out.println(future.get()); // blocks until result available
        }

        // 6. Shutdown executor
        executor.shutdown();

	}

}
