package CompletableFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;

 

public class project2 {

	public static void main(String[] args) {
		// exception handling in complatetableFuture
		
		CompletableFuture<Void> future =
		        CompletableFuture.supplyAsync(() -> {
		            if (false) {
		                throw new RuntimeException("Something went wrong");
		            }
		            return 10;
		        })
		        .exceptionally(ex -> {
		            System.out.println("Error: " + ex.getMessage());
		            return 0; // fallback
		        }).thenAccept((result)->{
		        	System.out.println("result->"+result);
		        })
		        ;

		System.out.println(future.join()); // 0
		

	}

}
