package pepcoding;

import java.util.Scanner;

public class CheckPrimeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num :");
        int t = sc.nextInt();

        int[] arr = new int[t];
        for(int i=0; i<t; i++){
            System.out.print("Enter "+ i +" num:");
            arr[i] = sc.nextInt();
        }

        for(int e: arr){
            System.out.println(e +":"+ isPrime(e));
        }


    }

    static boolean isPrime(int ele) {

        if(ele==1 || ele==2){
            return true;
        }
        for(int i=2; i*i<=ele; i++) {
            if(ele % i == 0){
                return false;
            }
        }
        return true;
    }
}
//Enters num :5
//Enter 0 num:117
//Enter 1 num:551
//Enter 2 num:61
//Enter 3 num:93
//Enter 4 num:129
//        117:false
//        551:false
//        61:true
//        93:false
//        129:false