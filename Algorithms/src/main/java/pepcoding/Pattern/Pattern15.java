package pepcoding.Pattern;

public class Pattern15 {
    public static void main(String[] args) {
/*
        swastic pattern
        Input : row = 7, column = 7
        Output:
        *     * * * *
        *     *
        *     *
        * * * * * * *
              *     *
              *     *
        * * * *     *
*/

        int N = 7;

        for (int i = 0; i < N; i++) {
            int index = 0;
            if(i>N/2 && i<N-1){                     // prin first column stars condition
                System.out.print(" ");
            }else {
                System.out.print("*");
            }
            index++;

            while(index < N/2) {                    // print spaces or star upto N/2-1 column
                if(i==N/2 || i == N-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                index++;
            }
            System.out.print("*");                  // print star at N/2
            index++;
            while(index < N-1) {                    // print spaces or star upto N-2 column
                if(i==0 || i == N/2) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

                index++;
            }
            index--;
            if((i>=N/2 && i<=N) || i==0){           // print N-1 column star
                System.out.print("*");
            }else {
                System.out.print(" ");
            }

            System.out.println();


        }
    }
}
