package pepcoding.Pattern;

public class Pattern7 {

    public static void main(String[] args) {
/*
        Print Diamond
        __*
        _* *
        *   *
         * *
          *
*/

        int N=5;
        int first = N/2;
        int last = N/2;
        for (int i = 0; i < N; i++) {
            int j=0;
            while(j<first){                     // print spaces
                System.out.print(" ");
                j++;
            }
            System.out.print("*");              // print star
            j++;
            if(j<=last){                        // print last star
                while(j != last) {
                    System.out.print(" ");
                    j++;
                }
                System.out.print("*");
            }

            System.out.println();
            if(i<N/2){
               first--;
               last++;
            }else {
                first++;
                last--;
            }

        }

    }
}
