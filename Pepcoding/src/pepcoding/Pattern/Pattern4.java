package pepcoding.Pattern;

public class Pattern4 {
    public static void main(String[] args) {
/*
         *** ***
         **   **
         *     *
         **   **
         *** ***
*/

        int N=5;
        int star = N/2;
        int space = 1;


        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= star; j++) {           // print *
                System.out.print("*");
            }
            for (int k = 0; k < space; k++) {           // print space
                System.out.print(" ");
            }
            for (int l = 0; l <= star; l++) {           // print *
                System.out.print("*");
            }

            System.out.println();

            if(i <= (N/2)-1){
                star--;
                space += 2;
            }else {
                star++;
                space -=2;
            }

        }


    }
}
