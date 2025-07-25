package pepcoding.Pattern;

public class Pattern2 {

    public static void main(String[] args) {
/*
                *
              * *
            * * *
          * * * *
        * * * * *
 */

        int N=5;
        for(int i=1; i<=N; i++) {

            for(int j=1; j<=N-i; j++) {
                System.out.print("  ");
            }
            for(int k = 0; k<i; k++){
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();
/*
         * * * * *
         * * * *
         * * *
         * *
         *
*/
        for(int i=0; i<N; i++) {
            for(int k = 1; k<=N-i; k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
