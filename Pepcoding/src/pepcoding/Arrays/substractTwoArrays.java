package pepcoding.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class substractTwoArrays {
    public static void main(String[] args) {
/*
        Two number are given. num1 and num2.
        num2 is greater number.
        1 1 1 1 1 1
          3 4 5 3 2
        -----------
        0 7 6 5 7 9
*/

        int num1 = 34532;
        int num2 = 111111;

        ArrayList<Integer> arr1 = convertToArray(num1);
        System.out.println(arr1);
        ArrayList<Integer> arr2 = convertToArray(num2);
        System.out.println(arr2);
        ArrayList<Integer> result = new ArrayList<>();


        int i = arr1.size() - 1; // pointer for arr1 (smaller number)
        int j = arr2.size() - 1; // pointer for arr2 (bigger number)
        int borrow = 0;

        while (j >= 0) {
            if(i<0){
                result.add((arr2.get(j)) - borrow);
            }
            else if(arr2.get(j) < arr1.get(i)) {
                result.add((arr2.get(j)+10) - arr1.get(i) - borrow);
                borrow = 1;
            }else {
                result.add((arr2.get(j)+10) - arr1.get(i) - borrow);
                borrow = 0;
            }

            i--;
            j--;
        }

        Collections.reverse(result);

        System.out.println(result);

    }


    static ArrayList<Integer> convertToArray(int num){
        ArrayList<Integer> arr = new ArrayList<>();
        while(num!=0){
            arr.add(num % 10);
            num/=10;
        }
        Collections.reverse(arr);
        return arr;

    }
}
