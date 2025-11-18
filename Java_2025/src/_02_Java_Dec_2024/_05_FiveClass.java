package _02_Java_Dec_2024;

class One {
	final void multiply() {
		System.out.println("Multiply method.");
	}
}

class Two extends One {
	
//	void multiply() {
//		System.out.println();
//	}
}

final class Three {
	void display() {
		System.out.println("Class Three");
	}
}

//class Four extends Three{
//
//}

interface MyInterface1 {
	default void show() {
		System.out.println("Default method in interface!!!");
	}
	default void print() {
		System.out.println("hello");
	}
	static void display() {
		System.out.println("static method in interface !!!");
	}
}

class Five implements MyInterface1{
	
}

public class _05_FiveClass {
	
	final double PI;
	
	public _05_FiveClass() {
		this.PI = 0;
		
	}
	
	public static void main(String[] args) {
		
		MyInterface1 f = new Five();
		f.print();
		MyInterface1.display();
		
	}

}
