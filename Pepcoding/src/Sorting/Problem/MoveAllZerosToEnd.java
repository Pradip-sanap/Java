package Sorting.Problem;

import Sorting.Swap;

import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        // Move all zeros to end of array
//        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
//        int[] arr = {10, 20, 30};
        int[] arr = {0, 0};
//        int[] arr = {0, 0, 0, 4, 0, 0, 5, 0};
        int countZeros = 0;
        int i = 0;
        int j=0;
        boolean flag = false;
        while(i < arr.length) {
            if(arr[i]!=0 && !flag){
                i++;
                continue;
            }
            if(arr[i]==0 && !flag){
                j = i;
                flag = true;
            }

            if(arr[i]!=0){
                Swap.swap(arr, i, j);
                j += 1;
            }

            i++;
        }

        System.out.println(Arrays.toString(arr));

        // -----------approach two---------------
//        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
//        int count = 0;
//
//        for (int k = 0; k < arr.length; k++) {
//
//            // If the current element is non-zero
//            if (arr[k] != 0) {
//
//                // Swap the current element with the 0 at index 'count'
//                int temp = arr[k];
//                arr[k] = arr[count];
//                arr[count] = temp;
//
//                // Move 'count' pointer to the next position
//                count++;
//            }
//        }
    }
}
