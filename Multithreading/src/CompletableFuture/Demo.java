package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Log 1");
		
		CompletableFuture
        .supplyAsync(() -> {
            System.out.println("Running in: " +
                    Thread.currentThread().getName());
            return 10;
        })
        .thenApply(result -> result * 2)
        .thenAccept(finalResult ->
                System.out.println("Result: " + finalResult)
        );

		System.out.println("Main thread continues...");
		try { Thread.sleep(1000); } catch (Exception e) {}
		
		System.out.println("Log 2");

	}

}
