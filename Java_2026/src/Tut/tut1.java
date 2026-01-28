package Tut;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//primitive data type. 
//Array in java.
//Arrays utility class.
public class tut1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte num = 120;
		short num2 = 888;
		int num3 = 92883;
		long num4 = 834982834l;
		
		float salary = 8838923.89f;
		double salary2 = 9034890.99d;
		
		char ch = 'z';
		
		boolean flag = true;
		System.out.println(salary2);
		
//		arrays
		int[] arr = new int[100];
		int[] arr2 = {9, 8, 7, 6, 5, 4, 3};
		int[] arr3 = new int[] {3, 4, 5, 6, 7};
//		2-D arrays
		int[][] arr4 = new int[5][5];
//		jagged array
		int[][] arr5 = new int[8][];
		arr5[0] = new int[10];				//create new array
		arr5[0][0] = 10;
		arr5[0][2] = 10;
		arr5[3] = new int[5];				//create new array
		arr5[3][0] = 10;
		arr5[4] = new int[15];				//create new array
		arr5[4][5] = 10;
		arr5[4][2] = 10;
//		System.out.println(Arrays.deepToString(arr5));
		
		int[] marks = {90, 80, 85, 78, 95, 91, 70, 65, 77, 93};
		
		Arrays.sort(marks);
//		Arrays.sort(marks, 0, 6 );
		
		int indx = Arrays.binarySearch(marks, 91);
		System.out.println(Arrays.toString(marks));
		System.out.println(indx);
		
		int[] copiedArray = Arrays.copyOfRange(marks, 1, 7);
		System.out.println(Arrays.toString(copiedArray));
		
		long totalEle = Arrays.stream(marks).count();
		System.out.println(totalEle);
		
		List<Integer> myList = Arrays.asList(1, 4, 5, 6, 7, 8, 8 , 1101, 2202, 3303, 4404); 
		System.out.println(myList);
		
		int[] myarray = new int[20];
		Arrays.fill(myarray, 88);
		System.out.println(Arrays.toString(myarray));
		
		
		
		
		

	}

}
