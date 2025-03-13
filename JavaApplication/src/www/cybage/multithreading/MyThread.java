package www.cybage.multithreading;

class FirstThread implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10; i++) {
			System.out.println("Thread 1111111111->" + i);
			
		} 
	} 
}

class SecondThread extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=10; i++) {
			System.out.println("Thread 222222222->" + i); 
		} 
	} 
}

public class MyThread {

	public static void main(String[] args) {
		
		FirstThread t1 = new FirstThread();
		SecondThread t2 = new SecondThread();
		Thread thread1 = new Thread(t1); 
		
		thread1.start();
		t2.start();

	}

}
