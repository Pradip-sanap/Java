package Java_Collections;
import java.util.*;


public class _04_ArrayDeque {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> var = new PriorityQueue<>();
		var.add(44);
		var.add(55);
		var.add(66);
		
		System.out.println(var);
		
		System.out.println(var.poll());;
		
		
	}
}
