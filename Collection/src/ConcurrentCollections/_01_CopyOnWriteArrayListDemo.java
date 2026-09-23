package ConcurrentCollections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class _01_CopyOnWriteArrayListDemo {
	
	public static String getRef(List<Integer> list) {
		return list.getClass().getName() + "@" + 
                Integer.toHexString(System.identityHashCode(list));
	}

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
		
		list.add(100);
		list.add(500);
		list.add(200);
		list.add(50);
		
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		
//		for(int e: arrList) {
//			if(e==2) {
//				arrList.add(99);		// concurrent modification exception 
//			}
//			System.out.println(e);
//		}
		
		
		for(int e: list) {
			if(e == 500) {
				list.add(600);
			}
			System.out.print(e +" ");
		}
		System.out.println(list);
		
		
		//-------------------------------------------
		// It used for read heavy operations.
		CopyOnWriteArrayList<Integer> evenNum = new CopyOnWriteArrayList<Integer>();
		
		evenNum.addAll(List.of(2, 4, 5, 6, 8, 10));
		System.out.println(evenNum);
		
		 

	}

}
