package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class _01_ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> subNumbers = new ArrayList<>();
		subNumbers.add(67);
		subNumbers.add(63);
		subNumbers.add(61);
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(80);
		numbers.add(82);
		numbers.add(0, 78);
		numbers.add(1, 79);
		numbers.add(3, 81);
		
//		numbers.addAll(2,  subNumbers);
		numbers.addAll(subNumbers);
		
		numbers.addFirst(50);
		numbers.addLast(50);
		
		System.out.println(numbers);
		System.out.println(numbers.remove(0));;
//		numbers.removeAll(subNumbers);
//		numbers.removeFirst();
//		numbers.removeLast();
//		numbers.removeIf(e -> e%2!=0);
		
//		numbers.set(3, 888);
		
//		numbers.clear();
//		System.out.println(numbers.isEmpty());
		
//		subNumbers.add(99);
//		System.out.println(numbers.containsAll(subNumbers));
		
//		System.out.println(numbers.get(2));
//		System.out.println(numbers.getClass());
//		System.out.println(numbers.getFirst());
//		System.out.println(numbers.getLast());
		
//		System.out.println(numbers.size());
//		System.out.println(numbers.indexOf(80));
		
//		System.out.println(
//				numbers.subList(2,  8)
//				);
		
//		System.out.println(numbers);
//		numbers.sort(null);
//		numbers.sort(Comparator.naturalOrder());
//		numbers.sort(Comparator.reverseOrder());
		
//		Object[] arr =  numbers.toArray();
//		System.out.println(Arrays.toString(arr));
		
//		numbers.forEach(e -> {
//			if(e%3==0) {
//				System.out.println(e +" ");
//			}
//		});
		
//		numbers.replaceAll(e -> e*2);			// modify original list
				
		
//		System.out.println(numbers.hashCode());
		System.out.println(numbers);
		
		
		ArrayList<Integer> myElements = new ArrayList<>();
		myElements.add(80);
		myElements.add(67);
		myElements.add(50);
		myElements.add(61);		
		numbers.retainAll(myElements);
//		System.out.println(numbers);

	}

}
