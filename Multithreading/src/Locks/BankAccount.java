package Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	
	private int balance = 50;
	
	private final Lock key = new ReentrantLock();
	public void withdrawal(int amount) {
		
		System.out.println(Thread.currentThread().getName()+" attempt to withdraw "+ amount);
		
		try {
//			key.lock();
			if(key.tryLock(1000, TimeUnit.MILLISECONDS)){
				if(balance>=amount) {
					System.out.println(Thread.currentThread().getName() +" procedding with withdrawal");
					try {
						balance -= amount;
						Thread.sleep(5000);
						System.out.println(Thread.currentThread().getName()+"Remaining balance = "+balance);
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					} finally {
						key.unlock();
					}
					
				}else {
					System.out.println(Thread.currentThread().getName()+" insufficient balance");
				}		
			}else {
				System.out.println(Thread.currentThread().getName()+"Could not get cpu");
			}
			
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
	
	



}
