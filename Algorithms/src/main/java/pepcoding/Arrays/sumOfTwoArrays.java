package pepcoding.Arrays;

import java.util.Arrays;

public class sumOfTwoArrays {

    public static void main(String[] args) {
/*
        Given 2 arrays which may be diff length.
        find the sum between them and store in 3rd array.
        3 2 5 6 7
      8 3 0 1 7 8
      ------------
      8 6 2 7 4 5
*/
        int[] ar1 = {3, 2, 5, 6, 7};
        int[] ar2 = {8, 3, 0, 1, 7, 8};
        int len1 = ar1.length;
        int len2 = ar2.length;
        int i=len1-1;
        int j = len2-1;
        int k = Math.max(len1, len2)-1;
        int[] sum = new int[k+1];
        int extra = 0;
        while(i>=0 || j>=0) {
            if(i<0){
                sum[k] = ar2[j];
            } else if(j<0){
                sum[k] = ar1[i];
            }else {
                sum[k] = ar1[i] + ar2[j];
            }
            if(extra > 0 ){
                sum[k] += extra;
            }

            if(sum[k] > 9){
                sum[k] = sum[k] % 10;
                extra = 1;
            }else{
                extra = 0;
            }


            i--;
            j--;
            k--;
        }

        System.out.println(Arrays.toString(sum));
    }
}
