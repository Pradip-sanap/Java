package packageTwo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

abstract class Notebook {
	abstract void showTitle();
}

class Book {
	int bookId;
	String bookName;
	
	final void giveBookDetails() {
		System.out.println("");
	}
}

public class temp extends Book{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Integer> list = new ArrayList<Integer>();
		list.add(55);
		
		list = new LinkedList<Integer>();
		
		
		List<Integer> mygrade = new ArrayList();
		
		mygrade.add(55); 
		System.out.println(mygrade);
		
	}

}
