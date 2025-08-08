package Arrays;

import java.util.Arrays;
import java.util.List;

public class _01_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Sorting Arrays
		int[] numbers = { 5, 2, 9, 1, 6 };
		Arrays.sort(numbers);
		System.out.println("Sorted Array: " + Arrays.toString(numbers));

		// 2. Binary Search (must be sorted array)
		int index = Arrays.binarySearch(numbers, 6);
		System.out.println("Index of 6: " + index);

		// 3. Comparing Arrays
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 1, 2, 3 };
		System.out.println("Arrays equal? " + Arrays.equals(array1, array2));

		// Nested Arrays Comparison
		int[][] nested1 = { { 1, 2 }, { 3, 4 } };
		int[][] nested2 = { { 1, 2 }, { 3, 4 } };
		System.out.println("Nested Arrays equal? " + Arrays.deepEquals(nested1, nested2));

		// 4. Filling Arrays
		int[] filledArray = new int[5];
		Arrays.fill(filledArray, 42);
		System.out.println("Filled Array: " + Arrays.toString(filledArray));

		// 5. Copying Arrays
		int[] copiedArray = Arrays.copyOf(numbers, 3); // Copy first 3 elements
		System.out.println("Copied Array: " + Arrays.toString(copiedArray));

		int[] rangeCopiedArray = Arrays.copyOfRange(numbers, 1, 4); // Copy range from index 1 to 3
		System.out.println("Range Copied Array: " + Arrays.toString(rangeCopiedArray));

		// 6. Converting Arrays to Strings
		System.out.println("Array toString(): " + Arrays.toString(numbers));
		System.out.println("Nested Array deepToString(): " + Arrays.deepToString(nested1));

		// 7. Parallel Sort
		int[] largeNumbers = { 5, 8, 1, 9, 6, 3, 7, 2 };
		Arrays.parallelSort(largeNumbers);
		System.out.println("Parallel Sorted Array: " + Arrays.toString(largeNumbers));

		// 8. Creating Streams from Arrays
		System.out.println("Stream from Array:");
		Arrays.stream(numbers).forEach(System.out::println);
		
		
		List<Integer> asList = Arrays.asList(2, 4, 5, 7 ,8 ,9);
		System.out.println(asList.toString());
		
		
		
		
		
		
		
	}

}
