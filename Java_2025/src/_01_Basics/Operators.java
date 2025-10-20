package _01_Basics;

public class Operators {

	public static void main(String[] args) {
		int a = 10;		//01010
		int b = 15;		//01111
		
		int c = a ^ b;
//		System.out.println(c);
//		System.out.println(Integer.toBinaryString(~b));
//		System.out.println(~a);
//		System.out.println(Integer.toBinaryString(~a));
//		boolean isJavaFun = true;
//		System.out.println(isJavaFun);
//		System.out.println(!isJavaFun);
		
		int x = 5;			//   101
		int y = x << 2;		// 10100
		System.out.println(y);
		System.out.println(Integer.toBinaryString(y));
		
		int z = y >> 2;
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));
		
		Integer p = 99;
		A aa = new A();
		B bb = new B();
		if(aa instanceof A ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		try {
		    Thread.sleep(1000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}

		Exception e;
		RuntimeException ee;

	}

}

class A {
	void show() {System.out.println("Class A");}
}
class B {
	void show() {System.out.println("Class B");}
}
