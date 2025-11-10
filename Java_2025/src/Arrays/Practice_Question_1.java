package Arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class Practice_Question_1 {

	public static void main(String[] args) {
//		Sum of Array Elements
//		int[] arr = {1, 2, 3, 4, 5};
//		
//		int sum = 0;
//		for(int e : arr) {
//			sum += e;
//		}
//		System.out.println(sum);
		
		
//		Find Maximum and Minimum Element
//		int[] arr2 = {4, 7, 1, 9, 2};
//		int min = Integer.MAX_VALUE;
//		int max = Integer.MIN_VALUE;
//		
//		for(int e: arr2) {
//			if(e < min) {
//				min = e;
//			}
//			if(e > max) {
//				max = e;
//			}
//		}
//		System.out.println(min);
//		System.out.println(max);
//		
//		OptionalInt min2 = Arrays.stream(arr2).min();
//		OptionalInt max2 = Arrays.stream(arr2).max();
//		
//		System.out.println(min2.getAsInt());
//		System.out.println(max2.getAsInt());
		
//		count Even and Odd Numbers in an Array
		int[] arr3 = {4, 9, 1, 3, 11, 29, 43, 82, 23, 33, 88, 45, 34};
		int even = 0;
		int odd = 0;
		
		for(int e : arr3) {
			if(e % 2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println(even);
		System.out.println(odd);
		
//		Reverse an Array Without Using Extra Array
//		{1, 2, 3, 4} → {4, 3, 2, 1}
//		int[] arr4 = {1, 4, 3, 4, 4, 2, 9};
//		int j = arr4.length - 1;
//		for(int i=0; i < arr4.length/2; i++) {
//			int temp = arr4[j];
//			arr4[j] = arr4[i];
//			arr4[i] = temp;
//			
//			j--;
//			
//		}
//		System.out.println(Arrays.toString(arr4));

		
		

	}

}
