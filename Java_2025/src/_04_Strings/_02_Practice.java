package _04_Strings;

import java.util.ArrayDeque;
import java.util.Queue;

public class _02_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("India is the");
		sb.append("Developing country");
		System.out.println(sb);
		sb.insert(12, " Most ");
		System.out.println(sb);
		sb.setCharAt(13, 'm');
		System.out.println(sb);
		
		sb.delete(13, 18);
		System.out.println(sb);
		
			
		Queue<Integer> que = new ArrayDeque<Integer>();
		que.add(22);
//		que.add(null);
		que.add(89);
//		que.add(null);
		System.out.println(que);
			
			
		
	}

}
