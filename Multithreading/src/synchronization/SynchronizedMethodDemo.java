package synchronization;
class Counter2 {

    private int count = 0;

    // synchronized method
    public synchronized void increment1() {
        count++;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }
    
    
    
    
    
     
    private final Object lock = new Object();
    public void increment2() {
        // only critical section is locked
        synchronized (lock) {
            count++;
            System.out.println(Thread.currentThread().getName() +
                    " count = " + count);
        }

        // non-critical code (no lock)
        doSomeOtherWork();
    }

    private void doSomeOtherWork() {
        System.out.println("Non-synchronized work");
    }
}
public class SynchronizedMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
