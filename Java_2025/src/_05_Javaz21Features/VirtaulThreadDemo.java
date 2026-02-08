package _05_Javaz21Features;

import java.io.IOException;
import java.util.stream.Stream;

public class VirtaulThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Main thread start ###");
		
		//start virtual thread
		Thread vt1 = Thread.startVirtualThread(() ->{ 
			Stream.iterate(1, n -> n<=10, n -> n+1)
				.forEach(e-> {
					System.out.println("VT1 : "+ e);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				});
		});
		
		//another way
		Thread vt2 = Thread.ofVirtual().name("MyVt2").start(()->{
			Stream.iterate(2, n -> n<=20, n -> n+2)
			.forEach(e-> {
				 System.out.println("VT2 : "+ e);
				 try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			});
		});
		
		
		System.out.println("Log 1");
		System.out.println("vt1 name: "+vt1.getName());
		System.out.println("vt2 name: "+vt2.getName());
		vt1.join();
		vt2.join();
		System.out.println("Log 2");
		
		
//		Thread.sleep(2000);
		System.out.println("Main thread end###");

	}

}
