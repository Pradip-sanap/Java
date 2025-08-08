package pepcoding.Stack;

import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        // evaluate the infix expression.
        String expr = "2+3/4-(5*6)";
        Stack<Character> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();
        int i=0;
        int result=0;
        while(i < expr.length()) {
            char ch = expr.charAt(i);
            if(ch >=48 && ch <=57){
                operand.push(ch);
            }
            else {
                int precedence = getPrecedence(ch);
                if(!operator.isEmpty() && operator.peek() >= precedence){
//                    if(){
                        char optr =  operator.pop();
                        operator.push(ch);

                        int a = operand.peek();
                        operand.pop();
                        int b = operand.peek();
                        result +=  applyOp(a, b, optr);
//                    }
                }else{
                    operand.push(ch);
                }


            }
            i++;
        }

        System.out.println(result);
    }

    static int getPrecedence(char ch) {
        if(ch=='(' ){
            return 3;
        }else if(ch=='/' || ch=='*'){
            return 2;
        }else if(ch=='+' || ch=='-'){
            return 1;
        }
        return 0;
    }

    public static int applyOp(int a, int b, char op) {
        switch(op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b; // assume b != 0
        }
        return 0;
    }
}
