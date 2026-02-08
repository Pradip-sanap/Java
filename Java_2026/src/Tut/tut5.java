package Tut;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Person { 
	int id;
	String name;
	double salary;
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Person(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class tut5 {

	public static void main(String[] args) {
		/// Priority queue
		PriorityQueue<Integer> marks = new PriorityQueue<>();
//		PriorityQueue<Integer> marks = new PriorityQueue<>(Comparator.reverseOrder());
//		marks.addAll(List.of(80, 60, 89, 79, 84, 82, 70));
//		System.out.println(marks);
//		marks.remove();
//		System.out.println(marks);
//		marks.remove();
//		System.out.println(marks);
//		marks.remove();
//		System.out.println(marks);
//		marks.remove();
//		System.out.println(marks);
//		marks.remove();
		
//		Comparator<Person> idCompare = (p1, p2) -> Integer.compare(p2.getId(), p1.getId());
		Comparator<Person> idCompare = Comparator.comparingInt(Person::getId).thenComparing(Person::getName);
		
		PriorityQueue<Person> people = new PriorityQueue<Person>(idCompare);
		people.add(new Person(2, "Ram", 80000.00));
		people.add(new Person(1, "shyam", 70000.00));
		people.add(new Person(4, "vivek", 90000.00));
		people.add(new Person(3, "zeeva", 64000.00));
		people.add(new Person(3, "ashneer", 66000.00));
		people.add(new Person(3, "shanjiv", 60000.00));
		
		 
		while (!people.isEmpty()) {
		    System.out.println(people.poll());
		}
		
		
		
		

	}

}
