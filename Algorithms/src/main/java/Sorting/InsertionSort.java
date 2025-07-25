package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {40, 20, 50, 30, 70, 60, 80, 10};

        insertionSort(arr);

        System.out.println("Sorted array = " + Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {

        for(int i=1; i<arr.length ; i++) {
            int value = arr[i];
            for(int j=i-1; j >= 0; j--) {
                if(arr[j] > value) {
                  swap(arr, j,   j+1);
                }
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
