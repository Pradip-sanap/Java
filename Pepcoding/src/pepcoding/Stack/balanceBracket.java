package pepcoding.Stack;

import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class balanceBracket {
    public static void main(String[] args) {
//        [(a+b) + {(c+d) * (e/f)}] = true
//        [(a+b) + {(c+d) * (e/f)]}  = false
//        [(a+b) + {(c+d+ * (e/f)} = false

//        String str = "[ (a+b) + { (c+d) * (e/f) } ]";
        String str = "[(a+b) + {(c+d) * (e/f)]}";
        Stack<Character> st = new Stack<>();

        int i=0;
        boolean var=true;
        while(i < str.length()) {
            char ch = str.charAt(i);
            if(checkOpeningBracket(ch)){
                st.push(ch);
            }

            if(ch==')'){
                var = handleClosingBracket(ch, st);
            }
            else if(ch=='}' ){
                var = handleClosingBracket(ch, st);
            }
            else if(ch==']'){
                var = handleClosingBracket(ch, st);
            }

            if(!var) break;


            i++;
        }

        if(st.isEmpty() && var) System.out.println("Balanced expression !");
        else System.out.println("Not balanced");
    }

    static boolean checkOpeningBracket(char ch){
        if(ch=='(' || ch=='{' || ch=='['){
            return true;
        }
        return false;
    }

    static boolean handleClosingBracket(char ch, Stack<Character> st){
        if(st.isEmpty()){
            return false;
        }
        char top = st.peek();
        if (ch == ')' && top != '(') {
            return false;
        } else if (ch == '}' && top != '{') {
            return false;
        } else if (ch == ']' && top != '[') {
            return false;
        }
        st.pop();
        return true;
    }

}
