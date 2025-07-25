package pepcoding.Pattern;

public class Pattern12 {

    public static void main(String[] args) {
/*
    N = 4
    1                 1
    1  2           2  1
    1  2  3     3  2  1
    1  2  3  4  3  2  1

 */

        int N = 4;
        int space = N+1;
        for (int i = 1; i <= N; i++) {

            int j;
            for (j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }

            // spaces
            int k = 0;
            while(k < space) {
                System.out.print("  ");
                k++;
            }
            if(i == N){
                j--;
            }
            j--;
            for (; j >= 1; j--) {
                System.out.print(j +" ");
            }


            System.out.println();
            space -= 2;

        }
    }
}
