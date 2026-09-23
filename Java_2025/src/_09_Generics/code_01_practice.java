package _09_Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//class
//method
//interface
//collection

class MyBox<T, U> {
	public T val1;
	public U val2;
	public MyBox(T val1, U val2) {
		super();
		this.val1 = val1;
		this.val2 = val2;
	}
	public T getVal1() {
		return val1;
	}
	public void setVal1(T val1) {
		this.val1 = val1;
	}
	public U getVal2() {
		return val2;
	}
	public void setVal2(U val2) {
		this.val2 = val2;
	}
	@Override
	public String toString() {
		return "Box [val1=" + val1 + ", val2=" + val2 + "]";
	}
}

class Printable {
	
	public <T> void printValue(List<T> values) {
		
		for(T value: values) {
			System.out.print(value + " ");
		}
		System.out.println();
		
	}
}

class Values<E>{
	
	ArrayList<E> list = new ArrayList<E>();
	
	
	public void setValues(ArrayList<E> list) {
		this.list = list;
	}


	void printThem() {
		list.forEach(e -> {
			System.out.print(e + " ");
		});
		System.out.println();
	}
}

public class code_01_practice {

	public static void main(String[] args) {
		MyBox<String, Character> obj = new MyBox("Hakuna", "A");
		System.out.println(obj);;
		
		MyBox<Integer, Boolean> obj2 = new MyBox(101, true);
		System.out.println(obj2);

		Printable p1Obj = new Printable();
		 
		p1Obj.printValue(List.of(99, 44, 22, 11, 88, 44));
		p1Obj.printValue(List.of("Pradip", "Shubham", "Roshan", "Harshit"));
		p1Obj.printValue(List.of('A', 'e', 'w', 'q', 'C', 'g'));
		
		
		
		Values<Integer> intValues = new Values<>();
		ArrayList<Integer> numm = new ArrayList<Integer>();
		numm.addAll(List.of(12, 43, 22, 65, 76, 87));
		intValues.setValues(numm);
		
		intValues.printThem();
		
		
		Values<String> stringValues = new Values<>();
		ArrayList<String> strings = new ArrayList<String>();
		strings.addAll(List.of("abc", "wer", "gfd", "hhh", "jjj"));
		stringValues.setValues(strings);
		
		stringValues.printThem();
		
	}

}
