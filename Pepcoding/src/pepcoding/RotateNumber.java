package pepcoding;

public class RotateNumber {
    public static void main(String[] args) {
        // we given the number and k which is how how rotation need to do.
        // eg. num= 23457  , k=2
        // ans = 57234

        int n = 12340056;
        int k = 3;

        int len = Integer.toString(n).length();

        //approach - 1
//        while(k > 0) {
//            int digit = n % 10;             // reminder
//            n /= 10;                        // remove last digit from number
//            int value = digit * (int) Math.pow(10, len - 1);
//            System.out.println("value->"+ value);
//            n = value + n;
//            System.out.println("n-> "+ n);
//
//            k--;
//        }

        //approach - 2

        int multiplier = (int) Math.pow(10, len - k);       // 100000
        int divisor = (int)Math.pow(10, k);                 // 1000

        int reminder = n % divisor;                         // 056
        n /= divisor;                                       // 12340

        int  value = reminder * multiplier;                 // 056 * 100000 = 5600000
        n = value + n;                                      // 5612340

        System.out.println("rotated No: "+ n);
    }
}
