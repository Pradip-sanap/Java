package pepcoding;

public class PrimeFactorOfNumber {
    public static void main(String[] args) {
        // find prime factors of number
        //eg. num = 24 : 2 x 2 x 2 x 3

        int num = 96;
        int oNum = 96;
        System.out.println("Factor of "+num+": ");

        //approach 1
//        int divisor = 2;
//        while(num != 0) {
//            if(num % divisor == 0){
//                System.out.print(divisor +", ");
//                if(num==divisor){
//                    break;
//                }
//                num /= divisor;
//            }else {
//                divisor++;
//            }
//        }

        //approach 2
        for(int div=2; div * div <= oNum; div++){

            while(oNum % div == 0) {
                oNum = oNum / div;
                System.out.print(div +" ");

            }
        }
        if(oNum != 0){
            System.out.println(oNum);

        }


    }

}
