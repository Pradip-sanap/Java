package ThreadsLearning;

import java.util.List;

class Task implements Runnable{
	private String description;
	
	Task(String desc){
		this.description = desc;
	}
	
	public void run() {
		for(int i=1; i<11; i++) {
			System.out.println("Thread "+Thread.currentThread().getName()+" : "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class practice {

	public static void main(String[] args) {

		Task  task = new Task("Wake up 7 am");
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		t1.start();
		t2.start();
		
		

	}

}
