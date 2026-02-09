package ExecutorService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FailingTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Task running in: " +
                Thread.currentThread().getName());
        throw new RuntimeException("Something went wrong!");
    }
}

public class project3 {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		//1. execute method: no way to handle error or not return any value
        executor.execute(new FailingTask());
        
        
        

        //2. submit method: can return value and has ability to handle error
        Future<?> future = executor.submit(new FailingTask());

        try {
            future.get(); // exception comes here
        } catch (ExecutionException e) {
            System.out.println("Caught exception: " +
                    e.getCause().getMessage());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        executor.shutdown();

	}

}
