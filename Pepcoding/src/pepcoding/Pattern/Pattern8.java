package pepcoding.Pattern;

public class Pattern8 {
    public static void main(String[] args) {
/*
        1
        2 3
        4 5 6
        7 8 9 10
        ...
*/
        int N = 4;
        int count=1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count +" ");
                count++;
            }
            System.out.println();
        }
    }
}
