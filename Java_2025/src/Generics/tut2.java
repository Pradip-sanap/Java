package Generics;

import java.util.Arrays;
import java.util.List;

class Boxx<T>{
	private int id;
	String name;
	T price;
	
	void setPrice(T price){
		this.price = price;
	}
}

class Box3{
	
	<T> void foo(T price) {
		T temp = price;
		System.out.println(temp);
	}
	
	void printList(List<? super Integer> marksList) {
		System.out.println(marksList.toString());
	}
}
public class tut2 {

	public static void main(String[] args) {
		
		Boxx<Integer> bb = new Boxx();
		bb.setPrice(10);
		
		
		Box3 b = new Box3();
		b.foo(10);
		b.foo(10.99);
		b.foo("10");
		
		b.printList(Arrays.asList(1, 2, 3, 4, 7, 37.33, new Object())); 
		
		
//		List<Integer> l = List.of(10, 12, 32, 's', true, "kdsfa");
//		System.out.println(l);
		
		

	}

}
