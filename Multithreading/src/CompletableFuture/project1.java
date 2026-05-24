package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class project1 {

	public static void main(String[] args) throws InterruptedException {
		
		CompletableFuture.runAsync(()->{
			System.out.println("Thread ->" + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).thenRun(()->{
			System.out.println("Thread completed its work");
		});
		
		
//		System.out.println("Task 1 completed!!!!\n\n");
		
		 
		
		//Compute 10 + 20 asynchronously
		CompletableFuture.supplyAsync(()->{
			System.out.println("Thread is working");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 40 + 9;
		}).thenApply((result)->{
			return Math.sqrt(result);
		}).thenAccept((result)->{
			System.out.println(result);
		});
		
		Thread.sleep(4000);
		System.out.println("Main Terminated");

	}

}
