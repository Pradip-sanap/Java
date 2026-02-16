package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class project4 {

	public static void main(String[] args) {
		
		System.out.println("log 1");
		
		CompletableFuture<Integer> task = CompletableFuture.supplyAsync(()->{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(true) {
				return 10;
			}else {
				throw new RuntimeException("Something went wrong");
			}
		}).handle((result, error)->{
			if(error != null) {
				System.out.println("Error occured");
				return 0;
			}
			return result * 2;
		});
		
		System.out.println("log 2");
		System.out.println(task.join());
		System.out.println("log 3");
		
		System.out.println("Main terminated");

	}

}
