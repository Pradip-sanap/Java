package pepcoding.Pattern;

public class Pattern10 {

    public static void main(String[] args) {
/*      x can have any value
        x * 1 = x
        x * 2 = 2x
        x * 3 = 3x
        ...
        x * 10 = 10x
*/

        int N = 10;
        int x = 4;
        for (int i = 1; i <= N; i++) {
            System.out.println(x+" * "+ i +" = "+ i*x);
        }
    }
}
