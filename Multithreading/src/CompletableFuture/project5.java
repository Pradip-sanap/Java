package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class project5 {

	public static void main(String[] args) {
		CompletableFuture<Integer> task = CompletableFuture.supplyAsync(()->{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 10;
		}).thenCompose((id)->{
			return fetchDataAsync(id);
		});
		
		System.out.println(task.join());
		
		//-----------------------------------------------------------
		
		CompletableFuture<Integer> f1 =
		        CompletableFuture.supplyAsync(() -> 10);

		CompletableFuture<Integer> f2 =
		        CompletableFuture.supplyAsync(() -> 20);

		CompletableFuture<Integer> combined =
		        f1.thenCombine(f2, (a, b) -> a + b);

		System.out.println(combined.join()); // 30

	}
	
	
	static CompletableFuture<Integer> fetchDataAsync(int id) {
	    return CompletableFuture.supplyAsync(() -> id * 2);
	}

}
