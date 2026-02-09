package ExecutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class UserService {
    String getUser() throws InterruptedException {
        Thread.sleep(1000);
        return "User-Data";
    }
}

class OrderService {
    String getOrders() throws InterruptedException {
        Thread.sleep(2000);
        return "Order-Data";
    }
}

class PaymentService {
    String getPayments() throws InterruptedException {
        Thread.sleep(1200);
        return "Payment-Data";
    }
}

public class Demo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newFixedThreadPool(5);
		log("Log 1");
		
		UserService userService = new UserService();
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();
        log("log 2");

        Callable<String> userTask = () -> userService.getUser();
        Callable<String> orderTask = () -> orderService.getOrders();
        Callable<String> paymentTask = () -> paymentService.getPayments();
        log("log 3");
        
        Future<String> userFuture = executor.submit(userTask);
        Future<String> orderFuture = executor.submit(orderTask);
        Future<String> paymentFuture = executor.submit(paymentTask);
        log("log 4");

        // wait for results
        String user = userFuture.get();
        String orders = orderFuture.get();
        String payments = paymentFuture.get();
        log("log 5");

        System.out.println("Combined Response:");
        System.out.println(user);
        System.out.println(orders);
        System.out.println(payments);
        log("log 6");

        executor.shutdown();
        log("log 7");
	}
	
	
	
	
	
	
	static void log(String mesg) {
		System.out.println(mesg);
	}

}
