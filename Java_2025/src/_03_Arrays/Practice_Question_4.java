package _03_Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Practice_Question_4 {

	public static void main(String[] args) {
//		1. **Move All Zeroes to End Without Changing Order**
//	    ➤ `{0, 1, 0, 3, 12}` → `{1, 3, 12, 0, 0}`
//		int[] arr = {0, 1, 0, 3, 12};
//		int n=5;
//		int j=0;  
//		for(int i=0; i<n; i++) {
//			if(arr[i]!=0) {  
//				arr[j++] = arr[i];
//			} 
//		} 
//		
//		while(j < n) {
//			arr[j++]=0;
//		}
//		
//		System.out.println(Arrays.toString(arr));
		
		
		
//		2. **Find Missing Number in a Sequence (1 to N)**
//	    ➤ `{1, 2, 4, 5}` → Missing = 3
		//Approach-1
//		int[] arr = {1, 2, 3, 4, 5, 7, 8, 9};
//		int n = arr[arr.length-1];
//		int totalSum = n * (n+1) / 2;
//		int sum=0;
//		for(int num : arr) {
//			sum += num;
//		}
//		int missingNum = totalSum - sum;
//		System.out.println(missingNum);
		
		//Approach-2 : XOR
//		int xor1 = 0;
//		for(int i=0; i<=n; i++) {
//			xor1 ^= i;
//		}
//		int xor2 = 0;
//		for(int num:arr) {
//			xor2 ^= num;
//		}
//		
//		int missNum = xor1 ^ xor2;
//		System.out.println(missNum);
		
		
		
//		3. **Find Pair with Given Sum**
//	    ➤ Input: `{1, 4, 5, 6}`, Sum = 10 → Output: `(4, 6)`
		
//		int[] arr = {6, 4, 4, 6, 5, 5};
//		int targetSum =  10;
		
		//Approach-1 : Two-pointer use only when array is sorted
//		Arrays.sort(arr);
//		int N = arr.length;
//		int i=0;
//		int j = N-1;
//		while(i<j) {
//			int sum = arr[i]+arr[j];
//			if(sum == targetSum) {
//				System.out.println(arr[i] +" , "+ arr[j]); 
//				i++;
//				j--;
//			}else if(sum > targetSum) {
//				j--;
//			}else {
//				i++;
//			}
//		}
		
		//Approach-2 : Hashset
//		HashSet<Integer> set = new HashSet<>();
//		for(int num: arr) {
//			set.add(num);
//		}
//		for(int num: arr) {
//			int x = targetSum - num;
//			if(set.contains(x)) {
//				System.out.println(num +" , "+ x);
//			}
//		}
		
		
		
//		Check if Array is Sorted or Not
//		int[] arr = {5, 1, 9, 2, 4, 6};
//		boolean flag=true;
//		for(int i=1; i<arr.length-1; i++) {
//			if(arr[i] < arr[i-1]) {
//				flag=false;
//				break;
//			}
//		}
//		if(flag) {
//			System.out.println("sorted!!!");
//		}else {
//			System.out.println("Not sorted");
//		}

	}

}
