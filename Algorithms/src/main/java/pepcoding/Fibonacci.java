package pepcoding;

public class Fibonacci {
    public static void main(String[] args) {
//        print all fibonacci numbers till N
        int N = 8;


        int a=0;
        int b=1;
        int c = 0;
        for(int i=0; i < N; i++) {

            c = a + b;
            System.out.println(a);
            a=b;
            b=c;
        }




    }

}
