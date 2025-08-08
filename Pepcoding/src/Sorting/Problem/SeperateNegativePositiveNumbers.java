package Sorting.Problem;

import java.util.ArrayList;
import java.util.Arrays;

public class SeperateNegativePositiveNumbers {

    public static void main(String[] args) {

//        Separate Negative and Positive Numbers
//        Input: arr[] = [12, 11, -13, -5, 6, -7, 5, -3, -6]
//        Output: [-13, -5, -7, -3, -6, 12, 11, 6, 5]

        int[] arr = {12, 11, -13, -5, 6, -7, 5, -3, -6};

        ArrayList<Integer> positiveNums = new ArrayList<>();
        ArrayList<Integer> negativeNums = new ArrayList<>();

        int m=0;
        int n=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                negativeNums.add(arr[i]);
            }else if(arr[i]>=0) {
                positiveNums.add(arr[i]);
            }else {
                System.out.println("Invalid arr element");
            }
        }
        int a=0;
        while(a < negativeNums.size()){
            arr[a] = negativeNums.get(a);
            a++;
        }
        int b=0;
        while(b < positiveNums.size()){
            arr[a] = positiveNums.get(b);
            b++;
            a++;
        }
        System.out.println("Array : "+ Arrays.toString(arr));



    }
}
