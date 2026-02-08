package Queue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedTask implements Delayed {
  private String name;
  private long expirationTime; // in milliseconds    
  public DelayedTask(String name, long delayMillis) {
    this.name = name;
    this.expirationTime = System.currentTimeMillis() + delayMillis;
  }
  
  @Override 
  public long getDelay(TimeUnit unit) {
    long remainingDelay = expirationTime - System.currentTimeMillis();
    return unit.convert(remainingDelay, TimeUnit.MILLISECONDS);
  }
  
  @Override  
  public int compareTo(Delayed other) {
    long otherExpirationTime = ((DelayedTask) other).expirationTime;
    return Long.compare(this.expirationTime, otherExpirationTime);
  }
  public String getName() {
    return name;
  }
}

public class _06_DelayQueue {
  public static void main(String[] args) throws InterruptedException {
    DelayQueue < DelayedTask > queue = new DelayQueue < > ();
    queue.put(new DelayedTask("Task A", 3000)); // 3-second delay        
    queue.put(new DelayedTask("Task B", 1000)); // 1-second delay        
    queue.put(new DelayedTask("Task C", 5000)); // 5-second delay        
    while (!queue.isEmpty()) {
      DelayedTask task = queue.take(); // Blocks until a task's delay expires            
      System.out.println("Processing: " + task.getName());
    }
  }
}
