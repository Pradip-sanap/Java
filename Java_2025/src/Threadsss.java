
public class Threadsss extends Thread{
	
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println(Thread.currentThread().getId() +"value"+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadsss t1 = new Threadsss();
		t1.start();
		Threadsss t2 = new Threadsss();
		t2.start();
		

	}

}
