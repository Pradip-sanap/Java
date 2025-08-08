package pepcoding;

public class digitFrequencyCoun {
    public static void main(String[] args) {
        long num = 8293472409234l;

        int k = 4;

        int frequency = getFrequency(num, k);

        System.out.println("Frequency of "+k+" is :"+frequency);

    }
    public static int getFrequency(long num, int k){
        int count=0;
        while(num!=0){
            long d = num%10;
            if(k == d) {
                count++;
            }
            num /= 10;
        }

        return count;
    }
}
