package _03_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Practice_Question_6 {

	public static void main(String[] args) {
		// Merge Two Sorted Arrays into One Sorted Array.
//		arr1 = {1, 3, 5, 7}
//		arr2 = {2, 4, 6, 8}
//		Merged Sorted Array: {1, 2, 3, 4, 5, 6, 7, 8}
		
		//Approach-1 : Two pointer
//		int[] arr1 = {1, 5, 9, 10, 15, 20};
//		int[] arr2 = {2, 3, 8, 13};
//		int n = arr1.length, m = arr2.length;
//		int[] mergeArr = new int[m + n];
		
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);
//		
//		int i=0, j=0, k=0;
//		while(i < n && j < m) {
//			if(arr1[i] < arr2[j]) {
//				mergeArr[k++]=arr1[i++];
//			}else {
//				mergeArr[k++] = arr2[j++];
//			}
//		}
//		
//		// Copy remaining elements
//        while (i < n) mergeArr[k++] = arr1[i++];
//        while (j < m) mergeArr[k++] = arr2[j++];
//        
//        System.out.println(Arrays.toString(mergeArr));
        
        
        //Approach-2 ; 
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        int i=0;
//        while(i < n) {
//        	queue.add(arr1[i++]); 
//        }
//        i=0;
//        while(i < m) {
//        	queue.add(arr2[i++]); 
//        }
//        i=0;
//        while(i< (n+m)) {
//        	System.out.println(queue.remove());
//        	i++;
//        }
		
		
//		Find Intersection and Union of Two Arrays
//		int[] arr1 = {1, 2, 4, 5, 6};
//		int[] arr2 = {2, 3, 5, 7};
//		int n = arr1.length;
//		int m = arr2.length;
		
		//APPROACH- 1
		//First I will sort both arrays if they no sorted.
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);
//		
//		LinkedHashSet<Integer> unionSet = new LinkedHashSet<>();
//		ArrayList<Integer> intersection = new ArrayList<>();
//		
//		int i=0, j=0;
//		while(i<n && j<m) { 
//			
//			if(arr1[i]==arr2[j]) {
//				intersection.add(arr1[i]);
//				unionSet.add(arr1[i]);
//				i++;
//				j++;
//				continue;
//			}else if(arr1[i] > arr2[j]) {
//				unionSet.add(arr2[j]);
//				j++;
//			}else {
//				unionSet.add(arr1[i]);
//				i++;
//			}
//		}
//		while (i < n) {
//		    unionSet.add(arr1[i]);
//		    i++;
//		} 
//		while (j < m) {
//		    unionSet.add(arr2[j]);
//		    j++;
//		}
//		
//		System.out.println(unionSet);
//		System.out.println(intersection);
		
		//Approach - 2
//		int[] arr1 = {1, 2, 4, 5, 6};
//		int[] arr2 = {2, 3, 5, 7};
//		int n = arr1.length;
//		int m = arr2.length;
//		HashMap<Integer, Integer> map  = new HashMap<Integer, Integer>();
//		
//		for(int e: arr1) {
//			map.put(e, map.getOrDefault(e, 0) + 1);
//		}
//		for(int e: arr2) {
//			map.put(e, map.getOrDefault(e, 0) + 1);
//		}
//		Set<Integer> union = map.keySet();
//		ArrayList<Integer> intersection= new ArrayList<>();
//		map.forEach((key, value)->{
//			if(map.get(key) > 1) {
//				intersection.add(key);
//			}
//		});
//		
//		System.out.println(union);
//		System.out.println(intersection);
		
		
//		Find Majority Element (Appears > n/2 times)
		int[] arr = {0, 0, 0, 2, 2, 2, 2};	//output: 2
		int n = arr.length;
		
		//approach-1
//		int result = -1;
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for(int e: arr) {
//			map.put(e, map.getOrDefault(e, 0)+1);
//			if(map.get(e) > n/2) {
//				result=  e;
//				break;
//			}
//		}
//		System.out.println(result);
		
		//approach-2 : sorting arr
		Arrays.sort(arr);
		int candidate = arr[n / 2];

		// Verify it really is majority (> n/2)
		int count = 0;
		for (int e : arr) {
		    if (e == candidate) count++;
		}

		int result = (count > n / 2) ? candidate : -1; 
		System.out.println(result);
		
		
		
		
	}

}
