package Locks;


import java.util.concurrent.locks.ReentrantLock;

public class FairUnfairLockDemo {
    private static ReentrantLock fairLock = new ReentrantLock(true);    // Fair lock
    private static ReentrantLock unfairLock = new ReentrantLock(false); // Unfair lock

    public static void main(String[] args) {
        // Test fair lock
        System.out.println("Testing fair lock:");
        for (int i = 1; i <= 5; i++) {
            new Thread(new Worker(fairLock), "Thread-Fair-" + i).start();
        }

        // Add a little pause before starting unfair lock demo
        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        // Test unfair lock
        System.out.println("\nTesting unfair lock:");
        for (int i = 1; i <= 5; i++) {
            new Thread(new Worker(unfairLock), "Thread-Unfair-" + i).start();
        }
    }

    static class Worker implements Runnable {
        private ReentrantLock lock;

        public Worker(ReentrantLock lock) {
            this.lock = lock;
        }

        public void run() { 
                lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + " acquired the lock.");
                } finally {
                    lock.unlock();
                }  
        }
    }
}
