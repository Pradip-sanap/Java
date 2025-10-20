package Sorting;

import java.util.Arrays;
//hello
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {40, 20, 50, 30, 70, 60, 80, 10};

        bubbleSort(arr);


        System.out.println("Buble Sorted array = " + Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {

        for(int i=0; i < arr.length; i++) {

            for(int j=0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    Swap.swap(arr, j, j+1);
                }
            }

        }
    }
}
