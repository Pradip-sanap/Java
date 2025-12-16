package _11_NestedClasses;

import _11_NestedClasses.Outer.Inner;

class Outer{
	
	static int id = 101;
	String desc = "Outer class";
	
	static class Inner{
		void show() {
			System.out.println("Value"+ id);
//			System.out.println("Desc"+ desc);
		}
	}
}

public class _1_static_inner_class {

	public static void main(String[] args) {
		Outer.Inner obj = new Outer.Inner();
		obj.show();
		 

	}

}
