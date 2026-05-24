package _02_Java_Dec_2024;

import java.util.ArrayList;
import java.util.Iterator;

public class _12_iterator {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(48);
		list.add(32);
		list.add(53);
		list.add(13);
		list.add(84);
		list.add(78);
		list.add(90);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer value = itr.next();
			if(value==53) {
				list.set(list.indexOf(value), value - 3);
			}
			System.out.println(value);
		}
		
		System.out.println(list);

	}

}
