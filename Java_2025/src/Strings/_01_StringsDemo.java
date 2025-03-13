package Strings;

import java.util.Arrays;

public class _01_StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Pradip Laxman Sanap";
		System.out.println(name.charAt(5));
		System.out.println(name.length());
		System.out.println(name.substring(7, 13));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		String addr = "  83/D, Gandhi road. 421329      ";
		System.out.println(addr.trim().length());
		
		String str1 = "Hii aaa, Who give aaa name to you?";
//		String s = str1.replace('a', 'b');
//		System.out.println(s);
		boolean check = str1.contains("aaa");
		System.out.println(check);
		int index = str1.indexOf("aaa", 5);
		System.out.println(index);
		
		String s1 = "India";
		String s2 = "india";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String str3 = "apple,banana,pineapple,berry,cherry";
		String[] fruits = str3.split(",");
		System.out.println(Arrays.toString(fruits));
	}

}
