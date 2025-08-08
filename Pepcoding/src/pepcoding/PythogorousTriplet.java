package pepcoding;

public class PythogorousTriplet {

    public static void main(String[] args) {
        int a = 4;      //side 1
        int b = 3;      //side 2

        int c = 5;      // side 2

        int max = 0;
//        if(a>b){
//            if(a>c){
//                max = a;
//            }else{
//                max = c;
//            }
//        }else{
//           if(b>c){
//               max = b;
//           }else{
//                max = c;
//           }
//        }
//        System.out.println(max);
        int maxNum = Math.max(a, Math.max(b, c));
        System.out.println(maxNum);
        boolean flag=false;
        if(max==a){
              flag = (a * a) == (c * c) + (b * b);
        }else if(max == b){
              flag = (b * b) == (c * c) + (a * a);
        } else {
              flag = (c *  c) == (b * b) + (a * a);

        }
        if(flag){
            System.out.println("Yes, Triplet");
        }else{
            System.out.println("Not a Triplet");
        }


        // approach 2
//        int a = 4;  // side 1
//        int b = 3;  // side 2
//        int c = 5;  // side 3
//
//        // Find the largest side
//        int maxNum = Math.max(a, Math.max(b, c));
//
//        // Identify the other two sides
//        int side1, side2;
//
//        if (maxNum == a) {
//            side1 = b;
//            side2 = c;
//        } else if (maxNum == b) {
//            side1 = a;
//            side2 = c;
//        } else {
//            side1 = a;
//            side2 = b;
//        }
//
//        // Check Pythagorean condition
//        if (maxNum * maxNum == side1 * side1 + side2 * side2) {
//            System.out.println("Yes, it is a Pythagorean triplet.");
//        } else {
//            System.out.println("No, it is not a Pythagorean triplet.");
//        }
    }
}
