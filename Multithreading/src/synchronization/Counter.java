package synchronization;

public class Counter {
	int count = 0;
	
	public synchronized void increment() {
		count++;
	}
	
	int getCount() {
		return count;
	}

	 

}
