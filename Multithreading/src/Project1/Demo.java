package Project1;

class BankAccount{
	private double balance;
	
	public BankAccount(double balance) {
        this.balance = balance;
    }
	
	void deposit(double amount) {
		balance += amount;
	}
	
	public synchronized void withdrawal(double amount) throws InterruptedException {
		if(balance-amount < 0) {
			System.out.println("Insufficient balance");;
			return;
		}
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
	}
	
	public double getBalance() {
        return balance;
    }
	
}

class WithdrawTask implements Runnable{
	private BankAccount account;
	private double amount;
	WithdrawTask(BankAccount a, double amount){
		this.account = a;
		this.amount = amount;
	}
	public void run() {
		try {
			account.withdrawal(amount);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Demo {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
		
        Thread thread1 = new Thread(new WithdrawTask(account, 300), "Thread-1");
        Thread thread2 = new Thread(new WithdrawTask(account, 500), "Thread-2");
        Thread thread3 = new Thread(new WithdrawTask(account, 200), "Thread-3");
        Thread thread4 = new Thread(new WithdrawTask(account, 100), "Thread-4");
        
     // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        
     // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
     // Print final balance
        System.out.println("Final balance: " + account.getBalance());

	}

}
