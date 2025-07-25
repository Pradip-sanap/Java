

class Person {
	private String name;
	private int age;
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
}

class Animal {
	public void eat() {
		System.out.println("non-veg");
	}
	public void live() {
		System.out.println("jungle");
	}
}

class Elephant extends Animal {
	public void eat() {
		System.out.println("Vegg");
	}
}

interface MyInterface {
	void move();
	void run();
}

class MyClass1 implements MyInterface{
	
	int age;

	@Override
	public void move() {
	 
		
	}

	@Override
	public void run() {
		 
		
	}
	
}

abstract class Employee{
	protected int salary = 24000;
	public void empSalary() {
		System.out.println(this.salary);
	}
	
	public abstract void bonus();
}

class Pradip extends Employee{

	@Override
	public void bonus() {
		System.out.println(this.salary);
		
	}
	
}

public class ThirdClass {

	public static void main(String[] args) {  
//		Person person = new Person();
//        
//        person.setName("John");
//        person.setAge(25);
//        
//        System.out.println("Name: " + person.getName());
//        System.out.println("Age: " + person.getAge());
		
		Elephant a = new Elephant();
		a.eat();
		a.live();
	}

}
