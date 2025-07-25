package pepcoding.Stack;

import java.util.Stack;

public class duplicateBrackets {
    public static void main(String[] args) {
        //check the duplicate breacket in expression which are extra.
        String str = "((a+b)+(c+d))";
//        String str = "(a+b)+((c+d))";

        Stack<Character> st = new Stack<Character>();
        int i=0;
        boolean flag = true;
        while(i < str.length()) {
            if(str.charAt(i) == ')' ) {
                if(st.peek()=='('){
                    flag = false;
                    break;
                }
//                int removeItem = 0;

                while(st.peek() != '(' && !st.isEmpty()){
//                    removeItem++;
                    st.pop();
                }
                st.pop();
            } else {
                st.push(str.charAt(i));
            }
            i++;
        }

        System.out.println(flag);


    }
}
