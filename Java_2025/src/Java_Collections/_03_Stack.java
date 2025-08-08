package Java_Collections;

import java.util.Stack;

public class _03_Stack {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		st.push(8);
		
		st.pop();
		st.peek();
		System.out.println(st.isEmpty());;
		
		System.out.println(st);
		

	}

}
