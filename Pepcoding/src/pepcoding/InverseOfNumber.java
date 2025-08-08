package pepcoding;

public class InverseOfNumber {
    public static void main(String[] args) {
        long no = 21453;

        long counter = 0;
        long ans = 0;
        while(no != 0){
            counter++;
//            System.out.println(counter);
            long digit = no % 10;
//            System.out.println("Digit->"+ digit);
            long value = (long) Math.pow(10, (digit - 1));
            value = value * counter;
//            System.out.println("value->"+ value);
            ans = ans + value;
//            System.out.println("ans->"+ans);

            no /= 10;
        }

//        System.out.println((long)Math.pow(2, 3));

        System.out.println(ans);

    }
}
