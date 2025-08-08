package pepcoding.Stack;

import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        int[] hist = {6, 2, 5, 4, 5, 1, 6};
        int N = hist.length;

        int area = 0;

        for (int i = 0; i < N; i++) {
            Stack<Integer> st = new Stack<>();
            System.out.print("{ i="+i);
            int count=1;
            int j=i;
            while(j<N-1) {
                if(hist[j+1] < hist[i]){
                    break;
                }
                count++;
                j++;
            }
            if(j==i) count=1;
            j=i;
            while(j>0){
                if(hist[j-1] < hist[i]){
                    break;
                }
                count++;
                j--;
            }
            if(j==i) count=1;
            System.out.print(" ,count="+count );
            int height = hist[i];
            int width = (count);
            System.out.print(" ,height="+height+" ,width="+width);
            System.out.print(" ,area="+height * width);
            area = Math.max(area, height * width);
            System.out.println("   ,Max-area="+area);
        }

        System.out.println(area);
    }
}
