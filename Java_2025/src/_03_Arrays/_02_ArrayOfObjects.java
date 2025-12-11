package _03_Arrays;

import java.util.Arrays;
import java.util.List;

class Person{
	int id;
	String name;
	int age;
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
public class _02_ArrayOfObjects {

	public static void main(String[] args) {
		Person p1 = new Person(1, "John", 23);
		Person p2 = new Person(2, "Rohn", 28);
		Person p3 = new Person(3, "Lily", 25);
		Person p4 = new Person(4, "Jonny", 24);
		Person p5 = new Person(5, "Jose", 23);
		
		Person[] persons = {p1, p2, p3, p4, p5};
		for(Person p : persons) {
			System.out.println(p);
		}
		
		int[] arr = {87, 39, 91, 58, 63, 10, 39, 82};
		
//		Arrays.sort(arr);
//		System.out.println(Arrays.binarySearch(arr, 39));;
//		List<int[]> myLIst = Arrays.asList(arr);
		int[] copied = Arrays.copyOf(arr, 4);
		System.out.println(Arrays.toString(copied));
		System.out.println(Arrays.toString(arr));
		
		int[][] nested = {{1,2}, {3,2, 1}, {4, 3, 2, 1}};
		System.out.println(Arrays.deepToString(nested));
	}

}
