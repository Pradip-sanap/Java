package pepcoding;

import java.util.Scanner;

public class PrintPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower value:");
        int low = sc.nextInt();
        System.out.print("Enter higher value:");
        int high = sc.nextInt();

        while(low<=high){

            if(low==1 || low==2){
                System.out.println(low +" is Prime");
                low++;
                continue;
            }
            boolean flag=true;
            for(int i=2; i*i<=low; i++) {
                if(low % i == 0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(low +" is Prime");
            }
            low++;
        }
    }
}
//Enter lower value:4
//Enter higher value:30
//        5 is Prime
//7 is Prime
//11 is Prime
//13 is Prime
//17 is Prime
//19 is Prime
//23 is Prime
//29 is Prime
