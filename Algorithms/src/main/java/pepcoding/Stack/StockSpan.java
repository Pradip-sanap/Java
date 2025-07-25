package pepcoding.Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
//        Find the span of array

        int[] stock = {100, 90, 95, 70, 75, 80, 60, 100};
        int N = stock.length;

        Stack<Integer> st = new Stack<>();
//        st.push(0);
        int[] span = new int[N];
//        span[0] = 1;

        for (int i = 0; i < N; i++) {
            while(!st.isEmpty() && stock[i] >= stock[st.peek()]){
                st.pop();
            }

            if(!st.isEmpty()){
                span[i] = i - st.peek();
            }else{
                span[i] = i+1;
            }
            st.push(i);
        }

        System.out.println(Arrays.toString(span));
    }

}
