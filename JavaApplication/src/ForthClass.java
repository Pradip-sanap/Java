

interface OneInterface {
	int age = 0;
	void eat();
	void talk();
}
interface TwoInterface {
	int age = 23;
	void eat();
	void walk();
}

class MyClass implements OneInterface, TwoInterface{
	
	public void show() {
		
		System.out.println(TwoInterface.age);
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
}

public class ForthClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
