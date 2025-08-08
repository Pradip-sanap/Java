package pepcoding.Pattern;

public class Pattern13 {
    public static void main(String[] args) {
/*      print arrow of star
           *
           * *
       * * * * *
           * *
           *

 */
        int N = 5;
        int stars = 0;
        for (int i = 0; i < N; i++) {
            int j;
            for (j = 0; j < N/2; j++) {
                if(N/2 == i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            stars = i<=N/2 ? stars+1 : stars-1;
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
