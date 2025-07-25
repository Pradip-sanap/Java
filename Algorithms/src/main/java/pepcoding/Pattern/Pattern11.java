package pepcoding.Pattern;

public class Pattern11 {
    public static void main(String[] args) {
/*
         1
       2 3 2
     3 4 5 4 3
       2 3 2
         1
 */
        int N = 5;
        int space = N/2;
        int startNo = 1;
        int length = 1;
        for (int i = 1; i <= N; i++) {

            for (int j = 0; j < space; j++) {        //print spaces
                System.out.print("  ");
            }

            int num = startNo;

            // Print increasing numbers
            for (int j = 1; j <= length; j++) {
                System.out.print(num + " ");
                if (j <= length / 2) {
                    num++;
                } else {
                    num--;
                }
            }



            System.out.println();


            if(i <= (N/2)) {
                startNo++;
                space--;
                length +=2;
            }else{
                startNo--;
                space++;
                length -= 2;
            }

        }
    }
}
