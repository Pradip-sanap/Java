package pepcoding.Stack;

import java.util.Arrays;

public class SlidingWindow {
    public static void main(String[] args) {
/*
        Given an array, and window size k,
        we have to find maximum element in that window.
*/
        int[] arr = {2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 0, 7, 19, 8, 12, 6};
        int k = 4;
        int[] result = new int[arr.length-k+1];
        for (int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];
            int j=0;
            while(j<k-1) {
                max = Math.max(max, arr[j+i+1]);
                j++;
            }
            result[i]= max;
        }

        System.out.println(Arrays.toString(result));

    }
}
