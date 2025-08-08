package Sorting.Problem;

import Sorting.Swap;

import java.util.Arrays;

public class SeperateEvenOdd {

    public static void main(String[] args) {
        // Separate Even and Odd Numbers
//        Input: arr = [0, 1, 2, 3, 4]
//        Output: arr = [0, 2, 4, 1, 3]

//        int[] arr = {8, 3, 5, 9, 1, 2, 0, 4};
//        int[] arr = {0, 1, 2, 3, 4};

        int[] arr = {1, 11, 7, 9, 2, 3, 4};

        int[] tempArr = new int[arr.length];
        int count=0;
        int j = 0;
        boolean flag = false;
        for(int i=0; i< arr.length; i++) {
            System.out.println("Iteration: "+ i);
            if(arr[i]%2 != 0){
                System.out.println("Odd block");
                tempArr[count++]=arr[i];
                if(!flag){
                    flag = true;
                    j=i;
                }
            }

            if(arr[i]%2 == 0 && flag) {
                arr[j] = arr[i];
                j += 1;
            }
        }

        int l = 0;
        while(j < arr.length) {
            arr[j] = tempArr[l++];
            j++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
