package ThreadsLearning;


public class _01_ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Word w = new Word();
		w.start();
		
		Sentense s = new Sentense();
		Thread t1 = new Thread(s);
		t1.start();
		
		for(int i=0; i<100000; i++) {
			System.out.println("Hello");
		}

	}

}
