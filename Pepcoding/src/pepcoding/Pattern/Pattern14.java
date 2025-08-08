package pepcoding.Pattern;

public class Pattern14 {

    public static void main(String[] args) {
/*
        print hour glass structure.
        * * * * * * *
          *       *
            *   *
              *
            * * *
          * * * * *
        * * * * * * *

        * * * * *
          *   *
            *
          * * *
        * * * * *

*/

        int N=7;
        int space=0;
        int stars = N;
        int start = 0;
        int end = N-1;
        for (int i = 0; i < N; i++) {
            //print spaces
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            //print stars
            for (int j = 0; j < stars; j++) {
                if((i <= N/2 && i!=0) && j>0 && j<stars-1) {
                    System.out.print("  ");
                }else{
                    System.out.print("* ");

                }
            }
            System.out.println();

            if(i < N/2) {
                space++;
                stars -= 2;
                start++;
                end--;
            }else {
                space--;
                stars += 2;
                start--;
                end++;
            }
        }


    }
}
