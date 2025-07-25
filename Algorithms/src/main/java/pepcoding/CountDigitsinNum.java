package pepcoding;

import java.util.Arrays;

public class CountDigitsinNum {
    public static void main(String[] args) {
        //Question 1: Print length of num
        int num = 978542678;
        long num_c = num;
        long num_c2 = num;

        // Approach : 1
        System.out.println(Integer.toString(num).length());

        // Approach : 2
        int count=0;
        while(num>0){
            count++;
            num /= 10;
        }
        System.out.println("Total Digits :" + count);

        //-----------------------------------------------

        //Question 2: Print all digits for number from left to right.
        long divider = (long) Math.pow(10, count-1);
        System.out.println(divider);
        //approach 1:
        while(num_c != 0) {
            long dig = num_c / divider;
            System.out.println(dig);
            num_c = num_c % divider;
            divider /= 10;
        }

        //approach:2 recursion
        printDigits(num_c2);


    }

    static void printDigits(long num){
        if(num == 0){
            return;
        }
        printDigits(num/10);
        System.out.println(num%10);
    }


}
