import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayLearning {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] marks = new int[5];
//		marks[0] = 10;
//		marks[1] = 20;
//		marks[2] = 30;
//		marks[3] = 40;
//		marks[4] = 50;
//		System.out.println(marks.length);
//		marks[5] = 60;
		
//		for(int e : marks) {
//			System.out.print(e + " ");
//		}
		
//		int[][] matrix = new int[3][5];
//		System.out.println(matrix[0].length);
//		
//		for(int[] ele: matrix) {
//			for(int i: ele) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
//		
//		int [][] jagged = new int[10][];
		
		
		//----------------------------------
		int[] marks = {80, 40, 60, 20, 50, 70};
		System.out.println(Arrays.toString(marks));
		Arrays.sort(marks);
//		Arrays.sort(marks, (a, b)-> b - a);
		System.out.println(Arrays.toString(marks));
		
		System.out.println(Arrays.binarySearch(marks, 90));
		
		// ------------------------------
		int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {1, 2, 3};
        System.out.println(arr1.equals(arr2));

        // Checking if arrays are equal
        System.out.println(Arrays.equals(arr1, arr2));  // Output: true
        System.out.println(Arrays.equals(arr1, arr3));  // Output: false
        
        //----------------------------------
        int[] arr4 = new int[20];
        Arrays.fill(arr4, 10);
        
        System.out.println(Arrays.toString(arr4));
        
        //-----------------------------------
        int[] arr5 = Arrays.copyOf(arr3, 10);
        System.out.println(Arrays.toString(arr5));
        
        //----------------------------------
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            // Converting the 2D array to a string
        System.out.println(Arrays.deepToString(matrix1));
        
        //-----------------------------------
        String[] arr6 = {"Apple", "Banana", "Cherry"};

        // Converting the array to a List
        List<String> list = Arrays.asList(arr6);

        // Printing the List
        System.out.println(list);
        
        //---------------------------------
        int[] arr7 = {1, 2, 3};
        int[] arr8 = Arrays.copyOf(arr7, arr7.length);
        arr8[1] = 22;
        System.out.println(Arrays.toString(arr7));
        System.out.println(Arrays.toString(arr8));
        
		 
		

	}

}
