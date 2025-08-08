package pepcoding.Pattern;

public class Pattern9 {
    public static void main(String[] args) {
/*      pattern with fibonacci numbers
        0
        1  1
        2  3   5
        8  13  21  34
        ...
*/

        int N = 4;
        int a = 0;
        int b = 1;
        int fib = 0;
        for (int i = 0; i < N; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(a +" ");
                fib = a + b;
                a = b;
                b = fib;
            }
            System.out.println();

        }

    }
}
