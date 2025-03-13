package www.cybage.multithreading;

class ClassOne{
	int n;
	synchronized public void produce(int n) {
		this.n = n;
		System.out.println("Produced: " + this.n);
	}
	
	synchronized public int consume() {
		System.out.println("Consumed: " + this.n);
		return this.n;
	}
}

class Producer extends Thread{
	ClassOne p;
	Producer(ClassOne p){
		this.p = p;
	}
	public void run() {
		int i=1;
//		while(true) {
//			
//			
//		}
	}
}

public class ProducerConsumer {
	
	public static void main() {
		
	}

}
