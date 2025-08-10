
package Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _05_HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hset = new HashSet<>();
		hset.add(10);
		hset.add(30);
		hset.add(50);
		hset.add(70);
		
		hset.add(30);	// duplicates not allowed
		
		HashSet<Integer> hset2 = new HashSet<>();
		hset2.add(20);
		hset2.add(30);
		hset2.add(40);
		hset2.add(50);
		
		hset.addAll(hset2);
		System.out.println(hset);
		
		System.out.println(hset.contains(70));
		
		System.out.println(hset.containsAll(hset2));
		
		ArrayList<Integer> arr = new ArrayList<>();
		hset.forEach(e ->{
			arr.add(e * 2);
		});
		System.out.println(arr.toString());
		
		System.out.println(hset.isEmpty());
		
		System.out.println(hset.toString());
		
		hset.remove(20);
		
		System.out.println(hset);		
		
		for(Integer e: hset) {
			System.out.println(e);
		}

	}

}
