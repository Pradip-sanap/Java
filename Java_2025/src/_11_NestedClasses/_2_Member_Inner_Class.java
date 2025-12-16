package _11_NestedClasses;

import _11_NestedClasses.Outer1.Inner;

class Outer1{
	static int id = 101;
	String desc = "Outer class";
	
	class Inner{
		void show() {
			System.out.println("Value"+ id);
			System.out.println("Desc"+ desc);
		}
	}
}

public class _2_Member_Inner_Class {

	public static void main(String[] args) {
		
		Outer1 obj = new Outer1();
		Outer1.Inner inner = obj.new Inner();
		
		inner.show();
		
	}

}
