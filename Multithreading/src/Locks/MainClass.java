package Locks;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bank = new BankAccount();
		Runnable task = new Runnable() {
			@Override
			public void run() {
				bank.withdrawal(50);
			}
		};
		
		Thread t1 = new Thread(task, "thread-1");
		Thread t2 = new Thread(task, "thread-2");
		
		t1.start();
		t2.start();

	}

}
