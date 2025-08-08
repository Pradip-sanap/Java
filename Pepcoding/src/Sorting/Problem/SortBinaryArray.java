package Sorting.Problem;

import Sorting.Swap;

import java.util.Arrays;

public class SortBinaryArray
{
//        Sort a Binary Array
//    Input :  arr[] = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
//    Output : arr[] = [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
//        int[] arr = {1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1};

        int i=0;
        int j=arr.length-1;
        boolean flag = false;

        while(i < arr.length) {
            if(arr[i]==1){
                while(j>i) {
                    if(arr[j]==0){
                        Swap.swap(arr, i, j);
                        break;
                    }
                    j--;
                }
            }
            i++;
        }

        System.out.println(Arrays.toString(arr));

        //----------------Another approach---------------
        int[] arr1 = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        int m = arr1.length;
        int countOfZeros = 0;
        for(int k=0; k<arr1.length; k++) {
            if(arr1[k]==0){
                countOfZeros += 1;
            }
        }
        for(int h=0; h  < m; h++){
            if(countOfZeros > h) {
                arr1[h] = 0;
                continue;
            }
            arr1[h] = 1;
        }

        System.out.println(Arrays.toString(arr1));
    }
}
