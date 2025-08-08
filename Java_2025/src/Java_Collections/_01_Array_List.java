package Java_Collections;

import java.util.*;

public class _01_Array_List {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);

		// arr.replaceAll(q -> q * 3);

		System.out.println(arr);

		for (int e : arr) {
			System.out.println(e);
		}

		System.out.println("Size() = " + arr.size());

		System.out.println(arr);
		arr.remove(2);
		System.out.println("Remove 2 index = " + arr);

		System.out.println("get() = " + arr.get(1));

		arr.set(2, 44);
		System.out.println("set() = " + arr);

		arr.remove(2);
		System.out.println("remove() = " + arr);

		int idx = arr.indexOf(4);
		System.out.println("Index of 3 = " + idx);

		// int last = arr.lastIndexOf(arr);

		// create an arraylist
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("Python");
		System.out.println("Languages: " + languages);

		// create another arraylist
		ArrayList<String> programmingLang = new ArrayList<>();

		// add all elements from languages to programmingLang
		programmingLang.addAll(languages);

		System.out.println("Programming Languages: " + programmingLang);
		programmingLang.set(1, "ddddddd");
		// languages.clear();
		System.out.println("Programming Languages: " + programmingLang);
		System.out.println(languages);

		// create an arraylist
		ArrayList<Integer> number = new ArrayList<>();

		number.add(1);
		number.add(3);
		number.add(5);
		System.out.println("ArrayList: " + number);

		// create copy of number
		ArrayList<Integer> cloneNumber = (ArrayList<Integer>) number.clone();
		cloneNumber.set(1, 33);
		System.out.println("Cloned ArrayList: " + cloneNumber);
		System.out.println("ArrayList: " + number);
	}

}
