package Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
	private final Lock lock = new ReentrantLock();
	
	public void outerMethod() {
		lock.lock();
		try {
			System.out.println("Outer method");
			innerMethod();
		} catch (Exception e) {
			lock.unlock();
		}
	}
	
	public void innerMethod() {
		lock.lock();
		try {
			System.out.println("inner method");
			
			
		} catch (Exception e) {
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
