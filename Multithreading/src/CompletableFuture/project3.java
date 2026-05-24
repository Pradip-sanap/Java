package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class project3 {

	public static void main(String[] args) {
		CompletableFuture<Object> fastest =
		        CompletableFuture.anyOf(
		                CompletableFuture.supplyAsync(() -> {
							try {
								return slowService();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							return null;
						}),
		                CompletableFuture.supplyAsync(() -> {
							try {
								return fastService();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							return null;
						})
		        );

		System.out.println(fastest.join());

		

	}
	
	static String slowService() throws InterruptedException {
	    Thread.sleep(1000);
	    return "slow";
	}

	static String fastService() throws InterruptedException {
	    Thread.sleep(200);
	    return "fast";
	}

}
