package pepcoding.Pattern;

public class Pattern6 {
    public static void main(String[] args) {

/*
        print cross

        *___*
        _*_*
        __*
        _* *
        *   *
*/

        int N=5;
        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {
                if(i==j || j==N-1-i){
                    System.out.print("*");
                    continue;
                }

                System.out.print(" ");

            }
            System.out.println();

        }
    }
}
