package Project3;

import java.util.List;

//print number from 1 to 20 in increasing order
//use 2 threads
class NumberPrinter {
	int number = 1;
	int max = 20;
	
	synchronized void printEven() throws InterruptedException {
		while(number <= max) {
			if(number % 2 ==0) {
				System.out.println(number);
				number++;
				notify();
			}else {
				wait();
			}
		}
	}
	
	synchronized void printOdd() throws InterruptedException {
		while(number <= max) {
			if(number % 2 !=0) {
				System.out.println(number);
				number++;
				notify();
			}else {
				wait();
			}
		}
	}
}

public class Demo {

	public static void main(String[] args) {
		NumberPrinter printer = new NumberPrinter();
		Thread oddThread = new Thread(()-> {
			try {
				printer.printOdd();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		 Thread evenThread = new Thread(() -> {
			try {
				printer.printEven();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		 
		 oddThread.start();
		 evenThread.start();

	}

}
