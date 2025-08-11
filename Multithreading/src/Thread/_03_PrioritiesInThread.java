package Thread;

class Upload extends Thread{
	@Override
	public void run() {
		int count=0;
		for(int i=0; i<10; i++) {
			count+=i;
			System.out.println(currentThread().getName()+" : "+ currentThread().getPriority());
			try {
                Thread.sleep(300); // pause to make output easier to read
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}


	}
}

class Monitoring extends Thread{
	@Override
	public void run() {
		System.out.println("Deamon thread monitoring");
	}
}
public class _03_PrioritiesInThread {

	public static void main(String[] args) {
		
		Monitoring m = new Monitoring();
		m.setDaemon(true);
		m.start();
	

		Upload t1 = new Upload();
		Upload t2 = new Upload();
		Upload t3 = new Upload();
		
		t1.setName("one");
		t2.setName("two");
		t3.setName("three");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
