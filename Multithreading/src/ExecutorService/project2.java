package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class project2 {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		executor.submit(()-> logEvent("Task A"));
		executor.submit(()-> logEvent("Task B"));
		executor.submit(()-> logEvent("Task C"));
		
		executor.shutdown();

	}
	
	private static void logEvent(String taskName) {
        System.out.println(
                taskName + " executed by " +
                Thread.currentThread().getName()
        );
    }

}
