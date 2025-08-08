package Java_Collections;
import java.util.*;
public class _02_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> var = new LinkedList<>();
		var.add(10);
		var.add(20);
		var.add(30);
		var.add(40);
		
		var.addFirst(5);
		var.addLast(50);
		
		var.add(5, 45);
		
		System.out.println(var);
		
		LinkedList<Integer> sar = new LinkedList<>();
		sar.addAll(var);
		sar.addAll(5,var);
		sar.addAll(var);
		System.out.println(sar);
		
		var.push(67);
		var.pop();
		

	}

}
