package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {


		ArrayList<String> names = new ArrayList<>();
		
		names.add("Ram");
		names.add("babu");
		names.add("shyam");

//		for(String name : names) {
//			System.out.println(name);
//			if(name.equals("babu")) {
//				names.add("lalu");				// Original list is modified during its in use. It throw ConcurrentModificationException
//			}
//		}
		
//		To avoid this, use CopyOnWriteArrayList
		List<String> names2 = new CopyOnWriteArrayList<>();
		
		names2.add("Ram");
		names2.add("babu");
		names2.add("shyam");

		for(String name : names2) {
			System.out.println(name);
			if(name.equals("babu")) {
				names2.add("lalu");				// Original list is modified during its in use. It throw ConcurrentModificationException
			}
		}
		
		System.out.println("List after modify: "+ names2);
	}

}
