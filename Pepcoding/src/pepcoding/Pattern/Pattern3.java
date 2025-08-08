package pepcoding.Pattern;

public class Pattern3 {

    public static void main(String[] args) {
/*
           *
          ***
         *****
          ***
           *
*/


        int N=5;

        int space = N/2 ;
        int len = 1;
        for(int i=0; i<N; i++) {

            for(int j=0; j<space; j++) {
                System.out.print(" ");
            }

            //print star
            for(int l=0; l<len; l++){
                System.out.print("*");
            }

            if(i < N/2){
                len +=2;
                space--;
            }else{
                len -= 2;
                space++;
            }
            System.out.println();

        }
    }
}
