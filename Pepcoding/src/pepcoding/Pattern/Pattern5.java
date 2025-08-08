package pepcoding.Pattern;

public class Pattern5 {
    public static void main(String[] args) {
/*  print diagonal.
        *
        _*
        __*
        ___*
        _____*
*/

        int N = 5;
        int space = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
            space++;
        }

        //Approach 2
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j <= i; j++) {
//                if(i==j){
//                    System.out.println("*");
//                    break;
//                }
//                System.out.print(" ");
//            }
//        }


/*  print diagonal.
        _____*
        ___*
        __*
        _*
        *
*/

        int spc = N;                // spc = space
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
            spc--;
        }


    }
}
