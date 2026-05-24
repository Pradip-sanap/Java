package CompletableFuture;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Log 1");
		
		CompletableFuture.supplyAsync(() -> {
            System.out.println("Running in: " +
                    Thread.currentThread().getName());
            return 10;
        })
        .thenApply(result -> result * 2)
        .thenAccept(finalResult ->
                System.out.println("Result: " + finalResult)
        );

		System.out.println("Main thread continues..."); 
		
		System.out.println("Log 2");
		
		 
		System.out.println("Thread ->"+ Thread.currentThread().getName());
		Thread.sleep(2000);
		
		System.out.println("Program Terminated!!!");
		

	}

}
