package ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class project5 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// 1. Create thread pool
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // 2. Create list of Callable tasks
        List<Callable<String>> tasks = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            int taskId = i;

            tasks.add(() -> {
                System.out.println(
                        "Executing Task-" + taskId +
                        " by " + Thread.currentThread().getName()
                );

                Thread.sleep(1000); // simulate work
                return "Result of Task-" + taskId;
            });
        }

        // 3. Submit all tasks and wait
        List<Future<String>> futures = executor.invokeAll(tasks);

        // 4. Process results
        for (Future<String> future : futures) {
            System.out.println(future.get());
        }

        // 5. Shutdown executor
        executor.shutdown();

	}

}
