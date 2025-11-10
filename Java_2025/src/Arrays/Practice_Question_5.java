package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice_Question_5 {

	public static void main(String[] args) {
		// Find the Largest Sum Contiguous Subarray (Kadane’s Algorithm)
		// {−2, −3, 4, −1, −2, 1, 5, −3} → Max Sum = 7
//		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
//		int n = arr.length-1;
//		
//		int largestSum = Integer.MIN_VALUE;
//		int startIdx = -1;
//		int endIdx = -1;
//		
		//Approach-1 : brute-force O(n^2)
//		for(int i=0; i<n; i++) {
//			int sum = 0;
//			for(int j=i; j<n; j++) {
//				sum += arr[j];
//				if(sum > largestSum) {
//					largestSum = sum;
//					startIdx = i;
//					endIdx = j;
//				}
//			}
//		}
//		System.out.println("Largest contiguous sum: "+largestSum);
//		System.out.println("startIdx: "+startIdx);
//		System.out.println("endIdx: "+endIdx);
		
		//Approach-2 : Kaden's algorithm O(n)
//		int currentSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//        int start = 0, tempStart = 0, end = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            currentSum += arr[i];
//
//            if (currentSum > maxSum) {
//                maxSum = currentSum;
//                start = tempStart;
//                end = i;
//            }
//
//            if (currentSum < 0) {
//                currentSum = 0;
//                tempStart = i + 1;
//            }
//        }
//
//        System.out.println("Maximum Subarray Sum: " + maxSum);
//        System.out.print("Subarray: [");
//        for (int i = start; i <= end; i++) {
//            System.out.print(arr[i] + (i < end ? ", " : ""));
//        }
//        System.out.println("]");
		
		
		
		
		//Rearrange Array Alternating Positive and Negative Numbers
//		int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};		// output: {5, -5, 2, -2, 4, -8, 7, 1, 8, 0}
		//Approach-1 : using extra memory
//		ArrayList<Integer> pos = new ArrayList<>();
//		ArrayList<Integer> neg = new ArrayList<>();
//		
//		Arrays.stream(arr).forEach(e ->{
//			if(e >= 0) {
//				pos.add(e);
//			}else {
//				neg.add(e);
//			}
//		});
//		int i=0;
//		while(!pos.isEmpty() && !neg.isEmpty()) {
//			arr[i++] = pos.get(0);
//			arr[i++] = neg.get(0);
//			
//			pos.removeFirst();
//			neg.removeFirst();
//		}
//		while(!pos.isEmpty()) {
//			arr[i++]=pos.get(0);
//			pos.removeFirst();
//		}
//		while(!neg.isEmpty()) {
//			arr[i++] = neg.get(0);
//			neg.removeFirst();
//		}
		
//		System.out.println(Arrays.toString(arr));
		
		//Approach - 2: two pointer method. Move Negative in begining and positive to end. Ordering is not maintain
		int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};		// output: {5, -5, 2, -2, 4, -8, 7, 1, 8, 0}
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]>=0 && arr[j]<0) {
				swap(arr, i, j);
				i++;
				j--;
				continue;
			}
			if(arr[i]<0)	i++;
			if(arr[j]>=0)	j--;
		}
		System.out.println(Arrays.toString(arr)); 
		int maxNum = Math.max(i, arr.length-j);
		System.out.println(maxNum);
		i=0;
		while(i<j && j<arr.length) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i+=2;
			j+=2;
		}
		System.out.println(Arrays.toString(arr)); 

	}
	
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	
	

}
