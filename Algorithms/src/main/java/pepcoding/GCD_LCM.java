package pepcoding;
public class GCD_LCM {

    public static void main(String[] args) {
        // find GCD & LCM of two numbers
        // eg. 24 , 18
        // GCD= 6   LCM = (a x b) / GCD

        int num1 = 24;
        int num2 = 18;

        int on1 = 24;
        int on2 = 18;


        int GCD = 0;
        while(num2 != 0) {

            int temp = num1 % num2;
            if(temp==0){
                GCD = num2;
                break;
            }
            num1 = num2;
            num2 = temp;

        }

        if(GCD > 0){
            System.out.println("GCD = "+ GCD);
        }else {
            System.out.println("GCD is not possible!!");
        }


        //--------------LCM---------------
        if(GCD > 0) {
            int LCM = (on1 * on2 ) / GCD;
            System.out.println("LCM = "+ LCM);
        }
    }
}
