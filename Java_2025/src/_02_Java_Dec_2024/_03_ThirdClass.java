package _02_Java_Dec_2024;


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
	public String toString() {
		return "MyClass1 [age=" + age + "]";
	}

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
interface Remote{
	void volumebtn();
	void powerbtn();
	void offbtn();
}

class Philips implements Remote{

	@Override
	public void volumebtn() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "Philips []";
	}

	void up() {
		
	}
	void down() {
		
	}
	void left() {
		
	}
	void right() {
		
	}

	@Override
	public void powerbtn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void offbtn() {
		// TODO Auto-generated method stub
		
	}
	
}

public class _03_ThirdClass {
	
	void check() {
		Remote r = new Philips();
		Philips p = new Philips();
	}
	
	public static void main(String[] args) {  
//		Person person = new Person();
//        
//        person.setName("John");
//        person.setAge(25);
//        
//        System.out.println("Name: " + person.getName());
//        System.out.println("Age: " + person.getAge());
		
//		Elephant a = new Elephant();
//		a.eat();
//		a.live();
		
		Animal a = new Animal();
		a.eat();
		a.live();
		
		Elephant e = new Elephant();
		e.eat();
		e.live();
		
		Object obj = new Object();
		
	}

}
