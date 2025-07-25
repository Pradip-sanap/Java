class Animal1 {
	String name = "animal";

	Animal1(String name) {
//		this.name = name;
		System.out.println("Animal constructor called: " + name);
	}

}

class Dog extends Animal1 {
	String name = "Dog";

	Dog(String name) {
		// Calling superclass constructor using super()
		super(name);
		System.out.println("Dog constructor called: " + name);
	}
	public void print() {
		System.out.println("Name  ->"+ super.name);
	}

}

class BMC2 extends Worker {
	protected void print() {
//		System.out.println("privateVar->", privateVar);
		System.out.println("protectedVar->"+ protectedVar);
		System.out.println("publicVar->"+ publicVar);
		System.out.println("defaultVar->"+ defaultVar);
	}
}

public class SixClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dog g = new Dog("Elephant");
//		g.print();
		
		BMC2 b = new BMC2();
		b.print();
	}

}
