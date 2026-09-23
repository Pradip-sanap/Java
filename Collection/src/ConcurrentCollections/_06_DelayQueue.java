package ConcurrentCollections;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;


class DelayedMessage implements Delayed {
    private final String message;
    private final long startTime; // when this message becomes available

    public DelayedMessage(String message, long delayMillis) {
        this.message = message;
        this.startTime = System.currentTimeMillis() + delayMillis;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = startTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed other) {
        return Long.compare(this.getDelay(TimeUnit.MILLISECONDS),
                            other.getDelay(TimeUnit.MILLISECONDS));
    }

    @Override
    public String toString() {
        return message;
    }
}

public class _06_DelayQueue {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedMessage> queue = new DelayQueue<>();

        queue.put(new DelayedMessage("Message 1 (2s delay)", 2000));
        queue.put(new DelayedMessage("Message 2 (5s delay)", 5000));
        queue.put(new DelayedMessage("Message 3 (1s delay)", 1000));

        System.out.println("Messages scheduled...");

        while (!queue.isEmpty()) {
            DelayedMessage msg = queue.take(); // waits until available
            System.out.println("Consumed: " + msg + " at " + System.currentTimeMillis());
        }
    }
}



