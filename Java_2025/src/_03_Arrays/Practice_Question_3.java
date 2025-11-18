package _03_Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice_Question_3 {

	public static void main(String[] args) {
		// Rotate Array by K Positions
//		{1, 2, 3, 4, 5}        K = 2         → {4, 5, 1, 2, 3}
		
		//APPROACH-1: brute-force		time:O(NxK)  space: O(1)
		int[] arr = {1, 2, 3, 4, 5};
		int n=5;
		int k=2;
		
//		for(int i=0; i<k; i++) {
//			int temp = arr[n-1];
//			for(int j=n-1; j >= 1; j--) {
//				arr[j] = arr[j-1];
//			}
//			arr[0] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
		//Approach - 2: using additional array
//		int[] temp = new int[k];
//		int j=0;
//		for(int i=n-k; i <= n-1; i++) {
//			temp[j++] = arr[i];
//		}
//		System.out.println(Arrays.toString(temp));
//		
//		for(int i=n-1; i>=k; i--) {
//			arr[i] = arr[i-k];
//		}
//		System.out.println(Arrays.toString(arr));
//		for(int i=0; i<k; i++) {
//			arr[i] = temp[i];
//		}
//		System.out.println(Arrays.toString(arr));
		
		//Approach -3 : reversing
//		List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
//		Collections.rotate(arrList, k);
//		arrList.forEach(System.out::println);
		
		
		
//		Find Second Largest and Second Smallest Number from arr
		//Approach-1
//		int[] arr = {5, 1, 8, 3, 2, 9, 5};
//		int[] sorted = Arrays.stream(arr).distinct().sorted().toArray();
//		
//		int secondSmallest = sorted[1];
//		int secondLargest = sorted[sorted.length-2];
//		System.out.println("secondSmallest: "+secondSmallest);
//		System.out.println("secondLargest: "+secondLargest);
		
//		5. **Count Frequency of Each Element** 
//	    ➤ Input: `{1, 2, 2, 3, 1}` → `1=2, 2=2, 3=1`
		//Approach-1
//		int[] arr = {1, 2, 2, 3, 1};
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for(int e : arr) {
//			map.put(e, map.getOrDefault(e, 0) + 1);
//		}
//		
//		map.forEach((key, value)->{
//			System.out.println(key + " : " + value);
//		});
		

	}

}
