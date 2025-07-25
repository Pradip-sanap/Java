import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraylistLearning {
	
	static void print(List<Integer> arr) {
		for(int e: arr) {
			System.out.print(e + " ");
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrls = new ArrayList<>();
		arrls.add(50);
		arrls.add(20);
		arrls.add(80);
		arrls.add(10);
		arrls.add(90);
		arrls.add(30);
//		arrls.add(3, 999);
		
		
		
//		arrls.sort((a, b)-> a-b);
//		arrls.clear();
		arrls.addFirst(888);
		arrls.addLast(777);
		
		System.out.println(arrls.contains(67));;
		
//		ArrayList<Integer> arr2 = new ArrayList<>();
//		arr2.add(50);
		
//		arr2.add(20);
//		arr2.add(80);
//		arr2.add(10);
//		arr2.add(90);
//		arr2.add(30); 
//		System.out.println(arrls.containsAll(arr2));;
		
		System.out.println(arrls);
		arrls.sort(Comparator.naturalOrder());
	 
		print(arrls);
		
//		Object[] arr = arrls.toArray();
//		System.out.println(Arrays.toString(arr));

	}

}
