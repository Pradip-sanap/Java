package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Practice_Question_2 {

	public static void main(String[] args) {
		// Linear Search in an Array
//		int[] arr1 = {83, 19, 38, 75, 67, 28, 45 , 62};
//		int num = 67;
//		
//		for(int i=0; i<arr1.length; i++) {
//			if(arr1[i] == num) {
//				System.out.println("Num found at index : " + i);
//				break;
//			}
//		}
		
//		Remove Duplicate Elements (Without Using Set)
//		int[] arr2 = {32, 15, 54, 55, 32, 19, 63, 63, 15, 54, 63, 55, 52, 48}; 
		// APPROACH - 1
//		int maxElement = Integer.MIN_VALUE;
//		for(int e : arr2) {
//			if( e > maxElement) {
//				maxElement = e;
//			}
//		}
//		int[] tempArr = new int[maxElement+1];
// 
//		for(int i=0; i<arr2.length; i++) {
//			if(tempArr[arr2[i]]==0) {
//				tempArr[arr2[i]] = 1;
//			}
//		}
//		for(int i=0; i<tempArr.length; i++) {
//			if(tempArr[i] == 1) {
//				System.out.print(i + " ");
//			}
//		}
		
		// APPROACH - 2
//		Arrays.sort(arr2);
//		System.out.println(Arrays.toString(arr2));
//		
//		int j=0;
//		for(int i=0; i<arr2.length-1; i++) {
//			if(arr2[j] != arr2[i]) {
//				j++;
//				arr2[j] = arr2[i];
//			}
//		} 
//
//		for(int k=0; k<=j; k++) {
//			System.out.print(arr2[k] + ", ");
//		}
		
		// APPROACH - 3
//		int[] arr = {1, 2, 2, 3, 4, 4, 5};
//		
//		int[] unique = Arrays.stream(arr).distinct().toArray();
//		System.out.println(Arrays.toString(unique));
		
		//APPROACH - 4
//		int[] arr = {1, 2, 2, 3, 4, 4, 5};
//		HashSet<Integer> set = new HashSet<>();
//		for(int e : arr) {
//			set.add(e);
//		}
//		System.out.println(set);
		
		//APPROACH - 5
		int[] arr = {1, 2, 2, 3, 4, 4, 5};
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int e : arr) {
			map.put(e, map.getOrDefault(e, 0) + 1);
		}
		System.out.println(map.keySet());
		

	}

}
