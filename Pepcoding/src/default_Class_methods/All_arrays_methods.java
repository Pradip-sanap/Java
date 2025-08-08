package default_Class_methods;

import java.util.Arrays;
import java.util.List;

public class All_arrays_methods {
    public static void main(String[] args) {
        int[] marks = {80, 85, 90, 95, 93, 75, 60, 50, 62, 58};
//        int[] marks1 = new int[]{88, 55, 99};         another way to create array

//        int[] newMakrs = Arrays.copyOf(marks, 4);
        int[] newMarks2 = Arrays.copyOfRange(marks, 2, 6);
        System.out.println(Arrays.toString(newMarks2));

        int[] arr = new int[10];
        Arrays.fill(arr, 100);
        System.out.println(Arrays.toString(arr));

//        int[][] arr2 = {{1, 2, 3}, {11, 22, 33}};
        int[][][] arr2 = {{{1,2,3}}};
        System.out.println(Arrays.deepToString(arr2));

        int[] ar1 = {1, 2, 3, 4,5 ,6};
        int[] ar2 = {1,2, 3, 8,9};

        System.out.println(Arrays.mismatch(ar1, ar2));

        int[] ar3 = {11, 22, 33, 44, 55};
        List<int[]> list = Arrays.asList(ar3);
//        System.out.println();

        System.out.println(Arrays.compare(ar1, ar2));;


        /*
        sort
        toString
        deepToString()  - print nested array
        equals()
    `   copyOf()
        copyOfRange()
        fill()
        binarySearch()
        stream()
        mismatch()
        asList()

         */


    }
}
