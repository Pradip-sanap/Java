package Thread;

public class _02_MyThread extends Thread{
	
	@Override
	public void run() {
		try {
			System.out.println("T1 working ");
			Thread.sleep(2000); 
			
			
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		_02_MyThread t1 = new _02_MyThread();
		System.out.println(t1.getState());
		
		t1.start();
		
		System.out.println("Priority of t1 :"+t1.getPriority());
		System.out.println(t1.getState());
//		currentThread().sleep(100);
		System.out.println(currentThread().getName());
//		System.out.println(Thread);
		
		t1.join();
		
		System.out.println("4->"+t1.getState());
		

	}

}
