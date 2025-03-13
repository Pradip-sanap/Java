
public class question1 {
	private static int counter = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object look = new Object();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (look) {
					for (int i = 0; i < 10000; i++) {
						counter++;
					}
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (look) {
					for (int i = 0; i < 10000; i++) {
						counter++;
					}
				}

			}
		});
		
		
		t1.start();
		t2.start();
		
		
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("COunter==="+ counter);
	}

}
