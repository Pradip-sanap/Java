package pepcoding.Stack;

import java.util.Arrays;
import java.util.Stack;

public class FindNextGreaterElement {
    public static void main(String[] args) {
        int [] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        int N = arr.length;
        Stack<Integer> st = new Stack<>();

        int[] result = new int[N];
        st.push(arr[N-1]);
        result[N-1] = -1;

        for(int i=N-2; i>=0; i--) {
//            System.out.println(arr[i]);
            if(arr[i] < st.peek() ) {
                result[i] = st.peek();
                st.push(arr[i]);
//                print(arr, result, st);
            }
            else if(arr[i] == st.peek()){
                result[i] = st.peek();
//                print(arr, result, st);
            }
            else if(arr[i] > st.peek()) {
                while(!st.isEmpty() && arr[i] > st.peek()){
                    st.pop();
                }
                if(!st.isEmpty()){
                    result[i] = st.peek();
                }else {
                    result[i] = -1;
                    st.push(arr[i]);
                }
//                print(arr, result, st);
            }
        }

        System.out.println(Arrays.toString(result));
    }

    static  void print(int[] arr, int[] re, Stack<Integer> st) {
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(re));
        System.out.println(st);
    }
}
