package Thread;

import java.util.Iterator;

class Sentense implements Runnable{
	@Override
	public void run() {
		
		for(int i=0; i<100000; i++) {
			System.out.println("Sentense ***********&&&&&&&&&&&&&&&************");
		}
	}
}

public class Word extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100000; i++) {
			System.out.println("word------------------------->");
		}
	}
}

