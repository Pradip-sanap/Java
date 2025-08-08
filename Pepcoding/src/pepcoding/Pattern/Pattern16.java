package pepcoding.Pattern;

public class Pattern16 {
    public static void main(String[] args) {
/*
        Print W
        *       *
        *       *
        *   *   *
        * *   * *
        *       *

        *             *
        *             *
        *      *      *
        *     * *     *
        *   *     *   *
        * *         * *
        *             *
*/

        int N= 7;
        int index = 1;
        int mid = N/2;
        for (int i = 0; i < N ; i++) {
            int j = 0;
            int space=mid-1;
            boolean flag=false;
//            while(j < N) {
//                if(j==0 || j==N-1){
//                    System.out.print("*");
//                }
//                if(i < N/2){
//                    System.out.print(" ");
//                }
//                else if(flag){
//                    int k=0;
//                    while(k<space){
//                        System.out.print(" ");
//                        k++;
//                    }
//                }else if(i==N/2 && j==N/2){
//                    System.out.print("*");
//                    space -= 1;
//                    flag=true;
//                }else if(i>N/2 && (j==N/2+index || j==N/2-index)){
//                    System.out.print("*");
//                    index++;
//                }
//                j++;
//            }

////            int space = N/2-1;
            while(j < N) {
                if(j==0 || j==N-1){
                    System.out.print("* ");
                }
                else if(i==mid && j==mid){
                    System.out.print("* ");
                }
                else if(i > mid ){
                    if((j == mid - index || j==mid+index) && j < N-1 ){
                        System.out.print("* ");

                    }else {
                        System.out.print("  ");
                    }
                }
                else {
                    System.out.print("  ");
                }
                j++;
            }
            if(i > mid){
                index++;
            }

            System.out.println();
        }
    }
}
