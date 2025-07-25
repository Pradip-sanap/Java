package default_Class_methods;

public class IntegerClassMethods {

    public static void main(String[] args) {
        int num = Integer.parseInt("A", 16);
        System.out.println(num);

        System.out.println(Integer.compare(20, 10));


        System.out.println(Integer.rotateLeft(4, 2));;
        System.out.println(Integer.rotateRight(4, 2));;

        System.out.println(Integer.bitCount(14));;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Character.getNumericValue('A'));;

        System.out.println(Double.parseDouble("33.45"));

        System.out.println(Double.sum(10.33, 4.2));

        System.out.println(Double.isNaN(0.0 / 0.0));
        System.out.println(0/3);


    }
}
