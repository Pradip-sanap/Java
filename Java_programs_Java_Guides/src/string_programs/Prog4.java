package string_programs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "This is a test. This test is easy.";
//		
//		String[] words = str.toLowerCase().split("\\W+");
//		
////		System.out.println(Arrays.toString(words)); 
////		for (String string : words) {
////			System.out.print(string.length()+" ");
////		}
//		
//		HashMap<String, Integer> wordmap = new HashMap<>();
//		for (String word : words) {
//			wordmap.put(word, wordmap.getOrDefault(word, 0) + 1);
//        }
//		
//		System.out.println(wordmap);
//		for (Map.Entry<String, Integer> entry : wordmap.entrySet()) {
//            if (entry.getValue() > 1) {
//                System.out.print(entry.getKey() + " "); 
//            }
//        }
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter your age:");
//		int age = sc.nextInt();		
//		
//		System.out.println(age);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1, 15);
		
		System.out.println(list);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(101);
		list2.add(201);
		
		list.addAll(0, list2);
		System.out.println(list);
		
		ArrayList<Integer> sublist = new ArrayList<Integer>();
		sublist.add(10);
//		list.remove();
		System.out.println(list);
		
		
		
		

	}

}
