package Java_Collections;
import java.util.*;

public class collection {
	
	public static void main(String[] arg) {
		
//		int[] arr = new int[10];
//		
//		for(int i=0; i<10; i++) {
//			arr[i] = i;		
//		}
//		
//		for(int e:arr) {
//			System.out.println(e);
//		}
		
		ArrayList<Integer> mark = new ArrayList<>();
		mark.add(30);
		mark.add(20);
		mark.add(80);
		mark.add(50);
		mark.add(10);
		mark.add(40);
		
//		System.out.println(mark);
//		Collections.sort(mark);
//		Collections.shuffle(mark);
//		int search  = Collections.binarySearch(mark, 50);		// requires sorted array
		
//		Collections.fill(mark, 4);
		
//		ArrayList<Integer> perc = new ArrayList<>();
//		perc.addAll(mark);
//		System.out.println(perc);
//		perc.replaceAll(q->q/100);
//		System.out.println(perc);
//		
//		Collections.copy(perc, mark);		// both source and dest have same size 
//		System.out.println(perc);
		
		System.out.println(mark);
		Collections.swap(mark, 1,5);
		System.out.println(mark);
		
		System.out.println(mark);
		
		mark.add(50);
		mark.add(90);
		mark.add(50);
		
		System.out.println(mark);
		
		int freq = Collections.frequency(mark, 50);
		System.out.println(freq);
		
		Collections.replaceAll(mark, 50, 53);
		
		System.out.println(mark);
		
		ArrayList<Integer> var = new ArrayList<>();
		for(int i=0; i<10; i++) {
			var.add(i);
		}
		
		System.out.println(var);
		Collections.rotate(var, 5);
		System.out.println(var);
		
		
	}
}
