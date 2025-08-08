package Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}

public class _1_ArrayList {

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<>();
		marks.add(80);
		marks.add(70);
		marks.add(90);
		marks.add(2, 85);
		marks.addFirst(50);
		marks.addLast(95);
		marks.add(90);

		System.out.println(marks.toString());
		ArrayList<Integer> jj = new ArrayList<Integer>();
//		marks.forEach((ele)->{
//			System.out.println(ele);
//			jj.add(ele);
//		});
//		System.out.println(jj);
		marks.replaceAll((e) -> e%2==0 ? e*2:e*0);
		System.out.println(marks);

//		System.out.println(marks.get(0));
//		System.out.println(marks.getFirst());
//		System.out.println(marks.getLast());

//		List<Integer> sublist = marks.subList(1, 4);
//		System.out.println(sublist);

//		marks.clear();
//		System.out.println("Clear() : "+ marks);

//		System.out.println("Contain() : "+ marks.contains(90));

//		System.out.println(marks.indexOf(90));
//		System.out.println(marks.lastIndexOf(90));
//		System.out.println(marks.isEmpty());

//		Object[] marksAsArray = marks.toArray();
//		for(Object e: marksAsArray) {
//			System.out.print(e + " ");
//		}

//		System.out.println(marks.remove(6));
//		System.out.println(marks.removeFirst());
//		System.out.println(marks.removeLast());

//		System.out.println(marks.size());

//		marks.sort(Comparator.naturalOrder());
//		marks.sort(Comparator.reverseOrder());

//		System.out.println(marks.hashCode());
//		
//		System.out.println(marks.toString());

		// -------equals()------------
//		ArrayList<Person> arr1 = new ArrayList<>();
//		arr1.add(new Person("Ramu", 30));
//		ArrayList<Person> arr2 = arr1; 
//		arr2.add(new Person("Ramu", 30));
//		arr2.add(new Person("Shamu", 20));
		
//		System.out.println(arr1);
//		System.out.println(arr2);
		
//		System.out.println(arr1.equals(arr2));
		
		
		
		

	}

}
